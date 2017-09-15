#include <stdio.h>
#include <semaphore.h>
#include <pthread.h>
#include <stdlib.h>
#include <unistd.h>
#include <time.h>
#include <semaphore.h>

int contBanho = 0;
int nadadoresLimpos = 0;
int* buffer;

sem_t chuveiros;
sem_t raias;

void *vestiario(void *arg) {
	int num_nadadores = *(int *)arg;
	sem_wait(&chuveiros);
	if (contBanho < 5 && nadadoresLimpos < num_nadadores) {
		sleep(800);
		nadadoresLimpos++;
		contBanho++;
	}
	if (contBanho < 5 && nadadoresLimpos > num_nadadores) {
		sleep(1000);
		contBanho++;
	}
	if (contBanho == 5) {
		sleep(1500);
		contBanho = 0;
	}
	sem_post(&chuveiros);
}

void piscina() {
	sem_wait(&raias);
	printf("Nadador utilizando a raia %d\n", id);
	sleep(500);
	printf("Nadador liberou a raia %d\n", id);
	sem_post(&raias);
}

int main(int argc, char *argv[]) {
	if (argc < 2) {
        printf("Use: %s [numero de nadadores]\n", argv[0]);
        return 0;
    }

    int num_nadadores = atoi(argv[1]);

    //Iniciando buffer
    buffer = malloc(sizeof(int) * 5);

    //Iniciando semáforos
    sem_init(&chuveiros, 0, 3);
    sem_init(&raias, 0, 5);

    //Cria as threads dos nadadores
    int i;
    pthread_t nadadores[num_nadadores];
    for (i = 0; i < num_nadadores; i++)
        pthread_create(&nadadores[i], NULL, vestiario, (void*)&num_nadadores);

    //Aguarda as threads terminarem
    for (i = 0; i < num_nadadores; i++)
        pthread_join(nadadores[i], NULL);

    //Libera memória do buffer
    free(buffer);

    //Destrói os semáforos
    sem_destroy(&chuveiros);
    sem_destroy(&raias);

    return 0;
}

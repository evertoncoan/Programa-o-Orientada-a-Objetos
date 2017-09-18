#include <stdio.h>
#include <semaphore.h>
#include <pthread.h>
#include <stdlib.h>
#include <unistd.h>
#include <time.h>
#include <semaphore.h>
#include <stdbool.h>

#define UNIDADE_TEMPO 0.1
#define VOLTA_PISCINA 5 * UNIDADE_TEMPO

int contBanho = 0;
int nadadoresLimpos = 0;
//int* buffer;

pthread_mutex_t mutex;

sem_t chuveiros;
sem_t raias;

bool raia1 = true;
bool raia2 = true;
bool raia3 = true;
bool raia4 = true;
bool raia5 = true;

void *vestiario() {
    printf("oi\n\n");
	/*int num_nadadores = *(int *)arg;
	sem_wait(&chuveiros);
	if (contBanho < 5 && nadadoresLimpos < num_nadadores) {
		sleep(8 * UNIDADE_TEMPO);
		nadadoresLimpos++;
		contBanho++;
	}
	if (contBanho < 5 && nadadoresLimpos > num_nadadores) {
		sleep(10 * UNIDADE_TEMPO);
		contBanho++;
	}
	if (contBanho == 5) {
		sleep(15 * UNIDADE_TEMPO);
		contBanho = 0;
	}
	sem_post(&chuveiros);*/
}

void *piscina() {
	sem_wait(&raias);

    if (raia1) {
        raia1 = false;
        printf("Nadador utilizando a raia 1\n\n");
	    sleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 1\n\n");
        raia1 = true;
        sem_post(&raias);
        pthread_exit(vestiario());
    }

    if (raia2) {
        raia2 = false;
        printf("Nadador utilizando a raia 2\n\n");
        sleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 2\n\n");
        raia2 = true;
        sem_post(&raias);
        pthread_exit(vestiario());
    }

    if (raia3) {
        raia3 = false;
        printf("Nadador utilizando a raia 3\n\n");
        sleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 3\n\n");
        raia3 = true;
        sem_post(&raias);
        pthread_exit(vestiario());
    }

    if (raia4) {
        raia4= false;
        printf("Nadador utilizando a raia 4\n\n");
        sleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 4\n\n");
        raia4 = true;
        sem_post(&raias);
        pthread_exit(vestiario());
    }

    if (raia5) {
        raia5 = false;
        printf("Nadador utilizando a raia 5\n\n");
        sleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 5\n\n");
        raia5 = true;
        sem_post(&raias);
        pthread_exit(vestiario());
    }
}

int main(int argc, char *argv[]) {
	if (argc < 2) {
        printf("Use: %s [numero de nadadores]\n", argv[0]);
        return 0;
    }

    int num_nadadores = atoi(argv[1]);

    //Iniciando buffer
    //buffer = malloc(sizeof(int) * 5);

    //Iniciando semáforos
    sem_init(&chuveiros, 0, 3);
    sem_init(&raias, 0, 5);

    //Iniciando mutex.
    pthread_mutex_init(&mutex, NULL);

    //Cria as threads dos nadadores
    int i;
    pthread_t nadadores[num_nadadores];
    for (i = 0; i < num_nadadores; i++)
        pthread_create(&nadadores[i], NULL, piscina, NULL);//(void*)&num_nadadores);

    //Aguarda as threads terminarem
    for (i = 0; i < num_nadadores; i++)
        pthread_join(nadadores[i], NULL);

    //Libera memória do buffer
    //free(buffer);

    //Destrói os semáforos
    sem_destroy(&chuveiros);
    sem_destroy(&raias);

    //Destrói os mutex
    pthread_mutex_destroy(&mutex);

    return 0;
}

#include <stdio.h>
#include <semaphore.h>
#include <pthread.h>
#include <stdlib.h>
#include <unistd.h>
#include <time.h>
#include <semaphore.h>
#include <stdbool.h>

#define UNIDADE_TEMPO 100000
#define VOLTA_PISCINA 5 * UNIDADE_TEMPO

void *vestiario();
void *piscina();
void *limpeza();

int num_nadadores;
int contBanho = 0;
int segundoBanho = 0;
//int* buffer;

pthread_mutex_t mutex1;
pthread_mutex_t mutex2;

sem_t chuveiros;
sem_t raias;

bool raia1 = true;
bool raia2 = true;
bool raia3 = true;
bool raia4 = true;
bool raia5 = true;
bool limpar = false;

void *vestiario(void *arg) {
    //printf("oi\n\n");
    int banho = *(int *)arg;

    sem_wait(&chuveiros);
    if (banho == 1) {
        printf("Primeiro banho\n\n");
        usleep(8 * UNIDADE_TEMPO);
        pthread_mutex_lock(&mutex1);
        contBanho++;
        pthread_mutex_unlock(&mutex1);
        if (contBanho != 5)
            sem_post(&chuveiros);
        else
            limpar = true;
        pthread_exit(piscina());
    }

    if (banho == 2) {
        printf("Segundo banho\n\n");
        usleep(10 * UNIDADE_TEMPO);
        pthread_mutex_lock(&mutex2);
        segundoBanho++;
        contBanho++;
        pthread_mutex_unlock(&mutex2);
        if (contBanho != 5)
            sem_post(&chuveiros);
        else
            limpar = true;
        pthread_exit(NULL);
    }

    printf("tchau\n\n");
    //sem_post(&chuveiros);
}

void *piscina() {

    sem_wait(&raias);
    
    int banho = 2;

    if (raia1) {
        raia1 = false;
        printf("Nadador utilizando a raia 1\n\n");
        usleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 1\n\n");
        raia1 = true;
        sem_post(&raias);
        pthread_exit(vestiario((void*)&banho));
    }

    if (raia2) {
        raia2 = false;
        printf("Nadador utilizando a raia 2\n\n");
        usleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 2\n\n");
        raia2 = true;
        sem_post(&raias);
        pthread_exit(vestiario((void*)&banho));
    }

    if (raia3) {
        raia3 = false;
        printf("Nadador utilizando a raia 3\n\n");
        usleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 3\n\n");
        raia3 = true;
        sem_post(&raias);
        pthread_exit(vestiario((void*)&banho));
    }

    if (raia4) {
        raia4= false;
        printf("Nadador utilizando a raia 4\n\n");
        usleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 4\n\n");
        raia4 = true;
        sem_post(&raias);
        pthread_exit(vestiario((void*)&banho));
    }

    if (raia5) {
        raia5 = false;
        printf("Nadador utilizando a raia 5\n\n");
        usleep(10 * VOLTA_PISCINA);
        //printf("Nadador liberou a raia 5\n\n");
        raia5 = true;
        sem_post(&raias);
        pthread_exit(vestiario((void*)&banho));
    }
}

void *limpeza() {
    while (!limpar) {
        usleep(1000);
        if (segundoBanho == num_nadadores) {
            printf("Simulação terminada.\n\n");
            pthread_exit(NULL);
        }
    }
    printf("Limpando banheiro\n\n");
    contBanho = 0;
    usleep(15 * UNIDADE_TEMPO);
    sem_post(&chuveiros);
    limpar = false;
    limpeza();
}

int main(int argc, char *argv[]) {
    if (argc < 2) {
        printf("Use: %s [numero de nadadores]\n", argv[0]);
        return 0;
    }

    num_nadadores = atoi(argv[1]);

    //Iniciando buffer
    //buffer = malloc(sizeof(int) * 5);

    //Iniciando semáforos
    sem_init(&chuveiros, 0, 3);
    sem_init(&raias, 0, 5);

    //Iniciando os mutexes.
    pthread_mutex_init(&mutex1, NULL);
    pthread_mutex_init(&mutex2, NULL);

    //Cria a thread do zelador
    pthread_t zelador;
    pthread_create(&zelador, NULL, limpeza, NULL);

    //Cria as threads dos nadadores
    int i;
    int banho = 1;
    pthread_t nadadores[num_nadadores];
    for (i = 0; i < num_nadadores; i++)
        pthread_create(&nadadores[i], NULL, vestiario, (void*)&banho);//(void*)&num_nadadores);

    //Aguarda as threads dos nadadores terminarem
    for (i = 0; i < num_nadadores; i++)
        pthread_join(nadadores[i], NULL);

    //Aguarda a thread do zelador terminar
    pthread_join(zelador, NULL);

    //Libera memória do buffer
    //free(buffer);

    //Destrói os semáforos
    sem_destroy(&chuveiros);
    sem_destroy(&raias);

    //Destrói os mutexes
    pthread_mutex_destroy(&mutex1);
    pthread_mutex_destroy(&mutex2);

    return 0;
}

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

void vestiario(void *arg) {
	int nadadores = *(int *)arg;
	sem_wait(&chuveiros);
	if (contBanho < 5 && nadadoresLimpos < nadadores) {
		sleep(800);
		nadadoresLimpos++;
		contBanho++;
	}
	if (contBanho < 5 && nadadoresLimpos > nadadores) {
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
	sleep(500);
	sem_post(&raias);
}

int main(int argc, char *argv[]) {
	if (argc < 2) {
        printf("Use: %s [numero de nadadores]\n", argv[0]);
        return 0;
    }

    sem_init(&chuveiros, 0, 3);
    sem_init(&raias, 0, 5);


}

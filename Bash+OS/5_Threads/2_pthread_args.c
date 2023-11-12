#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <string.h>
 
#define ERROR_CREATE_THREAD -11
#define ERROR_JOIN_THREAD   -12
#define BAD_MESSAGE         -13
#define SUCCESS               0

// 1
typedef struct someArgs_tag {
    long id;
    const char *msg;
    long out;
} someArgs_t;
 
// 2
void* helloWorld(void *args) {
    someArgs_t *arg = (someArgs_t*) args;
    long len;

    if (arg->msg == NULL) {
        return (void *) BAD_MESSAGE;
    }
 
    len = strlen(arg->msg);
    printf("%ld %s\n", arg->id, arg->msg);
    arg->out = len;
 
    return SUCCESS;
}
 
#define NUM_THREADS 4
 
int main() {
    // 3
    pthread_t threads[NUM_THREADS];
    long status;
    long i;
    long status_addr;
    someArgs_t args[NUM_THREADS];
    const char *messages[] = {
        "First",
        "Second",
        "Third Message",
        "Fourth Message"
    };
    
    // 4
    for (i = 0; i < NUM_THREADS; i++) {
        args[i].id = i;
        args[i].msg = messages[i];
    }
    
    // 5
    for (i = 0; i < NUM_THREADS; i++) {
        status = pthread_create(&threads[i], NULL, helloWorld, (void*) &args[i]);
        if (status != 0) {
            printf("main error: can't create thread, status = %ld\n", status);
            exit(ERROR_CREATE_THREAD);
        }
    }
 
    printf("Main Message\n");
    
    // 6
    for (i = 0; i < NUM_THREADS; i++) {
        status = pthread_join(threads[i], (void**)&status_addr);
        if (status != SUCCESS) {
            printf("main error: can't join thread, status = %ld\n", status);
            exit(ERROR_JOIN_THREAD);
        }
        printf("joined with address %ld\n", status_addr);
    }
 
    for (i = 0; i < NUM_THREADS; i++) {
        printf("thread %ld arg.out = %ld\n", i, args[i].out);
    }
 
    return 0;
}
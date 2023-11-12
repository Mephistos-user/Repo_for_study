#include <stdio.h>
#include <unistd.h> // библиотека дает возможность использовать fork() - создатель процессов

int main()
{
    // make two process which run same
    // program after this instruction
    fork();

    printf("Hello world!\n");
    return 0;
}

// make FILE=1_process.cpp - запускает процесс через терминал
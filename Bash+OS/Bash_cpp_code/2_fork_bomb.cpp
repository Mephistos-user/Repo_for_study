#include <stdio.h>
#include <unistd.h> // библиотека дает возможность использовать fork() - создатель процессов

int main()
{
    fork();
    fork();
    fork();

    printf("Hello\n");
    return 0;
}
// make FILE=2_process.cpp - запускает процесс через терминал

/*
      L1
    /   \
   L2   L2
  / \   / \
 L3 L3 L3 L3
 
*/
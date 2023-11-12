#include <stdio.h>
#include <unistd.h> // библиотека дает возможность использовать fork() - создатель процессов

int main()
{
    int i;

    printf("I am EXEC.c called by execvp() ");
    printf("\n");
    return 0;
}
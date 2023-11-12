#include <stdio.h>
#include <stdlib.h>//??????
#include <unistd.h> // библиотека дает возможность использовать fork() - создатель процессов

int main()
{
    // A null terminated array of character
    // pointer
    char *args[] = {"./EXEC", "./1_fork", NULL};//аргумены задаются только списком, последний элемент обязательно NULL
    execv(args[0], args);//по номеру аргумента (индекса) можно задавать исполняемый файл (args[0] - EXEC, args[1] - 1_fork)

    /*все действия игнорируются после execvp() вызванные как текущий
     процесс(execDemo.c) заменяются на новый процесс (EXEC.c)*/

    printf("Ending---------");
    return 0;
}
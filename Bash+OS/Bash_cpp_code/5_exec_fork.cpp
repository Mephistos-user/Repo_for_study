// условное ветвление процессов и подмена процесса

#include <stdio.h>
#include <unistd.h> // библиотека дает возможность использовать fork() - создатель процессов

void forkexemple()
{
    // child process because return value zero
    if (fork() == 0)//функция fork по умолчанию возвращает 0 если это процесс потомка
    {               //т.е процесс который мы создали
        char *args[] = {"./EXEC", "./1_fork", NULL};//аргумены задаются только списком, последний элемент обязательно NULL
        execv(args[0], args);//по номеру аргумента (индекса) можно задавать исполняемый файл (args[0] - EXEC, args[1] - 1_fork)

    }
    // parrent process because return value non-zero
    else//функция fork возвращает другое значение (не 0) если это процесс не потомка
    {   //т.е родительский процесс
        pid_t parrent = getppid();//получить ID родительского (parrent) процесса
        printf("Hello from Parrent!, My ID is %d\n", parrent);
    }
}

int main()
{
    forkexemple();
    return 0;
}
// условное ветвление процессов

#include <stdio.h>
#include <unistd.h> // библиотека дает возможность использовать fork() - создатель процессов

void forkexemple()
{
    // child process because return value zero
    if (fork() == 0)//функция fork по умолчанию возвращает 0 если это процесс потомка
    {               //т.е процесс который мы создали
        pid_t child = getpid();//получить ID процесса
        printf("Hello from Child!, My ID is %d\n", child);// %d - ссылка на переменную в тексте (child) 
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
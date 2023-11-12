#include <stdlib.h> // команда exit(0)
//#include <sys/types.h>
#include <unistd.h>

int main()
{

    pid_t child_pid;

    // создание дочернего процесса

    child_pid = fork();

    if (child_pid > 0) {
        // это родительский процесс - делаем минутную паузу 

        sleep(60);
    } 
    else {
        // это дочерний процесс - немедленно завершаем работу

        exit(0); // типа SIGKILL -резкое завершение процесса
    }

return 0;

// посмотреть процессы-зомби - команда в терминале: ps aux | grep defunct
// посмотреть родительские процессы - команда в терминале: ps -xal | grep defunct
// kill - завершает процесс по типу SIGTERM
// kill -9 - завершает процесс по типу SIGKILL
/* mephist+    7270  0.0  0.0  17564   716 pts/0    D+   21:00   0:00 grep --color=auto defunct
ЭТО нормально, auto defunct - это один системный процесс */ 

}
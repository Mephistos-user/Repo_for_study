#include <signal.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/un.h>
#include <time.h>
#include <unistd.h>
#include <errno.h>

//#define SOCKET_NAME "/home/mephistos/my_project/FirstRepoMeph/practical_task_Bash/6_pract_tsk_bash/Filesocket/server.soc"
///home/mephistos/my_project/FirstRepoMeph/practical_task_Bash/6_pract_tsk_bash/Filesocket/server.soc
#define BUF_SIZE 256
char SOCKET_NAME [256];
static int sfd;

void cleanup_socket(int sockfd)
{
    close(sockfd);
    unlink(SOCKET_NAME);
}

void sighandler(int signum)
{
    cleanup_socket(sfd);
    exit(0);
}

int main(void)
{
    //определяем текущую дирректорию
    char temp_name[256];
    getcwd(SOCKET_NAME, 256);
    strcat(SOCKET_NAME, "/");
    printf("Текущая дирриктория:\n%s\n", SOCKET_NAME);

    printf("Введите название сокета:\n");
    scanf("%s", temp_name);
    
    char _soc[5] = ".soc";
    strncat(temp_name, _soc, 5);
    strncat(SOCKET_NAME, temp_name, 256);

    sfd = socket(AF_UNIX, SOCK_DGRAM, 0);
    if (sfd == -1)
    {
        perror("socket call error");
        return errno;
    }

    struct sockaddr_un sock_addr;
    sock_addr.sun_family = AF_UNIX;

    strncpy(sock_addr.sun_path, SOCKET_NAME, strlen(SOCKET_NAME));
    printf("sun_path=%s, len=%ld\n", sock_addr.sun_path, strlen(SOCKET_NAME));
    if (bind(sfd, (struct sockaddr *)&sock_addr, sizeof(sock_addr)) == -1)
    {
        perror("bind call error");
        cleanup_socket(sfd);
        return errno;
    }

    if (signal(SIGINT, sighandler) == SIG_ERR)
    {
        perror("signal call error");
        cleanup_socket(sfd);
        return errno;
    }

    char msg[BUF_SIZE];
    for (;;)
    {
        size_t bytes = recv(sfd, msg, sizeof(msg) - 1, 0);
        if (bytes == -1)
        {
            perror("recv call error");
            cleanup_socket(sfd);
            return errno;
        }
        msg[bytes] = '\0';
        printf("Got message: %s\n", msg);
    }
}
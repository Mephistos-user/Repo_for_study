#include <stdio.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/un.h>
#include <unistd.h>
#include <errno.h>
#include <stdlib.h>

//#define SOCKET_NAME "/home/mephistos/my_project/6_Sockets/Filesocket/server.soc"
char SOCKET_NAME[256];

int main()
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

    printf("Имя сокета\n%s\n", SOCKET_NAME);
  
    int sfd = socket(AF_UNIX, SOCK_DGRAM, 0);
    if (sfd == -1)
    {
        perror("socket call error");
        return errno;
    }

    struct sockaddr_un addr;
    addr.sun_family = AF_UNIX;

    strcpy(addr.sun_path, SOCKET_NAME);
    printf("sun_path=%s, len=%ld\n", addr.sun_path, strlen(SOCKET_NAME));
    if (connect(sfd, (struct sockaddr *)&addr, sizeof(addr)) == -1)
    {
        perror("Can't set dest address");
        return errno;
    }

    char *msg = temp_name;
    if (send(sfd, msg, strlen(msg), 0) == -1)
    {
        perror("send call error");
        return errno;
    }
    else
    {
        printf("send message:\nИмя сокета: %s\n", msg);
    }
 
    close(sfd);

    return 0;
}
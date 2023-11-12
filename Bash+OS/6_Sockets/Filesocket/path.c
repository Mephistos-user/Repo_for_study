#include <stdio.h>
#include <unistd.h>
#include <string.h>
//определяем текущую дирректорию запуска исполняемого файла
int	main(int argc, char **argv)
{
    char the_path[256];
    getcwd(the_path, 256);
    strcat(the_path, "/");
    //strcat(the_path, argv[0]);

    printf("%s\n", the_path);
    
    return 0;
}

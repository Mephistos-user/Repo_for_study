#include <fstream>

int	main()
{
    std::ofstream ofile("test.txt", std::ios::out);
    if (ofile.is_open())
    {
        ofile << "Hello, world";
    }   
    
    return 0;
}
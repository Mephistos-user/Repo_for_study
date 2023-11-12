#include <fstream>
#include <iostream>

using namespace std;

int	main()
{
    ifstream ifile("test.txt", ios::in);
    if (ifile.is_open())
    {
        string line;
        while (ifile >> line)
        {
            cout << line << '\n';
        }
    }   
    
    return 0;
}
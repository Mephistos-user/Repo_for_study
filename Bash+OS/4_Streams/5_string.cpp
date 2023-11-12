#include <string>
#include <sstream>
#include <iostream>

using namespace std;

int	main()
{
    string coordinates("(54.847830, 83.094392)");

    stringstream ss(coordinates);
    double lat, lon;
    ss.ignore(1); // skip '('
    ss >> lat;
    ss.ignore(2); // skip ", " 
    ss >> lon;
    cout << lat << ", " << lon << endl;
    
    return 0;
}
//gcc main.cpp -o a.out - компиляция исполняемого файла
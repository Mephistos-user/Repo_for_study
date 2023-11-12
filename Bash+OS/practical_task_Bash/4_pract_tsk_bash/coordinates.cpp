#include <string>
#include <sstream>
#include <fstream>
#include <iostream>

using namespace std;

int	main()
{
    // открываем исходный файл с координатами
    ifstream ifile("coordinates.txt", ios::in);
    if (ifile.is_open())
    {
        
        string coordinates;
        // построчно проходим по содержимому файла
        while (getline(ifile, coordinates))
        {
            // запускаем строковый поток ss
            stringstream ss(coordinates);
            
            double lat, lon;
            ss.ignore(1); // skip '('
            ss >> lat;
            ss.ignore(2); // skip ", " 
            ss >> lon;
            
            // проверяем условия попадания координат в заданный квадрат и выводим правильные результаты
            if (lat >= 50 & lat <= 80)
            {
                if (lon >= 20 & lon <= 45)
                {
                    cout << fixed << lat << ", " << lon << endl;
                }
            }
            
        }
    } 

    return 0;
}
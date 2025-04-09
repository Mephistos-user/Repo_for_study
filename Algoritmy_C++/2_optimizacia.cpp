#include <iostream>

using namespace std;


int main()
{
    int a[11];
    for (int i = 0; i < 10; i++)
    {
        a[i] = i;
    }
    int x = 7;
    bool have = 0;
    for (int i = 0; i < 10; i++)
    {
        if (a[i] == x) have = true;
    }
    // оптимизируем время
    have = 0;
    for (int i = 0; i < 10; i++)
    {
        if (a[i] == x) { 
            have = true;
            break;
        }
    }
    // оптимизируем время (но ухудшается читаемость)
    a[10] = x;
    have = 0;
    int i;
    for (i = 0; a[i] != x; i++)
    {
        if (i < 10) { 
            have = true;
        }
    }
}
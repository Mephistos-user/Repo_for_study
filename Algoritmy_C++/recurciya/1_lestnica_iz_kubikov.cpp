// лестница из кубиков
#include <algorithm>
#include <iostream>
#include <vector>


using namespace std;

int res; // количество вариантов построения лестницы

void rec(int num, int ost) // num - количество кубиков в ступене , ost - остаток доступных кубиков
{
    for (int k = num + 1; k <= ost; k++)
    {
        if (ost == 0)
        {
            res++;
            return;
        }
        rec(k, ost - k);
    }
}

int main()
{
    int n; // количество кубиков
    cin >> n;
    rec(0, n);
    cout << res;
}
// частично персистентный массив
#include <iostream>
#include <vector>
#include <set>

using namespace std;

const int INF = 1e9;

int main()
{
    int n, m; // размер массива, количество запросов
    cin >> n >> m;

    // вектор сетов пар - пара = версия, значение
    vector<set<pair<int, int>>> arr(n + 1);
    int version; // номер последней версии

    for (int i = 0; i < n; i++) // обнуляем значения массива
    {
        arr[i].insert({0, 0});
    }

    while (m--) // пока m > 0, m уменьшается
    {
        char c; // вид запроса
        cin >> c;
        /*
         * g v i - get version
         * u  i +d - update element
        */
        if (c == 'g')
        {
            int v, num;
            cin >> v >> num;
            auto it = arr[num].upper_bound({v, INF}); // строго больше
            it--;
            cout << it->second << endl;
        }
        else
        {
            int num, delta;
            cin >> num >> delta;
            arr[num].insert( { ++version, arr[num].rbegin()->second + delta } );
        }
    }
}
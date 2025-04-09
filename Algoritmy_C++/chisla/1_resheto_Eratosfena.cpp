// решето Эратосфена
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    const int N = 1e3;
    bool p[N + 10];
    vector<vector<int>> v(N);
    for (int i = 2; i < N; i++)
    {
        p[i] = 1;
    }
    for (int x = 2; x < N; x++)
    {
        // cout << x << " - "; // 2
        if(p[x])
        {
            for (int y = 2 * x; y < N; y += x)
            {
                p[y] = 0;
                v[y].push_back(x);
            }
            // cout << x << ' '; // 1 - вывести ряд простых чисел
            // cout << x << ' '; // 2
        }
        else // 3
        {
            for (int y = 2 * x; y < N; y += x)
            {
                v[y].push_back(x);
            }
        }
        v[x].push_back(x); // 3
        // 2 - вывести все простые делители для ряда чисел
        cout << x << " - "; // 3 - вывести все возможные делители ряда чисел
        for (int prim : v[x]) // 2,3
        {
            cout << prim << ' ';
        }
        cout << endl; // 2,3
    }
}
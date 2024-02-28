// массивы: метод 2х указателей
// слияние двух массивов с сортировкой
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    vector<int> v, v2, res(30);
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        v.push_back(x);
    }

    /*// первый вариант
    int uk1 = 0;
    for (int uk2 = 0; uk2 < m; uk2++)
    {
        int x;
        cin >> x;
        while (uk1 != v.size() && v[uk1] <= x)
        {
            res.push_back(v[uk1]);
            uk1++;
        }
        res.push_back(x);
    }
    while (uk1 != v.size())
    {
        res.push_back(v[uk1]);
        uk1++;
    }
    */
    
    /*// второй вариант
    for (int i = 0; i < m; i++)
    {
        int x;
        cin >> x;
        v2.push_back(x);
    }
    merge(v.begin(), v.end(), v2.begin(), v2.end(), res.begin());
    */

    for (auto x : res)
    {
        cout << x << ' ';
    }
}
// алгоритм Брента

#include <iostream>
#include <vector>

using namespace std;

pair<int, int> brent(int first, vector<int>& v) 
{
    int uk1 = first;
    int uk2 = v[first];
    int mu = 0, lam = 1;
    int pw = 1;
    while (uk1 != uk2)
    {
        if (lam == pw)
        {
            pw *= 2;
            uk1 = uk2;
            lam = 0;
        }
        uk2 = v[uk2];
        ++lam;

    }
    uk1 = first;
    uk2 = first;
    for (int i = 0; i < lam; ++i) uk2 = v[uk2];
    while (uk1 != uk2)
    {
        uk1 = v[uk1];
        uk2 = v[uk2];
        mu++;
    }
    return pair<int, int> (mu, lam);
}

int main() 
{
    int n;
    cin >> n;
    vector<int>v(n);
    for (int i = 0; i < n; i++)
    {
        cin >> v[i];
    }
    int first;
    cin >> first;

    auto res = brent(first, v);
    cout << res.first << ' ' << res.second;

}
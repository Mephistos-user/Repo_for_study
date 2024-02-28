// массивы: метод 2х указателей
// найти ближайщее к элементу значение в массиве отстающее не менее чем на "к"
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n, k, uk, a[100];
    cin >> n >> k;

    vector<int> ans;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        a[i] = x;
        while (uk + 1 <= i && a[uk + 1] + k <= x)
        {
            uk++;
        }
        if (a[uk + 1] + k <= x)
        {
            ans.push_back(a[uk]);
        }
        else
        {
            ans.push_back(-1);
        }
    }

    for (auto x : ans)
    {
        cout << x << ' ';
    }
}
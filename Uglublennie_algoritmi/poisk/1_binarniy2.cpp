// ближайщее число к "х"
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int* bin_search(int* first, int* last, int x)
{
    int sz = last - first + 1;
    int l = 0, r = sz;
    int its = 0;
    while (r - l > 1)
    {
        its++;
        int m = (r + l) / 2;
        if (first[m] < x) l = m;
        else r = m;
    }
    if (l == r || r == sz || first[r] - x >= x - first[l]) return first + l;
    cout << "Bin search its: " << its << endl; // счетчик количества проделанных операций
    return first + r;
}

int main()
{
    vector<int> v = {1, 2, 2, 3, 6, 9, 11, 15};
    // cout << *lower_bound(v.begin(), v.end(), 7) << endl; // встроенная функция находит ближайшее меньшее
    // cout << *upper_bound(v.begin(), v.end(), 7) << endl; // встроенная функция находит ближайшее строго большее
    cout << *bin_search(&v[0], &v[v.size() - 1], 7);
}


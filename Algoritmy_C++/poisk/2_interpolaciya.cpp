// ближайщее число к "х"
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int* inter_search(int* first, int* last, int x)
{
    int sz = last - first + 1;
    int l = 0, r = sz;
    int its = 0;
    while (r - l > 1)
    {
        its++;
        int m = l + (x - first[l]) * (r - l - 2) / (first[r - 1] - first[l]) + 1;
        if (first[m] < x) l = m;
        else r = m;
    }
    if (l == r || r == sz || first[r] - x >= x - first[l]) return first + l;
    cout << "Inter search its: " << its << endl; // счетчик количества проделанных операций
    return first + r;
}

int main()
{
    // vector<int> v = {1, 2, 2, 3, 6, 9, 11, 15, 17, 18, 20, 21, 23, 24, 26, 27};
    vector<int> v;
    for (int i = 0; i <= 1000000; i += 2)
    {
        v.push_back(i + rand()%2);
    }
    cout << *inter_search(&v[0], &v[v.size() - 1], 7);
}


// теория игр - массив Гранди
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n;
    cin >> n;
    vector<int> a(n + 1, 0);
    int m = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        m = max(m, a[i]);
    }
    

    vector<int> g(m + 2, 0);
    g[0] = 0;
    // for (int i = 0; i < m; i++)
    // {
    //     vector<bool> p(2 * m + 5, 0);

    //     for (int j = 1; j <= i; j++)
    //     {
    //         p[g[j]] = 1;
    //         if (i != j) p[g[j] ^ g[i - j]] = 1;
    //     }

    //     while (p[g[i]++])
    //     g[i]--;
    //     cout << g[i] << endl;
    // }

    // быстрее зная закономерность
    for (int i = 0; i < m + 1; i++)
    {   
        g[i] = i;
        if (i % 4 == 0) swap(g[i], g[i - 1]);
    }

    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        ans ^= g[a[i]];
    }
    cout << (ans ? "first" : "second");
}
/*
g_n = mex(g_i, (g_i^g_(n-i)))
*/
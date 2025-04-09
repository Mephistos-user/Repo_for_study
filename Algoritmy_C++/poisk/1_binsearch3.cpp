// расставить m коров в n стойла на максимальном удалении друг от друга
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n, m, a[1000];
    cin >> n >> m;
    for (int i = 0; i < n; ++i)
    {
        cin >> a[i];
    }
    int l = 0;
    int r = a[n - 1] - a[0] + 1;
    while (r - l > 1)
    {
        int mid = (l + r) / 2;
        int kor = 0;
        int priv_kor = -1e9;
        for (int i = 0; i < n; i++)
        {
            if (a[i] - priv_kor >= mid)
            {
                priv_kor = a[i];
                kor++;
                 
            }
        }
        if (kor >= m) l = mid;
        else r = mid;
    }
    cout << l << endl;

    int kor = 0;
    int priv_kor = -1e9;
    for (int i = 0; i < n; i++)
    {
        if (a[i] - priv_kor >= l)
        {
            priv_kor = a[i];
            kor++;
            cout << a[i] << ' ';
            if (kor == m) break;
        }
    }
}


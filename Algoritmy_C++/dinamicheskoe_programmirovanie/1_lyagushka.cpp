// динамическое программироварие - лягушка
#include <iostream>
#include <vector>

using namespace std;

void rec( vector<vector<bool>>& pr, int x, int y)
{
    if (x < 0 && y < 0) return;
    if (pr[x][y] == 0)
    {
        rec(pr, x, y -1);
    }
    else
    {
        rec(pr, x - 1, y);
    }
    cout << x << ' ' << y << endl;
}

int main()
{
    int n;
    cin >> n;
    vector<vector<int>> mtx(n + 1, vector<int>(n + 1));
    for (int i = 0; i < n; i++)
    {
        for (int j= 0; j < n; j++)
        {
            cin >> mtx[i][j];
        }
    }
    vector<vector<int>> dp(n + 1, vector<int>(n + 1, 0)); // массив дин.прог
    vector<vector<bool>> pr(n + 1, vector<bool>(n + 1)); // массив предков
    for (int i = 0; i < n; i++)
    {
        for (int j= 0; j < n; j++)
        {
            if ( dp[i][j + 1] <  dp[i][j] +  mtx[i][j + 1])
            {
                dp[i][j + 1] = dp[i][j] + mtx[i][j + 1];
                pr[i][j + 1] = 0;
            }
            if ( dp[i + 1][j] <  dp[i + 1][j] +  mtx[i + 1][j])
            {
                dp[i + 1][j] = dp[i + 1][j] + mtx[i + 1][j];
                pr[i + 1][j] = 1;
            }
        }
    }
    cout << dp[n - 1][n - 1] << endl;
    rec(pr, n - 1, n - 1);    
}
/*
5
4 3 4 6 7
8 9 1 3 8
6 3 2 4 9
1 9 1 1 2
2 5 9 3 9
*/
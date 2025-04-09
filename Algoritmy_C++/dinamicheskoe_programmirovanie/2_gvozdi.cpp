// динамическое программироварие - гвозди
#include <iostream>
#include <vector>

using namespace std;

const int INF = 1e9;

int main()
{
    int n;
    cin >> n;
    vector<int> dp(n + 1, INF);
    vector<int> arr(n + 1);
    dp[0] = INF;
    for (int i = 1; i <= n; i++)
    {
        cin >> arr[i];
        if (i == 0) continue;
        else if (i == 1) dp[1] = arr[1] - arr[0];
        else dp[i] = min(dp[i - 1] + arr[i] - arr[i - 1], dp[i - 2] + arr[i] - arr[i - 1]);
    }
    cout << dp[n];
}
/*
5
1 2 3 6 7
*/
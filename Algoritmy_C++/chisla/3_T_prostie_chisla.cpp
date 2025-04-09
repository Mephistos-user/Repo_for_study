// T-простые числа - имеют ровно 3 простых делителя
#include <iostream>

using namespace std;

bool is_prime(long long x)
{
    for (long long i = 2; i * i <= x; i++)
    {
        if ( x % i == 0) return 0;
    }
    return 1;
}

int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n - 1; i++)
    {
        long long x;
        cin >> x;
        long long sq = sqrt(x);
        if (sq * sq == x && is_prime(sq))
        {
            cout << "T-prime\n";
        }
        else
        {
            cout << "Not T-prime\n";
        }
    }
}
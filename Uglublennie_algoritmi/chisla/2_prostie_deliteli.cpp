// простые делители
#include <iostream>
#include <vector>

using namespace std;

bool is_prime(long long x)
{
    for (long long i = 2; i * i <= x; i++)
    {
        if ( x % i == 0) return 0;
    }
    return 1;
}
void prime(long long x)
{
    for (long long i = 2; i * i <= x; i++)
    {
        while (x % i == 0)
        {
            x /= i;
            cout << i << ' ';
        }
    }
    if (x != 1)
    {
        cout << x;
    }
    cout << endl;
}

int main()
{
    cout << is_prime(9) << ' ' << is_prime(10) << ' ' << is_prime(11);
    prime(9);
    prime(10);
    prime(11);
}
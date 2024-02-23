#include <iostream>
#include <chrono>

using namespace std;

# define ll long long

int main()
{

    ll n = 10000000;
    ll p = 1e9 + 7;

    auto start = chrono::steady_clock::now();

    // ll f = 1;
    // разделим операции вычисления
    ll f1 = 1;
    ll f2 = 1;
    ll f3 = 1;
    ll f4 = 1;


    // for (ll i = 1; i < n; ++i)
    // {
        // f *= i;
        // f %= p;
    // }

    // разделим операции вычисления
    for (ll i = 1; i < n; i += 4)
    {
        f1 = (f1 * i) % p;
        f2 = (f2 * (i + 1)) % p;
        f3 = (f3 * (i + 2)) % p;
        f4 = (f4 * (i + 3)) % p;
        // процессор простые операции сам распараллеливает на потоки
    }
    // cout << f << endl;
    cout << f1 * f2 % p * f3 % p * f4 % p << endl;


    auto end = chrono::steady_clock::now();

    cout << (int)chrono::duration<double, milli>(end - start).count() << " millisec";

}
// быстро возвести x в степень y - бинарное возведение в степень
#include <iostream>

using namespace std;

#define ll long long

const ll p = 1234567891; // модуль

ll pow_fast(ll x, ll y, ll p)
{
    if (y == 0) return 1.0;
    ll t = pow_fast(x, y / 2, p);
    if (y % 2 == 0) return t * t % p;
    else return t * t % p * x % p;
}

int main()
{
    ll x;
    ll y;
    cin >> x >> y;
    // cout << pow(x, y); // стандартная функция
    cout << pow_fast(x, y, p) <<endl; // возведение в степень

    // сложение по модулю p
    ll n;

    cin >> n;
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        x %= p;
        sum += x;
        sum %= p;
    }
    cout << sum << endl;

    // разность
    cin >> x >> y;
    cout << (x % p - y % p + p) % p;

    // деление
    x %= p;
    y %= p;
    cout << (x * y^-1) % p;

    // теорема Ферма
    srand(time(0));
    ll a, b;
    cin >> x;
    for (int i = 0; i < 33; ++i)
    {
        ll rnd = ((rand() << 16) + rand()) % (x - 2) + 2; // rand возвращает 16ричное число. а так мы получаем 32ричное
        if (pow_fast(rnd, x - 1, x) != 1)
        {
            cout << "Sostavnoe";
            return 0;
        }
    }
    cout << "Prostoe";
}
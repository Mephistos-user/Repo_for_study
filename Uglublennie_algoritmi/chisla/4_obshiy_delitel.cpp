// наибольший общий делитель (НОД)(gcd) - алгоритм Эвклида
// наименьшее общее кратное (НОК)
#include <iostream>

using namespace std;

int nod_rec(int x, int y) // рекурсивно
{
    if ( x == 0 || y == 0) return x + y;
    return nod_rec(y % x, x);
}
int nod(int x, int y) // циклом
{
    while ( !x == 0 && !y == 0)
    {
        if (x > y) x %= y;
        else y %= x;
    }
    return x + y;
}
int nod_min(int x, int y) // самая короткая функция
{
    while ( y %= x) swap(x, y);
    return x + y;
}
int nok(int x, int y)
{
    return x * y / nod(x, y);
}

int main()
{
    cout << nod_rec(4, 6);

    cout << nod(14, 16);

    cout << nod_min(49, 56);

    cout << nok(14, 16);

    // на сколько долей нужно разрезать каждый из m апельсинов, чтобы поровну досталось n гостям:
    int n, m;
    cin >> n >> m;
    cout << n / nod(n, m);
}
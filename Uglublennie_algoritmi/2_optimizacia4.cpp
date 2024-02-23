#include <iostream>
#include <chrono>

using namespace std;


int foo(int x) {
    if (x % 2 == 0) return x / 2;
    else return (x * 3 + 1) / 2;
}

int main()
{

    const int n = 1000; // const работает быстрее на этапе компиляции
    int a[n][n];

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            a[i][j] = i * n + j;
        }
        
    }
    // быстрее работает обращение к памяти когда значения рядом (работа с кешем быстрей чем с оперативной памятью)
    auto start = chrono::steady_clock::now(); // старт программы

    for (int i = 0; i < n; ++i)
    {
        for (int j = 0; j < n; ++j)
        {
            a[i][j]++;

        }
    }

    auto end = chrono::steady_clock::now(); // завершение программы

    cout << (int)chrono::duration<double, milli>(end - start).count() / 1000 << " sec"; // вывод результата в секундах


    // медленее обращение к значениям из разных частей памяти
    auto start = chrono::steady_clock::now(); // старт программы

    for (int i = 0; i < n; ++i)
    {
        for (int j = 0; j < n; ++j)
        {
            a[j][i]++; // то же самое но проходимся по столбцам

        }
    }

    auto end = chrono::steady_clock::now(); // завершение программы

    cout << (int)chrono::duration<double, milli>(end - start).count() / 1000 << " sec"; // вывод результата в секундах
}
// сколько занимает памяти структура
#include <iostream>

using namespace std;

// #pragma pack(push, 1) // 1 - устанавливаем 1 B минимальное деление

struct A
{
    long long x; // 8 B
    bool y; // 1 B
    short int z; // 2 B
};
// 16 B - структура выравнивает выделение памяти по наибольшей переменной
// чтобы исправить выравнивание используем pragma pack(push, 1)

// #pragma pack(pop) // отменить установку минимального выравнивания

int main()
{
    A a;
    A b[10];
    cout << sizeof(a) << ' ' << sizeof(b);
}

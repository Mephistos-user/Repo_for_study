#include <iostream>

using namespace std;

// флаги компиляции - настройки оптимизации для компиляции
// gcc .cpp -O0  - без оптимизации Od (Optimization disable)
// gcc .cpp -O1  - стандартные оптимизации (Уменьшение размера кода)
// gcc .cpp -O2  - стандартные оптимизации (Создает быстрый код) более тяжелые, но все сработает
// gcc .cpp -O3  - оптимизации еще тяжелее чем O2, может нарушить целостность
// gcc .cpp -Ofast  - как и O3 с добавлением еще оптимизаций, опасно применять
// MSVC

int foo(int x) {
    if (x % 2 == 0) return x / 2;
    else return (x * 3 + 1) / 2;
}

int main()
{

    for (long long i = 0; i < (long long)1e11; i++);
    
    int x = 1;
    cin >> x;
    cout << foo(x);

}
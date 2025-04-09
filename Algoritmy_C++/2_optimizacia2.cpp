#include <iostream>
#include <vector>

using namespace std;

// оптимизируем память
int main()
{
    int x = 1; // в стеке (быстрее)
    cout << x << endl;
    int* y = new int(1); // в куче (дольше)
    cout << *y << endl;

    vector<int> v; // выделяется память на куче, но хранит последовательно
    int n = 1e7;
    // оптимизируем
    v.reserve(n + 5); // резервируем место сразу, чтобы избежать релокации

    // v.resize(n + 5) // автоматически делает и релокацию и reserve


    int* x;
    for (int i = 0; i < n; i++)
    {
        v.push_back(i); // очень долго из-за релокации
        if (i == 10) x = &v[i];
    }
    
}
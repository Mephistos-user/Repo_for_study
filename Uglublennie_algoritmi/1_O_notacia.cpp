#include <iostream>

using namespace std;

int sum1(int n) {
    cout << "O(n)\n";
    int ans = 0;
    for (int i = 1; i <= n; ++i) {
        ans += i;
    }
    return ans;
}
// асимптотика
// 2n+2 <= O(n) - верхняя оценка, не точная, худшая оценка (в худшем случае)
// 2n+2 < o(n+) - верхняя оценка, более точная. Используется для доказательств
// 2n+2 >= W(n) - Омега большое, нижняя оценка, не точная. Программа будет работать точно медленее чем n.
// 2n+2 >= w(n) - Омега малое, нижняя оценка, более точная. Используется для доказательств
// 2n+2 == T(n) - Тета, пересечение O() и W()

int sum2(int n) {
    cout << "O(1)\n";
    int ans = (1 + n) * n / 2;
    return ans;
}
// O(1)
// o(n)
// W(1)
// w(1/n)
// T(1)


// время выполнения
// память
// эффективность


int main() 
{
    srand(time(0));
    int n;
    cin >> n;
    for (int i = 0; i < 100; i++)
    {    
        if (rand() % n == 0) cout << sum1(n) << endl; // O(n)
        else cout << sum2(n) << endl; // O(1)
        // 100*O(n)
        // 100*O(1)
    }
}


// leetcode.com
// codewars.com
// codeforces.com
// acmp.ru
// informatics.msk.ru
// e-maxx.ru
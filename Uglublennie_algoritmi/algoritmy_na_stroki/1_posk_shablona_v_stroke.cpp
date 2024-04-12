// поиск шаблона в строке (хэш)
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

#define ll long long

int main()
{    
    string s, t; // строка, шаблон
    cin >> s >> t;
    size_t n = s.size(); // длина строки
    size_t k = t.size(); // длина шаблона

    if (n < k) // проверяем что шаблон не длиннее строки
    {
        cout << -1;
        return 0;
    }
    const ll P = 1234567891;
    const ll M = 31;

    vector<ll> m_pow(1, 1); //массив степеней
    ll m_ = 1; // текущая степень
    for (int i = 1; i <= n; i++)
    {
        m_ = m_ * M % P;
        m_pow.push_back(m_);
    }

    vector<ll> hs(n + 1, 0); //массив хэшей для строки
    vector<ll> ht(k + 1, 0); //массив хэшей для шаблона
    for (int i = 1; i <= n; i++)
    {
        hs[i] = ((s[i - 1] - 'a') * m_pow[i - 1] + hs[i - 1]) % P;
    }
    for (int i = 1; i <= k; i++)
    {
        ht[i] = ((t[i - 1] - 'a') * m_pow[i - 1] + ht[i - 1]) % P;
    }
    cout << endl;
    for (int l = 1; l <= n - k + 1; l++)
    {
        ll hp = (hs[l + k - 1] - hs[l - 1] + P) % P; // хэш подстроки
        if (ht[k] * m_pow[l - 1] % P == hp)
        {
            cout << l << ' ';
        }
    }
}

/*test1
ababababab
ab
*/
/*test2
abcbskrabhkubcflkdsgfuiguoabclpdfpabc[flalapalpabc]
abc
*/
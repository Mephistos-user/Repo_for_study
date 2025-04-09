// длинная арифметика для десятичных чисел
// произведение двух длинных чисел
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// функция ввода значений в массив
vector<short int> in() 
{
    string num;
    cin >> num;
    vector<short int> a;
    for (int i = 0; i < num.size(); i++)
    {
        a.push_back(num[i] - '0');
    }
    reverse(a.begin(), a.end());
}

// функция вывода значений массива
void out(vector<short int>& v)
{
    bool fl = false; // флаг если встретим нулевой элемент
    for (int i = v.size() - 1; i >= 0; i--)
    {
        fl |= v[i]; // все кроме нуля даст true
        if(fl)
        {
            cout << v[i];
        }
    }
    if (!fl)
    {
        cout << 0;
    }
    
    cout << endl;
}

// функция суммы
vector<short int> sum(vector<short int>& a, vector<short int>& b)
{
    vector<short int> s(max(a.size(), b.size()) + 1, 0);
    int p = 0; // перенос
    for (int i = 0; i < max(a.size(), b.size()); i++)
    {
        s[i] = p;
        if (i < a.size())
        {
            s[i] += a[i];
        }
        if (i < b.size())
        {
            s[i] += b[i];
        }
        p = s[i] / 10;
        s[i] %= 10;
    }
    s[max(a.size(), b.size())] = p;
    return s;
}

// функция произведения
vector<short int> mul(vector<short int>& a, vector<short int>& b)
{
    vector<short int> m(a.size() + b.size() + 1, 0);
    int p = 0; // перенос
    for (int i = 0; i < b.size(); i++)
    {
        vector<short int> temp(a.size() + i);
        for (int j = 0; j < temp.size(); j++)
        {
            temp[j] = a[j - i] * b[i];
            m = sum(m, temp);
        }
    }
    return m;
}




int main()
{
    vector<short int> a = in();
    vector<short int> b = in();
    vector<short int> s = sum(a, b);
    vector<short int> m = mul(a, b);

    out(s);
}
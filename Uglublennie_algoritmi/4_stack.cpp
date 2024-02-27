// стек

// применение:
// "CTRL + Z" - отмена последнего действия
// в рекурсии

#include <iostream>
#include <stack>

using namespace std;

// void rec(int n)
// {
//     if (n == 0) return;
//     rec(n - 1);
// }

// stack<int> st;
// st.push(1); // вставить в конец
// st.push(2);
// st.pop(); // удалить из конца
// cout << st.top(); // показать вершину

// шарики в колбе
/*int main()
{
    stack<int> shariki;
    int m;
    cin >> m;
    for (int i = 0; i < m; i++)
    {
        char operation;
        cin >> operation;
        if (operation == '+')
        {
            int x;
            shariki.push(x);
        }
        else 
        {
            if (shariki.empty()) cout << 'No balls\n';
            cout << shariki.top() << endl;
            shariki.pop();
        }
    }
}*/

// проверка открывающихся/закрывающихся скобок
// int main()
// {
//     /* (<>[]{)}
//         1 2 ()
//         3 4 []
//         5 6 {}
//         7 8 <>*/

//     int n, x;
//     stack<int> skobki;
//     cin >> n;
//     for (int i = 0; i < n; i++)
//     {
//         cin >> x;
//         if (x % 2 == 1)
//         {
//             skobki.push(x);
//         }
//         else 
//         {
//             if (skobki.top() != x -1)
//             {
//                cout << 'NO';
//                 return 0;
//             }
//             skobki.pop();
//         }
//     }
//     cout << ((skobki.empty()) ? 'YES' : 'NO');
// }

int main()
{
    /* ( ) ( ( ) )
       1 0 1 2 1 0*/

    int kol = 0;
    string s;
    cin >> s;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] == '(')
        {
            ++kol;
        }
        else 
        {
            kol--;
            if (kol < 0)
            {
               cout << 'NO';
                return 0;
            }
        }
    }
    cout << ((kol == 0) ? 'YES' : 'NO');
}
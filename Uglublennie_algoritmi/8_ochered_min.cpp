// нахождение минимума в очереди
#include <iostream>
#include <stack>

using namespace std;

int main()
{
    stack<int> st1;
    stack<pair<int, int>> st2;
    /*
        st2     st1
    1 3 4 3 ] [ 4 5 7 min = 1e9
    */
    /*
    push
    pop
    min
    */
   int m;
   cin >> m;
   st2.push(pair<int, int>(1e9, 1e9));
   int mi = 1e9;
   for (int i = 0; i < m; i++)
   {
        string zap;
        cin >> zap;
        if (zap == "push")
        {
            int x;
            st1.push(x);
            mi = min(mi, x);
        }
        else if (zap == "pop")
        {
            if (st2.size() == 1)
            {
                mi = 1e9;
                while (!st1.empty())
                {
                    int x = st1.top();
                    st1.pop();
                    st2.push(pair<int, int> (x, min(x, st2.top().second))); // вставляем пару "значение : минимум" наверх стека
                }
                
            }
            cout << st2.top().first << endl; // удаляем верхний
            st2.pop();
        }
        else
        {
            cout << min(st2.top().second, mi) << endl; // минимум
        }
   }



}
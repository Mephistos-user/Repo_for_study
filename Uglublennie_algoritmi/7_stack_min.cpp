// нахождение минимума в стеке
#include <iostream>
#include <stack>

using namespace std;

int main()
{
    stack<pair<int, int>> st;
    /*
    push
    pop
    min
    */
   int m;
   cin >> m;
   st.push(pair<int, int>(1e9, 1e9));
   for (int i = 0; i < m; i++)
   {
        string zap;
        cin >> zap;
        if (zap == "push")
        {
            int x;
            st.push(pair<int, int> (x, min(x, st.top().second))); // вставляем пару "значение : минимум" на верх стека
        }
        else if (zap == "pop")
        {
            cout << st.top().first << endl; // удаляем верхний
            st.pop();
        }
        else
        {
            cout << st.top().second << endl; // минимум
        }
   }
}
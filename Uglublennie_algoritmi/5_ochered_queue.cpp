// очередь queue
#include <iostream>
#include <queue>
#include <map>

using namespace std;

int main()
{
    /*
    4
    banan 3
    yabloko 2
    grusha 7
    kivi 1
    10
    
    + 
    2
    banan 1
    yabloko 3
    +
    1
    grusha 6
    -
    +
    2
    kivi 1
    yabloko 1
    +
    2
    grusha 2
    banan 1
    -
    -
    -
    */
   queue<map<string, int>> q;
   map<string, int> magaz;
   int n;
   cin >> n;
   for (int i = 0; i < n; i++)
   {
        string name;
        int kol;
        cin >> name >> kol;
   }
   
   int m;
   cin >> m;
   for (int i = 0; i < m; i++)
   {
        char op;
        cin >> op;
        if (op == '+')
        {
            int k;
            cin >> k;
            map<string, int> spisok;
            for (int j = 0; j < k; j++)
            {
                string name;
                int kol;
                cin >> name >> kol;
                spisok[name] = kol;
            }
            q.push(spisok);
        }
        else
        {
            map<string, int> spisok = q.front(); // передний
            q.pop();
            for (auto& pair : spisok)
            {
                string name = pair.first;
                int kol = pair.second;
                int sk = min(magaz[name], kol);
                cout << name << ' ' << sk << endl;
                magaz[name] -= sk;
            }
        }
   }
}

// алгоритм Куна - поиск максимального парасочетания
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int INF = 1e9;

vector<vector<int>> edges; // список смежности
vector<bool> p; // вектор посещения вершин
vector<int> uk; // вектор указателей на левую долю

bool kun(int v) // алгоритм Куна (dfs)
{
    if (p[v]) return false;
    p[v] = 1;
    for (int edge : edges[v])
    {
        if (uk[edge] == 0 || kun(uk[edge]))
        {
            uk[edge] = v;
            return true;
        }
    }
    return false;
}

int main()
{    
    int n1, n2, m; // n1 - размер первой доли графа, n2 - размер второй доли графа, m - ребер графа
    cin >> n1 >> n2 >> m;

    edges.resize(n1 + n2 + 5);
    uk.resize(n1 + n2 + 5, 0);
    
    for (int i = 0; i < m; i++)
    {
        int x, y; // координаты вершин ребер
        cin >> x >> y;
        y += n1; // смещение правой доли по номерам вершин относительно левой доли
        edges[x].push_back(y);
        edges[y].push_back(x);
    }
    // максимальное паросочетание (алгоритм Куна)
    for (int i = 1; i <= n1; i++)
    {
        p.assign(n1 + n2 + 5, 0); // assign() - заполнить
        kun(i);
    }

    cout << endl;
    for (int i = n1 + 1; i <= n1 + n2; i++)
    {
        if (uk[i])
        {
            cout << uk[i] << ' ' << i - n1 << endl;
        }
    }
}

/*test1
5 5 9

1 1
1 2
2 2
2 3
3 3
3 4
4 4
4 5
5 1
*/
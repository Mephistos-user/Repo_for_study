// графы - dfs поиск в глубину
#include <iostream>
#include <vector>
#include <tuple>

using namespace std;

vector<vector<tuple<int, int>>> vec;
vector<vector<int>> mtx;
vector<bool> p;

void dfs(int v)
{
    if (p[v])
    {
        return;
    }
    p[v] = true;
    cout << v << endl;
    for (auto& tu : vec[v])
    {
        int to = get<0>(tu); // возвращает элемент из тьюпла по индексу
        int w = get<1>(tu);
        cout << v << ' ' << to << ' ' << w << endl;
        dfs(to);
    }
    
}

int main()
{
    int n, m;
    cin >> n >> m;
    vec.reserve(n+1);
    mtx.reserve(n+1);
    p = vector<bool>(n + 1, 0);
    for (int i = 1; i <= n; ++i)
    {
        mtx[i] = vector<int>(n + 1, 0);
    }
    for (int i = 0; i < m; i++)
    {
        int from, to, w;
        cin >> from >> to >> w;
        mtx[from][to] = w;
        mtx[to][from] = w;
        vec[from].push_back(make_tuple(to, w));
        vec[to].push_back(make_tuple(from, w));
    }
    dfs(1);
    /*
    не ориентированный граф
    5 - количество вершин
    7 - количество ребер
    вершина,вершина - вес ребра:
    1,4 - 2
    1,2 - 4
    1,5 - 3
    3,4 - 6
    3,5 - 2
    3,2 - 1
    5,2 - 4
    */
    /*
    дерево
    7 5
    1 2 1
    1 4 1
    3 1 1
    5 4 1
    6 7 1
    */
   // в случае с деревом и несвязанным графом
   for (int i = 1; i <= n; i++)
   {
        dfs(i);
   }
   
}

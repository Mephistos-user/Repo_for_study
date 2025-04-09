// алгоритм Краскала - поиск минимального остовного дерева (минимального каркаса) (структура - snm, евристика - сжатие пути)
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int INF = 1e9;

struct Edge
{
    int x, y, w;
    Edge(int x, int y, int w): x(x), y(y), w(w) {}
};

vector<int> priv; // массив предков

int get_root(int v){ // получение предка из вершина
    if (priv[v] == v) return v;

    priv[v] = get_root(priv[v]);
    return priv[v];
}

int main()
{    
    int n, m; // n - вершин, m - ребер
    cin >> n >> m;
    vector<Edge> edges;

    priv.resize(n + 1);
    for (int i = 1; i <= n; i++) priv[i] = i; // начально указываем, что для каждой вершины предок это сама вершина
    
    for (int i = 0; i < m; i++)
    {
        int x, y, w; // ребро откуда >> куда >> вес
        cin >> x >> y >> w;
        edges.emplace_back(x, y, w);
    }
    sort(edges.begin(), edges.end(), [](const Edge& l, const Edge& r) { // сортируем по весу ребер
        return l.w < r.w;
    });
    cout << endl;
    for (auto edge : edges)
    {
        int rx = get_root(edge.x);
        int ry = get_root(edge.y);
        if (rx != ry)
        {
            priv[rx] = ry;
            cout << edge.x << ' ' << edge.y << ' ' << edge.w << endl;
        }
    }
}

/*test1
5 8

1 2 1
1 4 4
4 2 5
4 3 4
5 3 2
5 4 3
2 3 2
1 3 2
*/
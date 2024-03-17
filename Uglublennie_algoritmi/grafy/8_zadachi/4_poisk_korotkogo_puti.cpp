// алгоритм Дейкстра - поиск кротчайшего пути (кучи)
#include <iostream>
#include <vector>
#include <queue>

using namespace std;

const int INF = 1e9;

int main()
{    
    int n, m; // количество вершин и ребер
    cin >> n >> m;

    vector<vector<pair<int, int>>> edges(n + 1); // список смежности (ребер)

    for (int i = 0; i < m; i++)
    {
        int x, y, w; // вершина 1, вершина 2, вес ребра
        cin >> x >> y >> w;

        // неориентированный граф:
        edges[x].emplace_back(y, w);
        edges[y].emplace_back(x, w);
    }
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>> > q; // dp(растояния и номера вершин (dist, v)), сортировка по минимум (greater<pair<int, int>>)
    vector<int> dist(n + 1, INF); // вектор дистанций
    vector<bool> p(n + 1, 0); // вектор посещенных вершин

    dist[1] = 0;
    q.push({0, 1});

    while (!q.empty()) // bfs
    {
        auto cur = q.top(); // 
        int v = cur.second; // номер текущей вершины
        q.pop();
        if (p[v]) continue;
        p[v] = 1;
        for (auto edge : edges[v])
        {
            int to = edge.first, w = edge.second;
            if (dist[to] > dist[v] + w)
            {
                dist[to] = dist[v] + w;
                q.push({dist[to], to});
            }
        }
    }
    for (int i = 1; i <= n; i++)
    {
        cout << dist[i] << ' ';
    }
}

/*test1
7 9

1 2 5
1 3 2
2 4 3
2 5 1
3 5 1
4 6 1
5 6 3
7 5 6
7 6 2
*/
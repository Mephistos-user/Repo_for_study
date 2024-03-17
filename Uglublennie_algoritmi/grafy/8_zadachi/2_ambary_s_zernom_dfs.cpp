// найти кратчатший (быстрый) путь от ближайшего амбара с зерном в деревню (dfs)
#include <iostream>
#include <vector>

using namespace std;

const int INF = 1e9;
vector<bool> is_sklad; // проверка в деревне есть склад или нет
vector<vector<pair<int, int>>> edges; // вектор смежности
vector<vector<int>> w; // вес ребер
vector<int> dist; // вектор минимального расстояния

void dfs(int v, int prev, int w)
{
    dist[v] = min(dist[v], dist[prev] + w);
    for (auto edge : edges[v])
    {
        int to = edge.first, w = edge.second;
        if (is_sklad[to] || to == prev) continue;
        dfs(to, v, w);
    }
    
}

int main()
{
   int n, k; // количество деревень и амбаров
   cin >> n >> k;

   is_sklad.resize(n + 1, 0);
   edges.resize(n + 1);

    for (int i = 0; i < n - 1; i++) // добавляем ребра и их вес
    {
        int x, y, w;
        cin >> x >> y >> w;
        edges[x].emplace_back(y, w);
        edges[y].emplace_back(x, w);

    }   
    for (int i = 0; i < k; i++) // вводим координаты складов и записываем в вектор
    {
        int x;
        cin >> x;
        is_sklad[x] = 1;
    }
    dist.resize(n + 1, INF);
    dist[0] = 0;
    for (int i = 1; i <= n; i++)
    {
        if (is_sklad[i]) dfs(i, 0, 0); // если в деревне есть склад, запускаем из нее поиск dfs
    }
    for (int i = 1; i <= n; i++)
    {
        cout << dist[i] << ' ';
    }
}

/*test
7 3

1 2 2
1 3 1
2 4 4
2 5 1
2 6 5
4 7 2

3 4 6
*/
// за какое минимальное время будет произведена деталь авто состоящая из нескольких, а те в свою очередь из других (dfs, топологическая сортировка, ориентированный нецикличный граф)
#include <iostream>
#include <vector>

using namespace std;

const int INF = 1e9;

vector<vector<int>> edges; // вектор смежности (ребра)
vector<int> times; // вектор времени на производство одной конкретной детали
vector<bool> p; // вектор меток посещения вершин
int ans = 0; // ответ
vector<int> sorted_parts; // список деталей в порядке их производства (топологическая сортировка)

void dfs(int v)
{
    if (p[v]) return;
    p[v] = 1; // метка посещения вершины
    for (int to : edges[v])
    {
        dfs(to);
    }
    sorted_parts.push_back(v);
    ans += times[v];
}

int main()
{
    int n; // количество деталей всего
    cin >> n;
    times.resize(n + 1);
    edges.resize(n + 1);
    p.resize(n + 1);
    for (int i = 1; i <= n; i++) // вводим время для изготовления деталей
    {
        cin >> times[i];
    }
    for (int i = 1; i <= n; i++)
    {
        int x;
        cin >> x;
        for (int j = 0; j < x; j++)
        {
            int to;
            cin >> to;
            edges[i].push_back(to);
        }
    }
    dfs(1);
    cout << ans << ' ' << sorted_parts.size();
    for (int part : sorted_parts)
    {
        cout << part << ' ';
    }
}

/*test1
/*test2
/*test3
4
2 3 4 5
2 3 2
0
1 2
2 1 3

ответ:
9 3
2 3 1
*/
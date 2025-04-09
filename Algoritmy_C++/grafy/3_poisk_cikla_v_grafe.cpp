// поиск цикла в графе
#include <iostream>
#include <vector>
#include <tuple>
#include <queue>

using namespace std;

vector<vector<int>> l; // список смежности
vector<int> p; // пометки вершин в текущей рекурсии
vector<int> p2; // глобальные пометки вершин
vector<int> pr; // вектор предков
vector<int> ans; // вектор пройденного пути


bool dfs(int v)
{
    if (p[v])
    {
        int c = v;
        do
        {
            c = pr[c];
            ans.push_back(c);
        } while (c != v);
        return 1;
    }

    if (p2[v]) return 0;

    cout << v + 1 << endl; // вывод пройденых вершин

    p[v] = 1;
    p2[v] = 1;

    for (int to : l[v])
    {
        pr[to] = v;
        if (dfs(to)) return 1;
    }
    p[v] = 0;
    return 0;
}

int main()
{
    int n, m;
    cin >> n >> m;
    l.resize(n + 5);
    p.resize(n + 5);
    p2.resize(n + 5);
    pr.resize(n + 5);

    for(int i =0; i < m; ++ i)
    {
        int x, y;
        cin >> x >> y;
        x--; y--;
        l[x].push_back(y); // ориентированный граф (одно направление ребра)
    }
    bool fl = 0;
    for (int i = 0; i < n; i++)
    {
        fl = dfs(i);
        if (fl == 1) break;
    }
    cout << (fl ? "YES" : "NO") << endl;

    if (fl) // вывод пути
    {
        reverse(ans.begin(), ans.end());
        for (int elem : ans)
        {
            cout << elem + 1 << "->";
        }
    }
}
/*test1 с циклом
// 13 - вершин, 11 ребер

13 11

12 4
12 2
3 2
12 8
5 8
7 5
10 7
9 6
8 6
10 11
6 10
*/
/*test2 без цикла
// 13 - вершин, 11 ребер

13 10

12 4
12 2
3 2
12 8
5 8
7 5
10 7

8 6
10 11
6 10
*/
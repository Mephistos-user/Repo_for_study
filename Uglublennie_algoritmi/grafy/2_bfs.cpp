// графы - bfs поиск в ширину
#include <iostream>
#include <vector>
#include <tuple>
#include <queue>

using namespace std;

vector<vector<int>> v;
vector<int> p; // посещенные вершины
vector<vector<int>> ans(1);

void bfs(int start, int color)
{
    queue<int> q;
    q.push(start);
    cout << endl;
    while (!q.empty())
    {
        int cur = q.front();
        q.pop();
        if (p[cur]) continue;
        cout << cur + 1 << ' '; // по каким вершинам проходим
        p[cur] = color;
        ans[color].push_back(cur);
        for (int to : v[cur])
        {
            q.push(to);
        }
    }
}

int main()
{
    /*
    10 8

    6 5
    1 2
    6 7
    1 3
    7 8
    3 4
    8 5
    5 7
    */
    int n, m;
    cin >> n >> m;
    v.resize(n + 5);
    p.resize(n + 5);
    for(int i =0; i < m; ++ i)
    {
        int x, y;
        cin >> x >> y;
        x--; y--;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    int k = 0; // цвет покраски - к какому направлению принадлежит
    for (int i = 0; i < n; i++)
    {
        if (!p[i])
        {
            ++k;
            ans.push_back(vector<int>()); // вместо ресайза при появлении нового цвета
            bfs(i, k);
        }
    }
    for (int i = 0; i < k; i++)
    {
        for (auto elem : ans[i])
        {
            cout << elem + 1 << ' ';
        }
        cout << endl;
    }
}

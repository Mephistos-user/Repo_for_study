// где встретятся 2 коня на шахматной доске (bfs)
#include <iostream>
#include <vector>
#include <queue>


using namespace std;

const int N = 8; // доска 8х8
const int INF = 1e9;


// функция вычисления расстояний от стартовой позиции
vector<vector<int>> bfs(int sx, int sy) // int sx, int sy - стартовые позиции
{
    vector<vector<int>> p(N, vector<int>(N, INF));
    queue<pair<int, int>> q ({{sx, sy}});
    p[sx][sy] = 0;

    while (!q.empty()) // пока есть элементы в очереди
    {
        auto cur = q.front();
        q.pop();

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if ((abs(i - cur.first) == 1 && abs(j - cur.second) == 2) || (abs(i - cur.first) == 2 && abs(j - cur.second) == 1))
                {
                    if (p[i][j] == INF) 
                    {
                        p[i][j] = p[cur.first][cur.second] + 1;
                    }
                    q.push({i, j});
                }
            }
            
        }
        
    }
    return p;
}

int main()
{
    /*
    x1, y1, x2, y2 - координаты коней 
    */
   int x1, y1, x2, y2;
   cin >> x1 >> y1 >> x2 >> y2;

    // находим все пути для обоих коней:
   vector<vector<int>> p1 = bfs(x1, y1);
   vector<vector<int>> p2 = bfs(x2, y2);

   int mi = INF; // минимум ходов
   int x3 = 0, y3 = 0; // запомнить координаты точек встречи

    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            if (p1[i][j] == p2[i][j] && mi > p1[i][j])
            {
                x3 = i;
                y3 = j;
                mi = p1[i][j];
            }
        }
    }   
    cout << 'за ' << mi << ' ходов, точка встречи с координатами: ' << x3 << ' ' << y3;

    /*test1
    0 0 7 7
    */
}

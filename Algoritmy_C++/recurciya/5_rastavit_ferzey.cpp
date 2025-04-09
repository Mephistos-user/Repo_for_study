// расставить "k" ферзей на поле n*m
#include <algorithm>
#include <iostream>
#include <vector>


using namespace std;

int n, m, k;
int res = 0;
bool board[100][100];
// 0 - svobodno 1 - ferz

void print()
{
    cout << endl;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cout << board[i][j] << ' ';
        }
        cout << endl;
    }
}


void rec(int col, int num)
{
    if (num == k)
    {
        res++;
        print();
        return;
    }
    if (col == m) return;

    print();
    rec(col + 1, num);

    for (int i = 0; i < n; i++)
    {
        bool fl = 1;
        for (int j = col - 1; j >= 0; j--)
        {
            if(board[i][j]) {fl = 0; break;}
        }
        if(fl) 
        {
            for (int i2 = i - 1, j2 = col - 1; i2 >= 0 && j2 >= 0; i2--, j2--) // проходим по диагонали вверх
            {
                if(board[i2][j2]) {fl = 0; break;}
            }
        }
        if(fl)
        {
            for (int i2 = i + 1, j2 = col - 1; i2 < n && j2 >= 0; i2++, j2--) // проходим по диагонали вниз
            {
                if(board[i2][j2]) {fl = 0; break;}
            }
        }
        if(fl)
        {
            board[i][col] = 1;
            rec(col + 1, num + 1);
            board[i][col] = 0;
        }
    }
}

int main()
{
    cin >> n >> m >> k;
    rec(0, 0);
    cout << res;
}
// ханойская башня
#include <algorithm>
#include <iostream>
#include <vector>


using namespace std;

void rec(int n, int from, int to) // 
{
    int temp = from ^ to; // побитовое или
    if (n == 1)
    {
        cout << from << "->" << endl;
        return;
    }
    rec(n - 1, from, temp);
    rec(1, from, to);
    rec(n - 1, temp, to);
}

int main()
{
    int n; // количество колец
    cin >> n;
    rec(n, 1, 3);
}
// дерево отрезков на минимум (поиск минимума в отрезке - RMinQ) - множественная модификация
#include <iostream>
#include <vector>

using namespace std;

const int INF = 1e9; // ооочень большое число

void build_tree(vector<int>& tree, vector<int>& a, int v, int l, int r)
{
    if (l == r)
    {
        tree[v] = a[l];
        return;
    }
    int t = (l + r) / 2; // медиана на отрезке
    build_tree(tree, a, v * 2, l, t); // проверяем влево по дереву
    build_tree(tree, a, v * 2 + 1, t + 1, r); // проверяем вправо по дереву
    tree[v] = min(tree[v * 2], tree[v * 2 + 1]);
}

void push(vector<int>& tree, vector<int>& updated, int v) // ленивое проталкивание
{
    if (updated[v] == INF) return;
    updated[v * 2] = updated[v];
    updated[v * 2 + 1] = updated[v];
    tree[v * 2] = updated[v];
    tree[v * 2 + 1] = updated[v];
    updated[v] = INF;
}

int tree_find(vector<int>& tree, vector<int>& updated, int v, int l, int r, int fl, int fr)
{
    if (r < fl || l > fr)
    {
        return INF;
    }
    if (l >= fl && r <= fr)
    {
        return tree[v];
    }
    push(tree, updated, v);
    int t = (l + r) / 2; // медиана на отрезке
    return min(tree_find(tree, updated, v * 2, l, t, fl, fr),
               tree_find(tree, updated, v * 2 + 1, t + 1, r, fl, fr));
}

void tree_update(vector<int>& tree, vector<int>& updated, int v, int l, int r, int ul, int ur, int val)
{
    if (r < ul || l > ur) return;
    if (l <= ul && r >= ur)
    {
        updated[v] = val;
        tree[v] = val;
        return;
    }
    push(tree, updated, v); // ленивое проталкивание
    int t = (l + r) / 2; // медиана на отрезке
    tree_update(tree, updated, v * 2, l, t, ul, ur, val); // проверяем влево по дереву
    tree_update(tree, updated, v * 2 + 1, t + 1, r, ul, ur, val); // проверяем вправо по дереву
    tree[v] = min(tree[v * 2], tree[v * 2 + 1]);
}

int main()
{
    int n, m;
    vector<int> a; // вектор отрезка
    vector<int> tree; // вектор дерева
    vector<int> updated; // вектор обновленных вершин
    cin >> n; // количество элементов
    a.resize(n);
    tree.resize(4 * n + 5, INF);
    updated.resize(4 * n + 5, INF);
    for (int i = 1; i <= n; i++)
    {
        cin >> a[i];
    }
    build_tree(tree, a, 1, 1, n); // функция построения дерева
    cin >> m;
    for (int i = 0; i < m; i++)
    {
        char c; // значение запроса
        // f - find min l-r // запрос на поиск минимума
        // u - update (tree l-r = val) // запрос на изменение значения в диапазоне
        cin >> c;
        if (c == 'f')
        {
            int fl, fr; // левая, правая граница отрезка поиска
            cin >> fl >> fr;
            cout << tree_find(tree, updated, 1, 1, n, fl, fr) << endl;
        }
        else
        {
            int ul, ur, val;
            cin >> ul >> ur >> val;
            tree_update(tree, updated, 1, 1, n, ul, ur, val);
        }
    }
}
/*тесты

5           - дерево из 5 элементов
5 4 3 2 1   - значения в листьях
10          - количестов вызовов поиска

test1
f 2 4       - поиск минимум в отрезке 2-4

test2
u 1 5 4     - замена элемента на отрезке 1-5 на значение 4

test3
f 1 5 

test4
f 2 2 

test5
f 1 2 

test6
f 3 5 

test7
u 1 2 3

test8
f 2 3 

test9
f 3 4

test10
f 1 5
*/
// дерево отрезков на минимум (поиск минимума в отрезке - RMinQ) - одиночная модификация
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

int tree_find(vector<int>& tree, int v, int l, int r, int fl, int fr)
{
    if (r < fl || l > fr)
    {
        return INF;
    }
    if (l >= fl && r <= fr)
    {
        return tree[v];
    }
    int t = (l + r) / 2; // медиана на отрезке
    return min(tree_find(tree, v * 2, l, t, fl, fr),
               tree_find(tree, v * 2 + 1, t + 1, r, fl, fr));
}

void tree_update(vector<int>& tree, int v, int l, int r, int ind, int val)
{
    if (ind < l || ind > r) return;
    if (l == r)
    {
        tree[v] = val;
        return;
    }
    int t = (l + r) / 2; // медиана на отрезке
    tree_update(tree, v * 2, l, t, ind, val); // проверяем влево по дереву
    tree_update(tree, v * 2 + 1, t + 1, r, ind, val); // проверяем вправо по дереву
    tree[v] = min(tree[v * 2], tree[v * 2 + 1]);
}

int main()
{
    int n, m;
    vector<int> a; // вектор отрезка
    vector<int> tree; // вектор дерева
    cin >> n; // количество элементов
    a.resize(n);
    tree.resize(4 * n + 5, INF);
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
        // u - update (tree[ind] = val) // запрос на изменение значения
        cin >> c;
        if (c == 'f')
        {
            int fl, fr; // левая, правая граница отрезка поиска
            cin >> fl >> fr;
            cout << tree_find(tree, 1, 1, n, fl, fr) << endl;
        }
        else
        {
            int ind, val;
            cin >> ind >> val;
            tree_update(tree, 1, 1, n, ind, val);
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
u 4 5       - замена элемента по индексу 4 на значение 5

test3
f 2 4 

test4
f 1 4 

test5
f 1 5 

test6
f 3 5 

test7
u 1 9

test8
f 1 5 

test9
u 5 9

test10
f 1 5
*/
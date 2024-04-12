// бор - дерево префиксов (lca, lcp)
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int N = 30; // количество разрядов

struct Node
{
    vector<pair<shared_ptr<Node>, int>> edges;
    int val = -1;
};
typedef shared_ptr<Node> nptr; // указатель на предка
nptr root(new Node); //сщздаем новую ноду

void add_bor(nptr nd, int val, int num)
{
    if (num == -1)
    {
        nd->val = val;
        return;
    }
    int bit = ((val & (1 << num)) > 0);
    for (auto edge : nd->edges)
    {
        if (bit == edge.second)
        {
            add_bor(edge.first, val, num - 1);
            return;
        }
    }
    nd->edges.emplace_back(new Node(), bit);
    add_bor(nd->edges[nd->edges.size() - 1].first, val, num - 1);
}

int find_bor(nptr nd, int val, int num)
{
    if (num == -1)
    {
        return nd->val;
    }
    int bit = 1 - ((val & (1 << num)) > 0);
    for (auto edge : nd->edges)
    {
        if (bit == edge.second)
        {
            return find_bor(edge.first, val, num - 1);
        }
    }
    for (auto edge : nd->edges)
    {
        return find_bor(edge.first, val, num - 1);
    }
}

int main()
{    
    int n;
    cin >> n;
    int res = 0;
    int fi = 0, se = 0;

    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        int resp = find_bor(root, x, N); // находим в боре пару
        if ((resp ^ x) > res)
        {
            res = (resp ^ x);
            fi = resp;
            se = x;
        }
        add_bor(root, x, N); // добавляем введенное число в бор
    }
    cout << res << endl << fi << ' ' << se << endl;

}

/*test1
ababababab
ab
*/
/*test2
abcbskrabhkubcflkdsgfuiguoabclpdfpabc[flalapalpabc]
abc
*/
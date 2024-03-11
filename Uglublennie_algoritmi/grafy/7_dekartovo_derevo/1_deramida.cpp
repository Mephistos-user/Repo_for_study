// неявное декартово дерево - дерамида
#include <iostream>
#include <unordered_map>

using namespace std;

unordered_map<int, int> ump;

int next_rand()
{
    int x;
    while (x = rand())
    {
       if (ump.find(x) == ump.end()) break;
    }
    ump[x] = 1;
    return x;
}

struct Node 
{
    nptr left = nullptr;
    nptr right = nullptr;
    int prior = next_rand();
    int sz = 1;
    int val;
    int sum
};

typedef shared_ptr<Node> nptr;
nptr root = nullptr;

void upd_node(nptr v)
{
    v->sz = (v->left ? v->left->sz : 0) + (v->right ? v->right->sz : 0) + 1;
    v->sum = (v->left ? v->left->sum : 0) + (v->right ? v->right->sum : 0) + v->val;
}

void split(nptr& v, int key, nptr& r1, nptr& r2)
{
    if (!v)
    {
        r1 = nullptr;
        r2 = nullptr;
        return;
    
    }
    int lsz = (v->left ? v->left->sz : 0);

    if (key <= lsz) // сплит левого ребенка
    {
        split(v->left, key, r1, v->left);
        r2 = v;
        upd_node(r2);
    }
    else                    // сплит правого ребенка
    {
        split(v->right, key - lsz - 1, v->right, r2);
        r1 = v;
        upd_node(r1);
    }
}

void merge(nptr r1, nptr r2, nptr& res)
{
    if (!r1)
    {
        res = r2;
        return;
    }
    if (!r2)
    {
        res = r1;
        return;
    }
    if (r1->prior > r2->prior)
    {
        merge(r1->right, r2, r1->right);
        res = r1;
    }
    else
    {
        merge(r1, r2->left, r2->left);
        res = r2;
    }
    upd_node(res);
}

void insert_tree(int pos, int val)
{
    nptr nd = make_shared<Node>;
    nd->val = val;
    nd->sum = val;
    nptr r1, r2;
    split(root, pos, r1, r2);
    merge(r1, nd, root);
    merge(root, r2, root);
}

void del_tree(int dl, int dr)
{
    nptr r1, r2, r3;
    split(root, dl - 1, r1, r2);
    split(r2, dr - dl + 1, r2, r3);
    merge(r1, r3, root);
}

int find_sum(int sl, int sr)
{
    nptr r1, r2, r3;
    split(root, sl - 1, r1, r2);
    split(r2, sr - sl + 1, r2, r3);
    int sum = r2->sum;
    merge(r1, r2, root);
    merge(root, r3, root);
    return sum;
}

void main()
{
    int m;
    cin >> m;
    // 1 4 1 2 4 5
    for (int i = 0; i < m; i++)
    {
        char c;
        /*
         * i - вставить pos val
         * d - удалить отрезок dl dr
         * s - сумма на отрезке sl sr
        */
       cin >> c;
       if (c == 'i')
       {
            int pos, val;
            cin >> pos >> val;
            insert_tree(pos, val);
       }
       else if (c == 'd')
       {
            int dl, dr;
            cin >> dl >> dr;
            del_tree(dl, dr);
       }
       else if (c == 's')
       {
            int sl, sr;
            cin >> sl >> sr;
            cout << find_sum(sl, sr) <<endl;
       }
    }
}
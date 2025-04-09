// частично персистентный стек
#include <iostream>
#include <vector>
#include <set>

using namespace std;

const int INF = 1e9;

int main()
{
    int m; // количество запросов
    cin >> m;
    vector<pair<int, int>> st(1, {0, 0});
    // priv_version, val
    while (m--)
    {
        char c;
        /*
         * g v - get
         * i v k - insert
         * e v - eraise
        */
       cin >> c;
       if (c == 'g')
       {
            int v;
            cin >> v;
            cout << st[v].second << endl;
       }
       else if (c == 'i')
       {
            int v, k;
            cin >> v >> k;
            st.push_back({v, k});
       }
       else
       {
            int v;
            cin >> v;
            int pr = st[v].first;
            st.push_back(st[pr]);
       }
    } 
}
// больше/меньше
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int l = 0, r = n + 1;
    while (r - l > 1)
    {
        int m = (l + r) / 2;
        cout << m << endl;
        char resp;
        cin >> resp;
        if ( resp == '=')
        {
            return 0;
        }
        else if (resp = '>')
        {
            l = m + 1;
        }
        else 
        {
            r = m;
        }
    }
    cout << l << endl;
    char resp;
    cin >> resp;
}


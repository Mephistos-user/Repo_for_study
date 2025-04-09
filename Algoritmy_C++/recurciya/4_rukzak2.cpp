// собрать рюкзак
#include <algorithm>
#include <iostream>
#include <vector>


using namespace std;

int v[1000]; // массивы веса v
int w, n;
int have_ans = 0, mask_ans; // 

void rec(int mask, int wsum, int num) // маска, сумма по весу, номер последнего взятого элемента
{
    if (w < wsum || have_ans == 1) return;
    if (wsum == w)
    {
        have_ans = 1;
        mask_ans = mask;
    }
    if (num == n) return;
    rec(mask + (1<<num), wsum + v[num], num + 1);
    rec(mask, wsum, num + 1);
}

int main()
{
    /*
    w        - вместимость рюкзака в kg
    n        - количество вещей
    w1    - вес вещи
    w2    - вес вещи
    ...
    wn    - вес вещи

    можно ли наполнить рюкзак максимально из имеющихся вещей
    */

   cin >> w >> n;
   for (int i = 0; i < n; i++)
   {
        cin >> v[i];
   }
   rec(0, 0, 0);
   if (!have_ans) cout << "No answer";
   for (int i = 0; i < n; i++)
   {
        if (mask_ans & (1 << i)) // или (mask_ans & 1) и mask_ans >>= 1; // битовый сдвиг вправо
        {
            cout << i + 1 << endl;
        }
   }
}
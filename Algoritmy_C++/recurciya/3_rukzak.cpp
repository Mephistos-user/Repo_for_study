// собрать рюкзак
#include <algorithm>
#include <iostream>
#include <vector>


using namespace std;

int v[1000], c[1000]; // массивы веса v, цены c
int w, n;
int maxc = 0, mask_max; // максимум по цене, маска максимума

void rec(int mask, int wsum, int csum, int num) // маска, сумма по весу, сумма по цене, номер последнего взятого элемента
{
    if (w < wsum) return;
    if (csum > maxc)
    {
        maxc = csum;
        mask_max = mask;
    }
    if (num == n) return;
    rec(mask + (1<<num), wsum + v[num], csum + c[num], num + 1);
    rec(mask, wsum, csum, num + 1);
}

int main()
{
    /*
    w        - вместимость рюкзака в kg
    n        - количество вещей
    w1 c1    - вес вещи и ее стоимость
    w2 c2    - вес вещи и ее стоимость
    ...
    wn cn    - вес вещи и ее стоимость

    нужно положить в рюкзак максимально возможное количество самый ценных вещей
    */

   cin >> w >> n;
   for (int i = 0; i < n; i++)
   {
        cin >> v[i] >> c[i];
   }
   rec(0, 0, 0, 0);
   cout << maxc << endl;
   for (int i = 0; i < n; i++)
   {
        if (mask_max & (1 << i)) // или (mask_max & 1) и mask_max >>= 1; // битовый сдвиг вправо
        {
            cout << i + 1 << endl;
        }
   }
}
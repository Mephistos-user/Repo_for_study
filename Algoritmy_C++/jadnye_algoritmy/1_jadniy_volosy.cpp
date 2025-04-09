// жадный алгоритм - сколько можно заработать на продаже волос, если волосы растут на 1 см в день, а цена различная в разные дни))
#include <iostream>
#include <vector>
#include <algorithm>
#include <tuple>

using namespace std;

int main()
{
     int n; // количество элементов
     cin >> n;
     vector<pair<int, int>> costs;
     for (int i = 0; i < n; i++)
     {
          int x;
          cin >> x;
          costs.emplace_back(x, i); // сам конструирует объект // чтобы отсортировать в обратном порядке - costs.emplace_back(-x, i);
     }
     // 2й вариант сортировки
     // sort(costs.begin(), costs.end(), greater<pair<int, int>>()); // чтобы отсортировать в обратном порядке - greater<pair<int, int>>()

     // 3й вариант сортировки
     // sort(costs.begin(), costs.end(), 
     // [](const pair<int, int> l, const pair<int, int> r) { // компанатор для сортировки
     //      if (l.first == r.first) return l.second > r.second;
     //      else return l.first > r.first;
     // }); // чтобы отсортировать в обратном порядке - 

     // 4й вариант сортировки - тьюплы(tie) - для более сложных структур
     sort(costs.begin(), costs.end(), 
     [](const pair<int, int> l, const pair<int, int> r) { // компанатор для сортировки
          return tie(-l.first, l.second) < tie(-r.first, r.second); // если числа то минус показывает обратный порядок
          // return tie(r.first, l.second) < tie(l.first, r.second); // если строки в обратном порядке то минус ставить нельзя
     }); // чтобы отсортировать в обратном порядке - 

     int priv_num = -1; // последний день, в который продавали волосы
     int ans = 0;
     for (auto elem : costs)
     {
          if (elem.second > priv_num)
          {
               ans += elem.first * (elem.second - priv_num); // (elem.second - priv_num) - сколько дней прошло от последнего дня продажи
               priv_num = elem.second;
          }
     }
     cout << ans;
}
/*
test1
10
3 4 6 3 5 7 5 5 6 1

*/
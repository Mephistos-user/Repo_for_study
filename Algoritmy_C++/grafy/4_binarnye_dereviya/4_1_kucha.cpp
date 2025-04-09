// куча на минимум
#include <iostream>
#include <vector>

using namespace std;

void heapify(vector<int>& v, int node) // восстановление свойств кучи
{
    if (node * 2 >= v.size()) return; // проверяем два ребенка или один
    if (node * 2 + 1 == v.size()) // проверяем что только левый ребенок
    {
        if (v[node * 2] < v[node])
        {
            swap(v[node * 2], v[node]); // если левый ребенок нарушает свойство то меняем местами
        }
        return;
    }
    if (v[node * 2] < v[node] || v[node * 2 + 1] < v[node]) // если нарушены свойства кучи и для левого и для правого ребенка
    {
        if (v[node * 2] < v[node *2 + 1]) // если левый больше правого
        {
            swap(v[node * 2], v[node]);
            heapify(v, node * 2);
        }
        else                                // если правый больше левого
        {
            swap(v[node * 2 + 1], v[node]);
            heapify(v, node * 2 + 1);
        }
    }
}

void build_heap(vector<int>& v) // построение кучи
{
    for (int i = (v.size() - 1) / 2; i >= 0; --i)
    {
        heapify(v, i);
    }
}

void heap_sort(vector<int>& v) // сортировка кучи
{
    vector<int> ans;
    ans.reserve(v.size());
    v.insert(v.begin(), 0);
    build_heap(v);
    for (int i = v.size() - 1; i >= 1; --i)
    {
        swap(v[0], v[i]); // меняем местами
        ans.push_back(v[i]); // добавляем во временный вектор элемент
        v.pop_back(); // удаляем элемент с конца
        heapify(v, 0); // восстанавливаем свойства кучи
    }
    v = ans; // переписываем полученный временный вектор в основной вектор
}

int main()
{
    vector<int> v;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        v.push_back(x);
    }
    heap_sort(v);
    for (int elem : v)
    {
        cout << elem << ' ';
    }
    
}
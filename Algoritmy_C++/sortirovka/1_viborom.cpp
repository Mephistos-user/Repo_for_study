// сортировка выбором

#include <iostream>
#include <vector>
#include <assert.h>
#include <bitset>


using namespace std;

template<class T>
void sort_vibor(vector<T>& v)
{
    vector<T> res; // результирующий вектор
    size_t sz = v.size(); // size_t - тип размер
    vector<bool> p(sz, 0); // вектор проверки позиции

    for (size_t i = 0; i < sz; i++)
    {
        T mi; // минимум
        bool fl = 0; // флаг
        size_t num = 0; // размер числа
        for (size_t j = 0; j < sz; j++)
        {
            if(!p[j] && (!fl || mi > v[j]))
            {
                mi = v[i];
                num = j;
                fl = 1;
            }
        }
        p[num] = 1;
        res.push_back(mi);
    }
    v = res;
}
template<class T>
void print(vector<int>& v)
{
    for (auto elem : v)
    {
        cout << elem << ' ';
    }
    cout << endl;
}

int main()
{
    vector<float> v1_ = {3.5, 1.2, 2.5, 1.4, 5.1, 4.3};
    vector<int> v2_ = {5, 6, 1, -1, 100, -100, 2, 500, 0};
    vector<int> v3_ = {0};
    vector<float> v1_ans = {1.2, 1.4, 2.5, 3.5, 4.3, 5.1};
    vector<int> v2_ans = {-100, -1, 0, 1, 2, 5, 6, 100, 500};

    {
        vector<float> v1 = v1_;
        vector<int> v2 = v2_;
        vector<int> v3 = v3_;
        sort_vibor(v1);
        sort_vibor(v2);
        sort_vibor(v3);
        // print(v1);
        assert(v1 == v1_ans);
        assert(v2 == v2_ans);
        assert(v3 == v3_);
        cout << "Vibor passed tests";
    }
}
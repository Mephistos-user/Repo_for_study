// быстрая сортировка

#include <iostream>
#include <vector>
#include <assert.h>
#include <bitset>


using namespace std;

template<class T>
void quick_sort(vector<T>& v, size_t left, size_t right)
{
    if (left >= right) return;

    // size_t midle = (left + right) / 2;
    srand(time(0));
    size_t sz = right - left + 1;
    size_t midle = left rand() % sz;

    vector<T> lb, rb, mb;
    for (size_t i = left; i <= right; i++)
    {
        T& val = v[i];
        if ( val < v[m]) lb.push_back(val);
        else if (val > v[m]) rb.push_back(val);
        else mb.push_back(val);
    }
    copy(lb.begin(), lb.end(), v.begin() + left);
    copy(mb.begin(), mb.end(), v.begin() + left + lb.size());
    copy(rb.begin(), rb.end(), v.begin() + left + lb.size() + mb.size());
    quick_sort(v, left, lb.size() - 1);
    quick_sort(v, right - rb.size() + 1, r);
}
template<class T>
void sort_quick(vector<T>& v)
{
    quick_sort(v, 0 , v.size() - 1);
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
        sort_quick(v1);
        sort_quick(v2);
        sort_quick(v3);
        // print(v1);
        assert(v1 == v1_ans);
        assert(v2 == v2_ans);
        assert(v3 == v3_);
        cout << "Quick passed tests";
    }
}
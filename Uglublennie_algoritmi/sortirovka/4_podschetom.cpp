// сортировка подсчетом

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
void sort_count(vector<T>& v, size_t sz)
{
    vector<size_t> counters(sz * 2, 0);
    for (T& val : v)
    {
        counters[abs(val) + (sz - 1) * (val < 0)]++;
    }
    size_t uk = 0;
    for (size_t i = sz * 2 - 1; i >= sz; i--)
    {
        T val = - ((int)i - (int)sz + 1);
        for (size_t j = 0; j < counters[i]; j++)
        {
            v[uk] = val;
            uk++;
        }
    }
    for (size_t i = 0; i < sz * 2; i++)
    {
        T val = i;
        if (i > sz -1) val = - (val - (int)sz + 1);
        for (size_t j = 0; j < counters[i]; j++)
        {
            v[uk] = val;
            uk++;
        }
    }
    
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
    // vector<float> v1_ = {3.5, 1.2, 2.5, 1.4, 5.1, 4.3};
    vector<int> v2_ = {5, 6, 1, -1, 100, -100, 2, 500, 0};
    vector<int> v3_ = {0};
    // vector<float> v1_ans = {1.2, 1.4, 2.5, 3.5, 4.3, 5.1};
    vector<int> v2_ans = {-100, -1, 0, 1, 2, 5, 6, 100, 500};

    {
        // vector<float> v1 = v1_;
        vector<int> v2 = v2_;
        vector<int> v3 = v3_;
        // sort_count(v1);
        sort_count(v2, 1000);
        sort_count(v3, 1000);
        // print(v1);
        // assert(v1 == v1_ans);
        assert(v2 == v2_ans);
        assert(v3 == v3_);
        cout << "Count passed tests";
    }
}
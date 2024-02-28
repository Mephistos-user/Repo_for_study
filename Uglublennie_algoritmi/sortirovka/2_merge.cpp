// сортировка слиянием

#include <iostream>
#include <vector>
#include <assert.h>
#include <bitset>


using namespace std;

template<class T>
void merge_sort(vector<T>& v, size_t left, size_t right)
{
    if (left == right) return;
    size_t midle = (left + right) / 2;
    merge_sort(v, left, midle);
    merge_sort(v, midle + 1, right);
    vector<T> merged(right - left + 1);
    merge(v.begin() + left, v.begin() + midle + 1, v.begin() + midle + 1, v.begin() + right + 1, merged.begin());
    copy(merged.begin(), merged.end(), v.begin() + left);
}
template<class T>
void sort_merge(vector<T>& v)
{
    merge_sort(v, 0 , v.size() - 1);
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
        sort_merge(v1);
        sort_merge(v2);
        sort_merge(v3);
        // print(v1);
        assert(v1 == v1_ans);
        assert(v2 == v2_ans);
        assert(v3 == v3_);
        cout << "Merge passed tests";
    }
}
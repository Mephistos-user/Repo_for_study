#include <iostream>
#include <deque>

using namespace std;

int main()
{
    deque<int> dq;
    dq.push_back(1); // вставить в конец
    dq.pop_back(); // удалить с конца
    dq.push_front(1); // вставить в начало
    dq.pop_front(); // удалить с начала
    dq.front(); // первый элемент
    dq.back(); // последний элемент

}
#include <thread>
#include <iostream>
using namespace std;
int main() {

    //may return 0 when not able to detect
    const auto processor_count = thread::hardware_concurrency();
    cout << "Колличество доступных ядер = " << processor_count << endl;

    return 0;
}
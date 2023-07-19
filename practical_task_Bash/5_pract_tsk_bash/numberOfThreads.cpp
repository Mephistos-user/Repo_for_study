#include <thread>
#include <iostream>

int main() {

    //may return 0 when not able to detect
    const auto processor_count = std::thread::hardware_concurrency();
    std::cout << "Колличество доступных ядер = " << processor_count <<std::endl;

    return 0;
}
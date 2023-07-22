#include <iostream>
#include <ctime>
#include <pthread.h>
#include <thread>
#include <vector>
#include <chrono>

using namespace std;




void calc()
{
    cout << "Test message" << endl;
    this_thread::sleep_for(chrono::milliseconds(7000));
}

int main ()
{
    setlocale (LC_ALL, "ru");
    
        thread thrd(calc);
    
    
    

    this_thread::sleep_for(chrono::milliseconds(5000));

    cout << "Message from main" << endl;
    
    thrd.join();
    
    return 0;
}

// g++ -o test.out test.cpp -lpthread
// ./test.out
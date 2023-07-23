#include <iostream>
#include <ctime>
#include <pthread.h>
#include <thread>
#include <vector>
#include <chrono>

using namespace std;




void calc(int &args, int arg)
{
    this_thread::sleep_for(chrono::milliseconds(3000));
    cout << "ID потока = " << this_thread::get_id() << "\tthread\t" << arg << endl;
    cout << "Test message " << args << endl;
    
}

int main ()
{
    setlocale (LC_ALL, "ru");
        //определить колличество ядер
    //may return 0 when not able to detect
    const auto num_cores = thread::hardware_concurrency();
    cout << "Колличество доступных ядер num_cores = " << num_cores << endl;


    //thread thrd(calc);
    vector <thread> thrd;
    for(int t = 1; t <= num_cores; t++)
    {
        thrd.push_back (thread(calc, (ref(t)), t));
    }
    
    

    this_thread::sleep_for(chrono::milliseconds(5000));
    cout << "ID потока = " << this_thread::get_id() << "\tmain\t" << endl;
    cout << "Message from main" << endl;
    
    for(int t = 0; t < num_cores; ++t)
    {    
        thrd.at (t).join ();
    }
    //thrd.join();
    
    return 0;
}

// g++ -o test.out test.cpp -lpthread
// ./test.out
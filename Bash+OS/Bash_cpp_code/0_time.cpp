// Как найти время работы программы?
#include <iostream>
// заголовочный файл с прототипом функции clock()
#include <ctime>
using namespace std;
//         ...
// здесь должен быть код программы, время выполнения которой нужно измерить
cout << "runtime = " << clock()/1000.0 << endl; // время работы программы 


// Как найти время работы фрагмента кода?
 
// заголовочный файл с прототипом функции clock()
#include <ctime>
//         ...
    unsigned int start_time =  clock(); // начальное время
    // здесь должен быть фрагмент кода, время выполнения которого нужно измерить
    unsigned int end_time = clock(); // конечное время
    unsigned int search_time = end_time - start_time; // искомое время
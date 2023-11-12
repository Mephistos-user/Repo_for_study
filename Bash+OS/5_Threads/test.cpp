#include <iostream>
#include <ctime>
#include <pthread.h>
#include <thread>
#include <vector>
#include <chrono>

using namespace std;

//задать размеры матриц
// задаем переменные размера матриц
int row_1, column_1, row_2, column_2, row_thread;

// функция определения размеров исходных матриц:
void sizeMatric()
{
    cout << "Введите количество строк и столбцов первой матрицы: " << endl;
    cin >> row_1 >> column_1;

    cout << "Введите количество строк и столбцов второй матрицы: " << endl;
    cin >> row_2 >> column_2;
}
vector <vector<int>> arr_1;
vector <vector<int>> arr_2;
vector <vector<int>> arr_3;
// функция проверки ошибки размеров матриц:
void sizeError()
{
    while (column_1 != row_2 )
    {
        cout << "Неправильный размер матриц!\nПеремножение невозможно!\n";
        cout << "(Количество столбцов матрицы1 должно быть равно количеству строк матрицы2)\n";
        cout << "Ввести размеры повторно?(y/n)" << endl;
        char answ;
        cin >> answ;
        if(answ=='y')
        {
            // ввод размеров матриц повторно
            sizeMatric();
        } else exit(0);
    }
}

//функция вычисления матрицы (вектора)
// вычисляем и записываем значения в матрицу 3:

void calc_matrix (int t)
{
    for(int i=(t-1)*row_thread;i < t*row_thread; ++i)
    {
        for (int j=0;j<column_2; ++j)
        {
            for (int n=0; n<column_1; ++n)
            {
                //arr_3[i][j]=0; // обнуляем значения матрицы 3
                arr_3[i][j] += arr_1[i][n] * arr_2[n][j];
            }
        }
    }
}


void calc(int &args, int arg)
{
    this_thread::sleep_for(chrono::milliseconds(3000));
    cout << "ID потока = " << this_thread::get_id() << "\tthread\t" << arg << endl;
    cout << "Test message " << args << endl;
    
}

int main ()
{
    setlocale (LC_ALL, "ru");
    sizeMatric();
    sizeError();
    //определить колличество ядер
    //may return 0 when not able to detect
    const auto num_thread = thread::hardware_concurrency();
    cout << "Колличество доступных потоков num_thread = " << num_thread << endl;
    //количество строк обрабатываемых в одном потоке



    int row_thread = row_1/num_thread;
    cout << "Колличество строк в 1 потоке row_thread = " << row_thread << endl;
    int remaining_row = row_1%num_thread + row_thread;
    cout << "Колличество строк в последнем потоке remaining_row = " << remaining_row << endl;

    
    vector <thread> thrd;
    for(int t = 1; t <= num_thread; t++)
    {
        thrd.push_back (thread(calc, (ref(t)), t));
    }
    
    

    this_thread::sleep_for(chrono::milliseconds(5000));
    cout << "ID потока = " << this_thread::get_id() << "\tmain\t" << endl;
    cout << "Message from main" << endl;
    
    for(int t = 0; t < num_thread; ++t)
    {    
        thrd.at (t).join ();
    }
    
    
    return 0;
}

// g++ -o test.out test.cpp -lpthread
// ./test.out
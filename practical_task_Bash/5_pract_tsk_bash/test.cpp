#include <iostream>
#include <ctime>
#include <thread>
#include <vector>
#include <chrono>
#include <fstream>

using namespace std;

//задать размеры матриц
// задаем переменные размера матриц и пустиые матрицы на основе вектора векторов
int row_1, column_1, row_2, column_2, NUM_CORE_CNST, num_core, num_thread, remaining;
vector <vector<int>> arr_1;
vector <vector<int>> arr_2;
vector <vector<int>> arr_3;
// функция определения размеров исходных матриц:
void sizeMatric()
{
    cout << "Введите количество строк и столбцов первой матрицы: " << endl;
    cin >> row_1 >> column_1;

    cout << "Введите количество строк и столбцов второй матрицы: " << endl;
    cin >> row_2 >> column_2;
    //задаем размеры матриц (векторов) на основе введенных данных
    arr_1.assign(row_1, vector <int>(column_1));
    arr_2.assign(row_2, vector <int>(column_2));
    arr_3.assign(row_1, vector <int>(column_2));
}

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

    if (max(row_1,column_2) <= num_core)
    {
        if(row_1>=column_2)
        {
            //если количество строк больше или равно чем столбцов, то проход по матрице по строкам (t = каждой строке)
            
                for (int j=0;j<column_2; ++j)
                {
                    for (int n=0; n<column_1; ++n)
                    {
                        //arr_3[i][j]=0; // обнуляем значения матрицы 3
                        arr_3[t-1][j] += arr_1[t-1][n] * arr_2[n][j];
                    }
                }
            
        }else
        {
            //если количество строк меньше чем столбцов, то проход по матрице по столбцам (t = каждому столбцу)

                for (int i=0;i<row_1; ++i)
                {
                    for (int n=0; n<column_1; ++n)
                    {
                        //arr_3[i][j]=0; // обнуляем значения матрицы 3
                        arr_3[i][t-1] += arr_1[i][n] * arr_2[n][t-1];
                    }
                }
            
        }





    }else
    {
        if(row_1>=column_2)
        {
            if(t==num_core)
            {
                for(int i=(t-1)*num_thread;i < t*num_thread+remaining; ++i)
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
            }else
            {
                for(int i=(t-1)*num_thread;i < t*num_thread; ++i)
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




        }else
        {
            if(t==num_core)
            {
                for(int i=0;i < row_1; ++i)
                {
                    for (int j=(t-1)*num_thread;j<t*num_thread+remaining; ++j)
                    {
                        for (int n=0; n<column_1; ++n)
                        {
                            //arr_3[i][j]=0; // обнуляем значения матрицы 3
                            arr_3[i][j] += arr_1[i][n] * arr_2[n][j];
                        }
                    }
                }
            }else
            {
                for(int i=0;i < row_1; ++i)
                {
                    for (int j=(t-1)*num_thread;j<t*num_thread; ++j)
                    {
                        for (int n=0; n<column_1; ++n)
                        {
                            //arr_3[i][j]=0; // обнуляем значения матрицы 3
                            arr_3[i][j] += arr_1[i][n] * arr_2[n][j];
                        }
                    }
                }
            }
        }
    }
}


int main ()
{
    
    setlocale (LC_ALL, "ru");
    sizeMatric();
    sizeError();
    //определить колличество ядер
    //may return 0 when not able to detect
    const auto NUM_CORE_CNST = thread::hardware_concurrency();
    cout << "Колличество доступных потоков NUM_CORE_CNST = " << NUM_CORE_CNST << endl;
    num_core = NUM_CORE_CNST;
    //количество строк обрабатываемых в одном потоке
/*проверяем условие, если количество строк или столбцов результирующей матрицы
 меньше количества доступных потоков, задаем количество создаваемых новых потоков
 и направление вычислений (по строкам или столбцам)*/
if(max(row_1,column_2) <= num_core)
{
    num_core = max(row_1,column_2);// количество строк или столбцов обрабатываемых в одном потоке
    cout << "Колличество создаваемых потоков num_core = " << num_core << endl;
}else
{
    num_thread = max(row_1,column_2)/num_core;
    cout << "Колличество строк в одном потоке num_thread = " << num_thread << endl;
    remaining = max(row_1,column_2) - (num_thread*num_core);// остаток строк некратное количеству потоков
    cout << "Колличество строк в последнем потоке (remaining + num_thread) = " << remaining + num_thread<< endl;
}


cout << "Ввести случайные значения в матрицы (r) или ввести вручную (m)?" << endl;
char answer;
cin >> answer;
if (answer == 'r')
{
    // вводим случайные значения в матрицу 1:
    for (int i = 0; i < row_1; i++) {
        for (int j = 0; j < column_1; j++) {
            //arr_1[i][j] = 0;
            arr_1[i][j] = rand() % 1000;
        }
    }
    // вводим случайные значения в матрицу 2:
    for (int i = 0; i < row_2; i++) {
        for (int j = 0; j < column_2; j++) {
            //arr_2[i][j] = 0;
            arr_2[i][j] = rand() % 1000;
        }
    }
} else {
    // вводим значения в матрицу 1 вручную:
    cout << "Введите " << row_1*column_1 << " значений матрицы 1:" << endl;
    for (int i=0; i < row_1; ++i) {
        for(int j=0; j < column_1; ++j) {
            //arr_1[i][j] = 0;
            cin >> arr_1[i][j];
        }
    }
    // вводим значения в матрицу 2 вручную:
    cout << "Введите " << row_2*column_2 << " значений матрицы 2:" << endl;
    for (int i=0; i < row_2; ++i) {
        for(int j=0; j < column_2; ++j) {
            //arr_2[i][j] = 0;
            cin >> arr_2[i][j];
        }
    }
}



    // создаем вектор потоков и записываем в него создаваемые потоки   
    vector <thread> vec_thrd;
    for(int t = 1; t <= num_core; t++)
    {
        vec_thrd.push_back (thread(calc_matrix, t));
    }
    
    for(int t = 0; t < num_core; ++t)
    {    
        vec_thrd.at (t).join ();// ожидаем завершения всех потоков и записи значений в матрицу3
    }
    



    // выводим значения из матрицы 3:
    cout << "Вывести результат вычислений матриц в файл (f) или в терминал (t)?" << endl;

cin >> answer;
if (answer == 'f')
{


    ofstream ofile("matrix_result.txt", ios::out);
    if (ofile.is_open())
    {
        // выводим значения из матрицы 1:
        ofile << "матрица 1:" << endl;
        for (int i=0;i<row_1;++i)
        {
            for(int j=0;j<column_1;++j)
            {
                ofile << arr_1[i][j] << " ";
                
            }
            ofile << endl;
            
        }
        ofile << endl;
    
    // выводим значения из матрицы 2:
        ofile << "матрица 2:" << endl;
        for (int i=0;i<row_2;++i)
        {
            for(int j=0;j<column_2;++j)
            {
                ofile << arr_2[i][j] << " ";
            }
            ofile << endl;
        }
        ofile << endl;

        cout << "Результаты умножения - матриц1,2 и 3 выведены в файл: matrix_result.txt" << endl;
        ofile << "Результат умножения - матрица 3" << endl;
        for (int i=0;i<row_1;++i) 
        {
            for(int j=0;j<column_2;++j)
            {
                ofile << arr_3[i][j] << " ";
            }
            ofile << endl;
        }
    }
}else
{
        // выводим значения из матрицы 1:
        cout << "матрица 1:" << endl;
        for (int i=0;i<row_1;++i)
        {
            for(int j=0;j<column_1;++j)
            {
                cout << arr_1[i][j] << " ";
                
            }
            cout << endl;
            
        }
        
    
    // выводим значения из матрицы 2:
        cout << "матрица 2:" << endl;
        for (int i=0;i<row_2;++i)
        {
            for(int j=0;j<column_2;++j)
            {
                cout << arr_2[i][j] << " ";
            }
            cout << endl;
        }

        cout << "Результат умножения - матрица 3:" << endl;
        for (int i=0;i<row_1;++i) 
        {
            for(int j=0;j<column_2;++j)
            {
                cout << arr_3[i][j] << " ";
                
            }
            cout << endl;
            
        }
    
}    

    

    cout << "runtime = " << clock()/1000.0 << "ms" << endl; // время работы программы
    return 0;
}

// g++ -o test.out test.cpp -lpthread
// ./test.out
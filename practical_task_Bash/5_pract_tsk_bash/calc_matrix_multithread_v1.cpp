#include <iostream>
#include <ctime>
#include <thread>
#include <vector>

using namespace std;

//определить колличество ядер
    //may return 0 when not able to detect
    const auto num_cores = thread::hardware_concurrency();
    cout << "Колличество доступных ядер = " << num_cores << endl;


//задать количество новых потоков
int num_thread = num_cores-1;

//задать размеры матриц
// задаем переменные размера матриц
int row_1, column_1, row_2, column_2;

// функция определения размеров исходных матриц:
void sizeMatric()
{
    cout << "Введите количество строк и столбцов первой матрицы: " << endl;
    cin >> row_1 >> column_1;

    cout << "Введите количество строк и столбцов второй матрицы: " << endl;
    cin >> row_2 >> column_2;
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


//количество строк
int row_thread = row_1/num_thread;
int ostatok_strok = row_1%num_thread + row_thread;
//проверить если количество строк меньше количества ядер, то количество потоков должно быть равно количеству строк



//функция вычисления матрицы (вектора)
// вычисляем и записываем значения в матрицу 3:

void* calc_matrix (int &t)
{
    for(int i=(t-1)*row_thread;i < t*row_thread; ++i)
    {
        for (int j=0;j<column_2; ++j)
        {
            for (int n=0; n<column_1; ++n)
            {
                arr_3[i][j]=0; // обнуляем значения матрицы 3
                arr_3[i][j]=arr_3[i][j]+arr_1[i][n]*arr_2[n][j];
            }
        }
    }
}

int main ()
{
    sizeMatric();
    sizeError();

    vector <thread> vector_thread;
    for(int t = 1; t <= num_thread; ++t)
    {
        vector_thread.push_back (thread(calc_matrix(t)));
    }
    for(int t = 1; t <= num_thread; ++t)
    {    
        vector_thread.at (t).join ();
    }


//вывод матрицы (вектора)


    return 0;
}
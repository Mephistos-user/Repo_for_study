#include <iostream>
#include <ctime>
#include <thread>
#include <vector>

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

void* calc_matrix (int t)
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

int main ()
{

    sizeMatric();
    sizeError();

    //определить колличество ядер
    //may return 0 when not able to detect
    const auto num_cores = thread::hardware_concurrency();
    cout << "Колличество доступных ядер num_cores = " << num_cores << endl;

    //задать количество новых потоков
    int num_thread = num_cores-1;
    cout << "Колличество потоков num_thread = " << num_thread << endl;
    //количество строк обрабатываемых в одном потоке
    int row_thread = row_1/num_thread;
    cout << "Колличество строк в 1 потоке row_thread = " << row_thread << endl;
    int remaining_row = row_1%num_thread + row_thread;
    cout << "Колличество строк в последнем потоке remaining_row = " << remaining_row << endl;

    //задаем размеры матриц на основе введенных данных
    //int arr_1[row_1][column_1], arr_2[row_2][column_2], arr_3[row_1][column_2];
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

    // выводим значения из матрицы 1:
    cout << "матрица 1:" << endl;
    for (int i=0;i<row_1;++i){
        for(int j=0;j<column_1;++j) {
            cout << arr_1[i][j] << " ";
        }
        cout << endl;
    }
    // выводим значения из матрицы 2:
    cout << "матрица 2:" << endl;
    for (int i=0;i<row_2;++i){
        for(int j=0;j<column_2;++j) {
            cout << arr_2[i][j] << " ";
        }
        cout << endl;
    }
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
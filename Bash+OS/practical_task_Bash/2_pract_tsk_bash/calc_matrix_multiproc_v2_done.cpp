#include <iostream>
#include <ctime>
#include <sys/wait.h>
#include <unistd.h> // библиотека дает возможность работать с процессами
using namespace std;

// задаем переменные размера матриц
int row_1, column_1, row_2, column_2;

// функция определения размеров исходных матриц:
void sizeMatrix() {
    cout << "Введите количество строк и столбцов первой матрицы: " << endl;
    cin >> row_1 >> column_1;

    cout << "Введите количество строк и столбцов второй матрицы: " << endl;
    cin >> row_2 >> column_2;
}
// функция проверки ошибки размеров матриц:
void sizeError() {
    while (column_1 != row_2 ) {
        cout << "Неправильный размер матриц!\nПеремножение невозможно!\n";
        cout << "(Количество столбцов матрицы1 должно быть равно количеству строк матрицы2)\n";
        cout << "Ввести размеры повторно?(y/n)" << endl;
        char answ;
        cin >> answ;
        if(answ=='y'){
            // ввод размеров матриц повторно
            sizeMatrix();
        } else exit(0);
    }
}



int main()
{
    sizeMatrix();
    sizeError();

    //задаем размеры матриц на основе введенных данных
    int arr_1[row_1][column_1], arr_2[row_2][column_2], arr_3[row_1][column_2];

    cout << "Ввести случайные значения в матрицы (r) или ввести вручную (m)?" << endl;
        char answer;
        cin >> answer;
        if (answer == 'r')
        {
        // вводим случайные значения в матрицу 1:
        for (int i = 0; i < row_1; i++) {
            for (int j = 0; j < column_1; j++) {
                arr_1[i][j] = 0;
                arr_1[i][j] = rand() % 1000;
            }
        }
        // вводим случайные значения в матрицу 2:
        for (int i = 0; i < row_2; i++) {
            for (int j = 0; j < column_2; j++) {
                arr_2[i][j] = 0;
                arr_2[i][j] = rand() % 1000;
            }
        }
        } else {
            // вводим значения в матрицу 1 вручную:
            cout << "Введите " << row_1*column_1 << " значений матрицы 1:" << endl;
            for (int i=0; i < row_1; ++i) {
                for(int j=0; j < column_1; ++j) {
                    arr_1[i][j] = 0;
                    cin >> arr_1[i][j];
                }
            }
            // вводим значения в матрицу 2 вручную:
            cout << "Введите " << row_2*column_2 << " значений матрицы 2:" << endl;
            for (int i=0; i < row_2; ++i) {
                for(int j=0; j < column_2; ++j) {
                    arr_2[i][j] = 0;
                    cin >> arr_2[i][j];
                }
            }
        }
    for(int i=0; i < row_1; ++i){
            for (int j=0; j<column_2; ++j){
                arr_3[i][j] = 0; // обнуляем значения матрицы 3
            }
    }

    // делим вычисления значений матрицы 3 на два процесса:
    int fd1[2];
    int fd2[2];

    pid_t p;

    if (pipe(fd1) == -1)
    {
        fprintf(stderr, "Pipe failed");
        return 1;
    }
    if (pipe(fd2) == -1)
    {
        fprintf(stderr, "Pipe failed");
        return 1;
    }
    
    p = fork();

    if (p < 0)
    {
        fprintf(stderr, "fork Failed");
        return 1;
    }
    // Родительский процесс
    else if (p > 0)
    {
        int tempArr[100][100];
        
        // выводим значения из матрицы 1:
        cout << "матрица 1:" << endl;
        for (int i=0;i<row_1;++i) {
            for(int j=0;j<column_1;++j) {
                    cout << arr_1[i][j] << " ";
            }
            cout << endl;
        }
        // выводим значения из матрицы 2:
        cout << "матрица 2:" << endl;
        for (int i=0;i<row_2;++i) {
            for(int j=0;j<column_2;++j) {
                cout << arr_2[i][j] << " ";
            }
            cout << endl;
        }

        close(fd1[0]); // закрываем запись первого пайпа

        wait(NULL); // ожидаем данные от ребенка

        close(fd2[1]); // закрываем чтение второго пайпа
        // считываем данные от ребенка
        read(fd2[0], arr_3, 10000);
        

        // выводим значения из матрицы 3:
        cout << "Результат умножения - матрица 3:" << endl;
        for (int i=0;i<row_1;++i) {
            for(int j=0;j<column_2;++j){
                cout << arr_3[i][j] << " ";
            }
            cout << endl;
        }

        close(fd1[0]);// закрываем чтение первого и второго пайпа
        close(fd2[0]);
    
            cout << endl;
            cout << "runtime = " << clock()/1000.0 << endl; // время работы программы 
    }
    // процесс ребенок
    else
    {
        int tempArr[100][100];
        close(fd1[1]); // закрываем запись первого пайпа
        
        // вычисляем и записываем значения во временный массив:
        for(int i=0; i < row_1; ++i){
            for (int j=0; j<column_2; ++j){
                //arr_3[i][j] = 0; // обнуляем значения матрицы 3
                for (int n=0; n<column_1; ++n){
                    arr_3[i][j] = arr_3[i][j] + arr_1[i][n]*arr_2[n][j]; 
                }
            }
        }
                    cout << endl;
                    // закрываем чтение обоих концов
                    close(fd1[0]);
                    close(fd2[0]);
                    
                    // записываем массив в конец и закрываем запись конца второго пайпа10
                    write(fd2[1], arr_3, 10000);
                    close(fd2[1]);
    }

    return 0;

}
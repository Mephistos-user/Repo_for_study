#include <iostream>
using namespace std;
// задаем переменные размера матриц
int row_1, column_1, row_2, column_2;

// функция определения размеров исходных матриц:
void sizeMatric() {
    cout << "Введите количество строк и столбцов первой матрицы: " << endl;
    cin >> row_1 >> column_1;

    cout << "Введите количество строк и столбцов второй матрицы: " << endl;
    cin >> row_2 >> column_2;
}
// функция проверки ошибки размеров матриц:
void sizeError() {
    while (column_1 != row_2 ) {
        cout << "Неправильный размер матриц!\nПеремножение невозможно!\n(Количество столбцов матрицы1 должно быть равно количеству строк матрицы2)\nВвести размеры повторно?(y/n)" << endl;
        string answ;
        cin >> answ;
        if(answ=="y"){
            // ввод размеров матриц повторно
            sizeMatric();
        } else exit(0);
    }
}

int main() {

sizeMatric();
sizeError();

//задаем размеры матриц на основе введенных данных
int arr_1[row_1][column_1], arr_2[row_2][column_2], arr_3[row_1][column_2];

// вводим значения в матрицу 1:
cout << "Введите " << row_1*column_1 << " значений матрицы 1:" << endl;
for (int i=0;i<row_1;++i){
    for(int j=0;j<column_1;++j){
        cin >> arr_1[i][j];
    }
}
// вводим значения в матрицу 2:
cout << "Введите " << row_2*column_2 << " значений матрицы 2:" << endl;
for (int i=0;i<row_2;++i){
    for(int j=0;j<column_2;++j){
        cin >> arr_2[i][j];
    }
}
// выводим значения из матрицы 1:
cout << "матрица 1:" << endl;
for (int i=0;i<row_1;++i){
    for(int j=0;j<column_1;++j){
        cout << arr_1[i][j] << " ";
    }
    cout << endl;
}
// выводим значения из матрицы 2:
cout << "матрица 2:" << endl;
for (int i=0;i<row_2;++i){
    for(int j=0;j<column_2;++j){
        cout << arr_2[i][j] << " ";
    }
    cout << endl;
}
// обнуляем значения матрицы 3
for(int i=0;i < row_1; ++i){
    for (int j=0;j<column_2; ++j){
            arr_3[i][j]=0;
    }  
}
// вычисляем и записываем значения в матрицу3
for(int i=0;i < row_1; ++i){
    for (int j=0;j<column_2; ++j){
        for (int n=0; n<column_1; ++n){
            arr_3[i][j]=arr_3[i][j]+arr_1[i][n]*arr_2[n][j];
        }
    }
}
// выводим значения из матрицы 3:
cout << "матрица 3:" << endl;
for (int i=0;i<row_1;++i){
    for(int j=0;j<column_2;++j){
        cout << arr_3[i][j] << " ";
    }
    cout << endl;
}
    return 0;
}
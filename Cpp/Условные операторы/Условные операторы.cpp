#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>//библиотека математических функций

using namespace std;

int main()
{
	//стандартный условный оператор
	int x, y;
	cin >> x >> y;
	if (x < y) {
		cout << "x < y" << endl;//если операция одна то можно не использовать фигурные скобки: if (x < y) cout << "x < y" << endl;
	}
	else {
		cout << "x >= y" << endl;/* если операций несколько  то можно не использовать фигурные скобки, а операции разделить запятой :
									if (x < y) cout << "x < y" << endl, cout << "x >= y" << endl;*/
	}

	//сокращенный (тернарный) условный оператор
	cout << ((x < y) ? "x < y" : "x >= y") << endl;


	char oper;
	cin >> oper;
	cout << "Operation result:\n ";

	switch (oper)
	{
	case '+':
		cout << x + y;
		break;// break нужен для прерывания проверки если условие выполнено
	case '-':
		cout << x - y;
		break;
	case '*':
		cout << x * y;
		break;
	case '/':
		cout << x / y;
		break;

	default:// если ни одно условие не выполнено
		cout << "No such operator";
		break;
	}

}
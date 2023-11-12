#include <iostream>


using namespace std;

int main()
{
	int x, y;

	cout << "Enter start and finish integer:" << endl;
	cin >> x >> y;

	for (int i = x; i <= y; i++) {
		if (i % 2 == 0) cout << i << ' ';
	}
}
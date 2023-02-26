#include <iostream>
#include <cmath>
using namespace std;

int main(void)
{

	cin.tie(NULL);
	ios::sync_with_stdio(false);

	int coin;

	cin >> coin;

	if ((coin % 5) % 2 == 0)
		cout << coin / 5 + coin % 5 / 2 << "\n";
	else if (coin / 5 == 0)
		cout << "-1\n";
	else
		cout << coin / 5 + (coin % 5 + 5) / 2 - 1 << "\n";

	return 0;
}
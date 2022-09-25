/* 하노이탑 이동 순서 */
#include <iostream>
using namespace std;

void Hanoi(int n, char from, char by, char to)
{   // n개의 탑을 from에서 to로 옮기는 방법
    if (n==1)
        cout << from << "=>" << to << endl;
    else {
        Hanoi(n-1, from, to, by);
        Hanoi(1, from, by, to);
        Hanoi(n-1, by, from, to);
    }
}
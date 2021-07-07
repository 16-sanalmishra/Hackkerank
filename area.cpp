#include <iostream>
#include <math.h>
using namespace std;

float findArea(int s, int a, int b, int c)
{
    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || c + b <= a)
    {
        cout << "The triangle is not possible";
        exit(0);
    }
    float h = (a + b + c) / 2.0;
    float area = (s * s) - (sqrt(h * (h - a) * (h - b) * (h - c)));

    return area;
}

int main()
{
    int s = 8, a = 3, b = 2, c = 2;
    cout << "Area is: " << findArea(s, a, b, c);
    return 0;
}
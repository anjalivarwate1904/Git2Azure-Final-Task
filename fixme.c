#include <stdio.h>

int fibonacci(int n) {
    if (n <= 0) return 0;
    if (n == 1) return 1; 
    
    int a = 0, b = 1, temp=0;
    for (int i = 2; i <= n; i++) {
        temp = b + a;
        a = b;
        b = temp; //fix me
    }
    return b;
}

int main() {
    int n = 10;
    printf("The %dth Fibonacci number is: %d\n", n, fibonacci(n));
    return 0;
}

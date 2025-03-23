#include <iostream>
using namespace std;

// Function to generate Fibonacci series up to n terms
void fibonacci(int n) {
    int first = 0, second = 1, next;

    cout << "Fibonacci Series: ";
    for (int i = 0; i < n; i++) {
        // Print the current term
        if (i == 0) {
            cout << first << " ";
            continue;
        }
        if (i == 1) {
            cout << second << " ";
            continue;
        }

        // Compute the next term
        next = first + second;
        cout << next << " ";
        first = second;
        second = next;
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Enter the number of terms: ";
    cin >> n;

    // Call the function with the correct argument
    if (n <= 0) {
        cout << "Please enter a positive integer." << endl;
    } else {
        fibonacci(n);
    }

    return 0;
}

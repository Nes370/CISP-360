/**
 * Exercise 3: Formatted I/O
 * Nathan Saugstad
 */
#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {

    bool first;
    int second;
    long third;
    float fourth;
    float fifth;
    double sixth;

    cout << "Enter bool, int, long, float, float, and double values: ";
    cin >> first >> second >> third >> fourth >> fifth >> sixth;
    cout << endl;

// ***** Solution starts here ****

    cout << first << ' ' << boolalpha << first << endl;
    cout << second << ' ' << hex << showbase << second << ' ' << oct << second << endl;
    cout << setw(16) << dec << third << endl;
    // Is there a way to accomplish this using only manipulators?
    cout << ((fourth < 0) ? '-' : '+') << setw(12) << setprecision(4) << right << showpoint << fabs(fourth) << endl;
    cout << setw(15) << scientific << setprecision(4) << fourth << endl;
    cout << setprecision(7) << fifth << endl;
    cout << setw(17) << fixed << setprecision(3) << fifth << endl;
    cout << third << endl;
    cout << setw(16) << setprecision(2) << fourth << endl;
    cout << setw(13) << setprecision(0) << noshowpoint << sixth << endl;
    cout << setw(14) << setprecision(8) << fourth << endl;
    cout << setw(16) << defaultfloat << setprecision(6) << showpoint << sixth << endl;

// ***** Solution ends here ****

    cin.get();
    return 0;

}

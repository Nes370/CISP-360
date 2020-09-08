#include <iostream>
#include <cmath>
#include <limits>

using namespace std;

int main() {

    double maximumSpeed, minimumSpeed;
    cout << "Enter a minimum and maximum speed (in revolutions per minute): ";
    cin >> minimumSpeed >> maximumSpeed;

    while(cin.fail() || minimumSpeed <= 0 || maximumSpeed <= 0) {
        if(cin.fail()) {
            cout << "Your input was invalid. Please try again." << endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
        } else {
            cout << "You must enter two positive number values. Please try again." << endl;
        }

        cout << "Enter a minimum and maximum speed (in revolutions per minute): ";
        cin >> minimumSpeed >> maximumSpeed;
    }

    if(maximumSpeed < minimumSpeed) {
        double temp = maximumSpeed;
        maximumSpeed = minimumSpeed;
        minimumSpeed = temp;
    }

    double speedRatio = pow(maximumSpeed / minimumSpeed, 0.2);
    cout << "The ratio between successive speeds of a six-speed gearbox"
        << "\nwith a minimum speed of " << minimumSpeed
        << " rpm and a maximum speed of " << maximumSpeed
        << " rpm is " << speedRatio << endl;

    for(int i = 0; i < 6; i++)
        cout << "Speed " << i + 1 << " is " << minimumSpeed * pow(speedRatio, i) << " rpm" << endl;

}

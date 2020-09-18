/**
 * Exercise 6: Reverse Engineering repetition exercise
 * Group 5
 * William Ramirez
 * Nathan Saugstad
 * Daniel Wiggins
 */
#include <cmath>
#include <iostream>
#include <iomanip>

using namespace std;

int main0() {

    bool quit, repeat;
    char c;
    double lowestGallon, highestGallon;
    int incrementRate;

    cout <<  "This program creates a gallons to liters conversion table." << endl;
    // Input control loop
    do {
        // lowestGallon prompt loop
        quit = false;
        do {
            cout << "\nEnter the lowest gallon value to display (q to quit): ";
            cin >> lowestGallon;

            if(cin.fail()) {
                cin.clear();
                cin >> c;
                // Abort on 'q'
                if(c == 'q') {
                    quit = true;
                    cout << "\n\nAborting; no conversion performed." << endl;
                } else {
                    repeat = true;
                    cout << "\nYou entered an illegal character: (" << c << ')' << endl;
                }
            } else repeat = false;

        } while(!quit && repeat);

        // highestGallon prompt loop
        if(!quit) do {
            cout << "\nEnter the highest gallon value to display (q to quit): ";
            cin >> highestGallon;

            if(cin.fail()) {
                cin.clear();
                char c;
                cin >> c;
                // Abort on 'q'
                if(c == 'q') {
                    quit = true;
                    cout << "\n\nAborting; no conversion performed." << endl;
                } else {
                    repeat = true;
                    cout << "\nYou entered an illegal character: (" << c << ')' << endl;
                }
            } else repeat = false;
        } while(!quit && repeat);

        // Report any errors
        if(!quit) {
            cout << '\n' << endl;
            if(lowestGallon < 0) {
                repeat = true;
                cout << "Error: low gallon value must not be negative." << endl;
            }
            if(highestGallon < 0) {
                repeat = true;
                cout << "Error: high gallon value must not be negative." << endl;
            }
            if(highestGallon - floor(lowestGallon) > 1000) { // see 0.9 and 1000.1
                repeat = true;
                cout << "Error: total gallon range must be less than or equal to 1000." << endl;
            }
            if(lowestGallon > highestGallon) {
                repeat = true;
                cout << "Error: high gallon value must be larger than or equal to the low gallon value." << endl;
            }
            if(repeat)
                cout << "Please re-enter low and high gallon values correctly.\n" << endl;
        }

    } while(!quit && repeat);

    if(!quit) {

        double range = highestGallon - floor(lowestGallon); // see 1000.2 and 1010.1 behavior

        // calculate increment rate
        if(range > 100)
            incrementRate = 20;
        else if(range > 50)
            incrementRate = 10;
        else if(range > 10)
            incrementRate = 5;
        else incrementRate = 1;

        // Round values according to increment rate
        if(incrementRate == 1) {
            lowestGallon = floor(lowestGallon);
            highestGallon = ceil(highestGallon);
        } else {
            if(static_cast<int>(lowestGallon) % incrementRate < 1)
                lowestGallon = floor(lowestGallon);
            else lowestGallon = ceil(lowestGallon / incrementRate) * incrementRate;

            // see 0 and 39.0 behavior vs. 0 and 39.1
            // determines if value is within 1 of the next increment
            if(static_cast<int>(highestGallon) % incrementRate >= incrementRate - 1
                    // only numbers with non-zero fractional digits will be rounded, e.g. 39.0 -> 35.0, 39.1 -> 40
                    && highestGallon - (static_cast<int>(highestGallon) % incrementRate) * incrementRate > 0)
                highestGallon = ceil(highestGallon);
            else highestGallon = floor(highestGallon / incrementRate) * incrementRate;
        }

        cout << "The conversion table will be created for the gallon range\n"
             << "of " << fixed << setprecision(1) << lowestGallon << " to " << setprecision(1) << highestGallon
             << " in increments of " << setprecision(1) << static_cast<double>(incrementRate) << '\n' << endl;

        cout << setw(21) << "GALLONS TO LITERS\n"
             << setw(21) << "CONVERSION TABLE \n"
             << setw(21) << "Gallons    Liters\n"
             << setw(20) << "=======   =======" << endl;

        int i = 0;
        double iterativeValue;
        do {
            iterativeValue = lowestGallon + incrementRate * i;
            cout << setw(9) << setprecision(1) << iterativeValue << setw(11) << setprecision(3) << (iterativeValue * 3.785) << endl;
            i++;
        } while(iterativeValue < highestGallon);

    }

    return 0;

 }

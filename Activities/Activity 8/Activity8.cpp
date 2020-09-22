/**
 * Activity 8: Random Number Simulation
 * Nathan Saugstad
 */
#include <cstdlib>
#include <ctime>
#include <iostream>

using namespace std;

int main() {

    srand(time(NULL));

    bool quit;
    do {

        int number1 = rand() % 12 + 1,
            number2 = rand() % 12 + 1,
            input, answer;

        answer = number1 * number2;

        do {

            cout << "How much is " << number1 << " times " << number2 << '?' << endl;

            cin >> input;
            quit = input == -1;

            if(!quit) {
                if(input != answer)
                    cout << "No. Please try again." << endl;
                else cout << "Very good!" << endl;
            }

        } while(!quit && input != answer);

    } while(!quit);

    return 0;

}
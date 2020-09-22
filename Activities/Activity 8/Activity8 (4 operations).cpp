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
            operation = rand() % 4,
            input, answer;

         switch(operation) {
            case 0: answer = number1 + number2; break;
            case 1: answer = number1 - number2; break;
            case 2: answer = number1 * number2; break;
            case 3: answer = number1 / number2; break;
         }

        answer = number1 * number2;

        do {

            switch(operation) {
                case 0: cout << "How much is " << number1 << " plus " << number2 << '?' << endl; break;
                case 1: cout << "How much is " << number1 << " minus " << number2 << '?' << endl; break;
                case 2: cout << "How much is " << number1 << " times " << number2 << '?' << endl; break;
                case 3: cout << "How much is " << number1 << " divided by " << number2 << '?' << endl; break;
            }

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
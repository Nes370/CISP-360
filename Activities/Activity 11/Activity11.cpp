/**
 * Activity 11: One-dimensional arrays
 * Nathan Saugstad
 */
#include <cstdlib>
#include <ctime>
#include <iostream>

using namespace std;

int main() {

    srand(time(NULL));

    int lottery[5];
    for(int i = 0; i < 5; i++)
        lottery[i] = rand() % 10;

    int user[5];
    int index = 0;
    do {
        cout << "Choose a number between 0 and 9: ";
        cin >> user[index];

        if(cin.fail()) {
            cin.clear();
            cin.ignore(256, '\n');
            index--;
            cout << "Error: please enter a valid integer." << endl;
        } else if(user[index] < 0 || user[index] > 9) {
            index--;
            cout << "Error: please enter an integer between 0 and 9." << endl;
        }

        index++;
    } while(index < 5);

    int matches = 0;
    for(int i = 0; i < 5; i++)
        if(lottery[i] == user[i])
            matches++;

    cout << "The winning numbers are: " << endl;
    for(int i = 0; i < 5; i++)
        cout << lottery[i] << ' ';
    cout << "\nYour numbers are: " << endl;
    for(int i = 0; i < 5; i++)
        cout << user[i] << ' ';
    cout << '\n' << matches << " of your numbers are a match." << endl;
    if(matches == 5)
        cout << "You are a GRAND PRIZE WINNER!" << endl;

    return 0;
}
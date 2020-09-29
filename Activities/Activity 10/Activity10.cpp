/**
 * Activity 10: Functions, Nested repetition, User Input Validation
 * Nathan Saugstad
 */
#include <iostream>

using namespace std;

void checkerboard(int width);
void getWidth(int& input);

// step 1
const int MAX_WIDTH = 40,
          MAX_HEIGHT = MAX_WIDTH / 2;

int main() {

    // step 6
    int width;
    getWidth(width);

    // step 2
    checkerboard(width);

    return 0;

}

// step 3
void checkerboard(int width) {

    for(int i = 0; i < MAX_HEIGHT; i++) {
        bool a = i / width % 2; // minor optimization
        for(int j = 0; j < MAX_WIDTH; j++) {

            // step 8
            // Uses an XOR ^ to determine what to print.
            // e.g. 0 ^ 0 -> false, 0 ^ 1 -> true, 1 ^ 1 -> false, 1 ^ 0 -> true
            if(a ^ j / width % 2)
                cout << '*';
            else cout << '.';

        }
        cout << endl;
    }

}

// step 4
void getWidth(int& input) {

    bool valid;
    do {
        valid = true;

        cout << "Enter an integer in the range of 1 to " << MAX_WIDTH << ": ";

        cin >> input;

        // step 5
        if(cin.fail()) {
            cin.clear();
            cin.ignore(256, '\n');
            valid = false;
            cout << "Error: You must enter a valid integer value." << endl;
        } else if(input < 1 || input > MAX_WIDTH) {
            valid = false;
            cout << "Error: You must enter an integer in the range of 1 to " << MAX_WIDTH << '.' << endl;
        }
    } while(!valid);

}
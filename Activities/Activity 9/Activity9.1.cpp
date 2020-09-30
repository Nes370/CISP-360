/**
 * Activity 9.1: File Input and Output
 * Nathan Saugstad
 */
#include <iostream>
#include <fstream>

using namespace std;

int main() {

    ofstream fout;
    fout.open("scores.txt");

    if(!fout)
        cout << "Error: scores.txt could not be opened." << endl;;
    else {
        bool quit;
        do {
            int input[3];
            cout << "Enter 3 integer bowling scores: ";
            cin >> input[0] >> input[1] >> input[2];
            quit = input[0] == -1 && input[1] == -1 && input[2] == -1;
            if(!quit)
                fout << input[0] << ' ' << input[1] << ' ' << input[2] << endl;
        } while(!quit);
        fout.close();

        ifstream fin;
        fin.open("scores.txt");
        if(!fin)
            cout << "Error: scores.txt could not be opened." << endl;
        else {
            double sum = 0;
            int i;
            for(i = 0; !fin.eof(); i++) {
                int n;
                fin >> n;
                if(i % 3 == 2)
                    sum += n;
            }
            fin.close();
            cout << "Average third score: " << sum / (i / 3) << endl;
        }
    }

    return 0;
}
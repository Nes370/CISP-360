#include <iostream>
#include <fstream>
#include <cstdlib>
#define INPUT_FILE "data.txt"
using namespace std;
int
main()
{
    double sum = 0.0, first, second;
    fstream fin;
    fin.open(INPUT_FILE, ios::in);
    if (!fin) exit(1);
    fin >> first;
    while ( !fin.eof() )
    {   fin >> second;
        sum += first + second;
        cout << "sum is " << sum << endl;
        fin >> first; }
    fin.close();
    return(0);
}
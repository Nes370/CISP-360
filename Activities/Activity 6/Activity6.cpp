/**
 * Activity 6: Selection, and the failbit
 * Grant Loofbourrow
 * Nathan Saugstad
 * Ana Solis
 */
#include <iostream>

int main() {

    int number, status;
    std::cout << "Enter integer to test: ";
    std::cin >> number; //take integer for switch

    if(std::cin.fail()) {

        status = 1;

        std::cin.clear();
        char c;
        std::cin.get(c);
        std::cout << "Oops, you entered: " << c << std::endl;

    } else {

        status = 0;

        switch(number) {
            case 1:
                std::cout << "good" << std::endl;
                break;
            case 2:
                std::cout << "better" << std::endl;
                break;
            case 3:
                std::cout << "best" << std::endl;
               break;
            default:
                std::cout << "value out of range" << std::endl;
                break;
        }

    }

    return status;

}

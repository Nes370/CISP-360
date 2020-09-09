/*
 * Implement the C++ program Miles Per Gallon: A car holds 12 gallons
 * of gasoline and can travel 350 miles before refueling. Write a
 * program that calculates the number of miles per gallon the car gets.
 * Display the result on the screen. Clearly label all output, variables
 * names must be relevant, and use symbolic constants! (Hint: define 12
 * and 350 as appropriately named constants.) Your program does not input
 * any data from the user. Miles per Gallon is Miles Driven divided by
 * Gallons of Gas used. Submit your .cpp file at the link below.
 */
 #include <iostream>

 const int GALLONS = 12;
 const int MILES = 350;

 int main() {

     std::cout << "A car that holds " << GALLONS
        << " gallons of gas and drives " << MILES << " miles gets\n"
        << static_cast<double>(MILES) / GALLONS << " miles per gallon of gas.";

 }

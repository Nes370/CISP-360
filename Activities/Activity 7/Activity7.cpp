/**
 * Activity 7: Comparing floating point values
 * Group 5
 * William Ramirez
 * Nathan Saugstad
 * Daniel Wiggins
 */
 #include <cmath>
 #include <iostream>

 using namespace std;

 int main() {

    double slope, yIntercept, x_1, y_1, ySolution, delta;

    // Prompt for slope, m
    cout << "This program verifies that a selected point is on a given line.\n"
         << "All input values may be integer or floating-point.\n"
         << "Enter slope: ";
    cin >> slope;

    // Prompt for y-axis intercept, B
    cout << "\nEnter y-intercept: ";
    cin >> yIntercept;

    // Prompt for X and Y coordinates
    cout << "\nEnter coordinates of the point: x y ";
    cin >> x_1 >> y_1;

    // Calculate Y = mX + B
    ySolution = slope * x_1 + yIntercept;

    // Calculate delta
    delta = 0.02 * fabs(ySolution);

    int status = 0;

    if(fabs(ySolution - y_1) <= delta) {
      status = 1;
      cout << "\nThe point is on the line.\n";
    } else  {
      cout << "\nThe point is NOT on the line.\n";
    }

    // Return result
    return status;

 }

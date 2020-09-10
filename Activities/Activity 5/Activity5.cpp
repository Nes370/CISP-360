/*
 * Activity 5: Expressions and formatted I/O
 * Group 5
 * Andriy Konyshev
 * Grant Loofbourrow
 * Nathan Saugstad
 */

#include <cmath> // for pow function
#include <iomanip> // for formatting output
#include <iostream> // for user input/output

using namespace std;

int main() {

    // Prompt for annual interest rate, Rate * 12
    double monthlyRate, loanAmount, numberOfMonths, monthlyPayment, totalAmountPaid;
    cout << "Enter an annual interest rate: ";
    cin >> monthlyRate;
    monthlyRate /= 1200.0;

    // Prompt for loan amount, L
    cout << "Enter the loan amount: ";
    cin >> loanAmount;

    // Prompt for number of monthly payments, N
    cout << "Over how many months will you pay this loan? ";
    cin >> numberOfMonths;

    // Payment = (Rate * pow(1 + Rate, N)) / (pow(1 + Rate, N) - 1) * L
    monthlyPayment = (monthlyRate * pow(1 + monthlyRate, static_cast<double>(numberOfMonths)))
         / (pow(1 + monthlyRate, static_cast<double>(numberOfMonths)) - 1) * loanAmount;

    // Discard trailing decimal digits
    monthlyPayment = static_cast<int>(monthlyPayment * 100) / 100.0;

    totalAmountPaid = monthlyPayment * numberOfMonths;

    // Display formatted output
    // Right-aligned labels
    // Values aligned by digit magnitudes
    cout << fixed  << showpoint << setprecision(2);
    cout << setw(24) << "Loan Amount:" << "  $ " << setw(8) << loanAmount << '\n'
        << setw(24) << "Monthly Interest Rate:" << "    " << setw(8) << monthlyRate * 100 << "%\n"
        << setw(24) << "Number of Payments:" << "    " << setw(5) << static_cast<int>(numberOfMonths) << '\n'
        << setw(24) << "Monthly Payment:" << "  $ " << setw(8) << monthlyPayment << '\n'
        << setw(24) << "Amount Paid Back:" << "  $ " << setw(8) << totalAmountPaid << '\n'
        << setw(24) << "Interest Paid:" <<  "  $ " << setw(8) << totalAmountPaid - loanAmount << endl;

    return 0;

}

public class Loan {

    private double annualInterestRate; // encapsulated data fields
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() { // default constructor
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {    // constructor with args
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() { // accessor
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate; // mutator / setter method
    }

    public int getNumberOfYears() { // accessor
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) { // mutator / setter
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() { // accessor
        return getLoanAmount();
    }

    public void setLoanAmount(double loanAmount) {  // mutator / setter
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1/ Math.pow(1+monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}

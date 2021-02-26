// 6130260547 เถกิงศักดิ์ ดำรงมั่น Sec 870

public class Loan {

    private double rate; // อัตราดอกเบี้ย
    private int numberOfYears; // จำนวนปี
    private double amount; // จำนวนเงินกู้
    private java.util.Date loanDate; // วันที่กู้

    public Loan() {
        rate = 2.5;
        numberOfYears = 1;
        amount = 1000;
    }

    public Loan(double newRate, int newNumYear, double newAmount) {

        rate = newRate;
        numberOfYears = newNumYear;
        amount = newAmount;
        loanDate = new java.util.Date();
    }

    // ----getter method----
    public double getRate() {
        return this.rate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public double getAmount() {
        return this.amount;
    }

    public java.util.Date getLoanDate() {
        return this.loanDate;
    }
    // ---end getter method---

    // ----setter method------
    public void setRate(double newRate) {
        this.rate = newRate;
    }

    public void setNumofYear(int newNumYear) {
        this.numberOfYears = newNumYear;
    }

    public void setLoanAmount(double newAmount) {
        this.amount = newAmount;
    }
    // ----end setter method----

    public double getMonthlyPaymet() {

        double monthlyRate = this.rate / 100 * 12;
        int numOfMonth = this.numberOfYears * 12;
        double monthlyPaymet = (this.amount * monthlyRate) / (1 - (1 / Math.pow(1 + monthlyRate, numOfMonth)));

        return monthlyPaymet;
    }

    public double getTotalPayment() {

        return getMonthlyPaymet() * this.numberOfYears * 12;

    }

}

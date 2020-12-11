package com.company;

public class Main {

    public static void main(String[] args) {
	    Loan loan1 = new Loan("23463BDKS", 100000, "24 month", 10);
        Loan loan2 = new Loan("33563BDKB", 250000, "6 month", 10);
        Loan loan3 = new Loan("53618BDKK", 50000, "36 month", 20);
        Loan loan4 = new Loan("54697BDDQ", 375000, "12 month", 5);
        Loan loan5 = new Loan("12698BDKS", 300000, "18 month", 8);

        System.out.println(Loan.getAvg());
        System.out.println(Loan.getSum());
        System.out.println(Loan.getLoanQuantity());
    }
}

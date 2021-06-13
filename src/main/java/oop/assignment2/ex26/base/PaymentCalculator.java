package oop.assignment2.ex26.base;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double b, double apr, double p){
        double i = apr/(365*100);

        double temp = b/p;

        double temp1 = Math.pow((1+i),30);

        double temp2 = Math.log(1+i);

        double temp3 = Math.log(1 + temp *(1 - temp1));

        double n = (double) Math.ceil((-1 * temp3) / (temp2*30));

        return n;
    }
}

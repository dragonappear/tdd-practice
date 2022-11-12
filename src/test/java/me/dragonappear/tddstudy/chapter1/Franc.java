package me.dragonappear.tddstudy.chapter1;

public class Franc extends Money {

    public Franc(int amount,String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(this.amount * multiplier);
    }

}

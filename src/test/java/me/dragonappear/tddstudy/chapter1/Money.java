package me.dragonappear.tddstudy.chapter1;

public class Money {
    protected int amount;

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}

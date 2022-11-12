package me.dragonappear.tddstudy.chapter1;

public class Money {
    protected int amount;

    public boolean equals(Object obj) {
        Money dollar = (Money) obj;
        return amount == dollar.amount;
    }
}

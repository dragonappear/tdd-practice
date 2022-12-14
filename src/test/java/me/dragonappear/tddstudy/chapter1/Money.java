package me.dragonappear.tddstudy.chapter1;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && currency().equals(money.currency());
    }

    public static Money dollar(int amount) {
        return new Money(amount,"USD");
    }

    public static Money franc(int amount) {
        return new Money(amount,"CHF");
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String currency() {
        return this.currency;
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency;
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
        //return new Money(this.amount + addend.amount, currency);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(this.currency, to);

        return new Money(amount / rate, to);
    }
}

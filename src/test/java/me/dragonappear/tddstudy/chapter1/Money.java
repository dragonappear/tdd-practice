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

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String currency() {
        return this.currency;
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency;
    }

    public Expression plus(Money addend) {
        return new Money(this.amount + addend.amount, currency);
    }
}

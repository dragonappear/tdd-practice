package me.dragonappear.tddstudy.chapter1;

public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}

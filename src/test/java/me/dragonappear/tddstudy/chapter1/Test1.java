package me.dragonappear.tddstudy.chapter1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test1 {

    @Test
    void testDollarMultiplication(){
        Money five = Money.dollar(5);
        assertThat(Money.dollar(10)).isEqualTo(five.times(2));
        assertThat(Money.dollar(15)).isEqualTo(five.times(3));
    }

    @Test
    void testEquality() {
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
        assertThat(Money.franc(5)).isEqualTo(Money.franc(5));
        assertThat(Money.franc(5)).isNotEqualTo(Money.franc(6));
        assertThat(Money.franc(5)).isNotEqualTo(Money.dollar(5));
    }

    @Test
    void testCurrency() {
        assertThat("USD").isEqualTo(Money.dollar(1).currency());
        assertThat("CHF").isEqualTo(Money.franc(1).currency());
    }

    @Test
    void testDifferentClassEquality(){
        assertThat(new Money(10, "CHF")).isEqualTo(new Franc(10, "CHF"));
    }

}

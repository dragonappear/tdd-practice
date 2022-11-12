package me.dragonappear.tddstudy.chapter1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class test {

    @Test
    void testDollarMultiplication(){
        Dollar five = new Dollar(5);
        assertThat(new Dollar(10)).isEqualTo(five.times(2));
        assertThat(new Dollar(15)).isEqualTo(five.times(3));
    }

    @Test
    void testEquality() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
    }

    @Test
    void testFrancMultiplication(){
        Franc five = Franc Dollar(5);
        assertThat(new Franc(10)).isEqualTo(Franc.times(2));
        assertThat(new Franc(15)).isEqualTo(Franc.times(3));
    }
}

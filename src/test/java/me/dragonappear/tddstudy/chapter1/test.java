package me.dragonappear.tddstudy.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class test {

    @DisplayName("곱셈")
    @Test
    void 곱셈(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(10).isEqualTo(product.amount);

        product = five.times(3);
        assertThat(15).isEqualTo(product.amount);
    }

    @Test
    void testEquality() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
    }
}

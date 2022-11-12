package me.dragonappear.tddstudy.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class test {

    @DisplayName("곱셈")
    @Test
    void 곱셈(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assertions.assertThat(10).isEqualTo(product.amount);

        product = five.times(3);
        Assertions.assertThat(15).isEqualTo(product.amount);

    }
}

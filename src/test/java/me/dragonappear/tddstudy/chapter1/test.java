package me.dragonappear.tddstudy.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class test {

    @DisplayName("곱셈")
    @Test
    void 곱셈(){
        //given
        Dollar five = new Dollar(5);
        //when
        five.times(2);
        //then
        Assertions.assertThat(10).isEqualTo(five.amount);
    }
}

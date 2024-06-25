package sample.cafekiosk.unit.beverage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {
    @Test
    void getName() {
        Americano americano = new Americano();
        // junit의 assert
        // assertEquals(americano.getName(), "아메리카노");
        //assertj의 assert
        //이게 좀 더 명시적이다
        assertThat(americano.getName()).isEqualTo("아메리카노");
    }


    @Test
    void getPrice(){
        Americano americano = new Americano();
        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}
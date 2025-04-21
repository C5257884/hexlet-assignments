package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ErrorTest {
    @Test
    void negativeRadiusException() {
        var error = new NegativeRadiusException("");
        System.out.println("Error!"+error.getMessage());
        assertThat(error).isInstanceOf(Exception.class);
    }
}

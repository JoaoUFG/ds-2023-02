import br.ufg.util.NewtonCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {

    @DisplayName("Testes da Calculadora de Newton")
    @Test
    void testeCalculadora(){
        var calculadora = new NewtonCalculator();
        var marginError = 0.001;
        assertAll("numbers",
                () -> assertEquals(1.0, calculadora.obterRaizQuadrada(1.0,marginError),marginError),
                () -> assertEquals(1.732, calculadora.obterRaizQuadrada(3.0,marginError),marginError),
                () -> assertEquals(2.236,calculadora.obterRaizQuadrada(5.0,marginError),marginError)
        );

    }

}

package org.yourcompany.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class testcalculadora {
    @Test
    public void testCalcularEntradaCinema(){
        assertEquals(10, Calculadora.entradaCinema(10, false, false));
        assertEquals(7.48, Calculadora.entradaCinema(8, true, true));
    }
    @Test
    public void testCalcularNombreDigits() { 
        assertEquals(3,Calculadora.nombreDigits(123));
        assertEquals(4,Calculadora.nombreDigits(1234));
    }
    @Test
    public void testCalcularFactorial() { 
        assertEquals(6,Calculadora.calcularFactorial(3));
        assertEquals(24,Calculadora.calcularFactorial(4));
    }
    @Test
    public void testCalcularPotencia(){
        assertEquals(8, Calculadora.calcularPotencia(2, 3));
        assertEquals(9, Calculadora.calcularPotencia(3, 2));
    }
    @Test
    public void testCalcularSumarPrimersNumeros(){
        assertEquals(15, Calculadora.sumaPrimersNumeros(5));
        assertEquals(21, Calculadora.sumaPrimersNumeros(6));

    }

    @Test
    public void testCalculasSumaCuadrats(){
        assertEquals(5, Calculadora.sumaQuadrats(2));
        assertEquals(14, Calculadora.sumaQuadrats(3));
    }
}
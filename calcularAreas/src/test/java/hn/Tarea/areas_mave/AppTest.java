package hn.Tarea.areas_mave;
import org.junit.Test;

import hn.tareazohetareas.calcularAreas.GeometricCalculator;

import static org.junit.Assert.assertEquals;





/**
 * Unit test for simple App.
 */
public class AppTest

{
	@Test
    public void testCalcularAreaCirculo() {
        double radio = 5;
        double expectedArea = Math.PI * radio * radio;
        double actualArea = (double) GeometricCalculator.calcularAreaCirculo(radio);
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        double lado = 4;
        double expectedArea = lado * lado;
        double actualArea = GeometricCalculator.calcularAreaCuadrado(lado);
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        double base = 6;
        double altura = 8;
        double expectedArea = base * altura;
        double actualArea = GeometricCalculator.calcularAreaRectangulo(base, altura);
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        double base = 5;
        double altura = 10;
        double expectedArea = (base * altura) / 2;
        double actualArea = GeometricCalculator.calcularAreaTriangulo(base, altura);
       assertEquals(expectedArea, actualArea, 0.001);
    }
}

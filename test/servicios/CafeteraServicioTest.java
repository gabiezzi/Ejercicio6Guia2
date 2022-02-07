
package servicios;

import entidades.Cafetera;
import org.junit.*;
import static org.junit.Assert.*;



public class CafeteraServicioTest {
    
    Cafetera cafetera1;
    CafeteraServicio cs;
    
    @Before
    public void clase(){
        cafetera1 = new Cafetera(100,100);
        cs = new CafeteraServicio();
    }

    @Test
    public void testLlenarCafetera() {
        
        //Arrange
        Cafetera cafeteraTest = new Cafetera(100,0);
        Cafetera cafeteraTest2 = new Cafetera(200,130);
        double capacidadAux = 150;
        
        //Act
        double capacidadEsperada = cafetera1.getCapacidadMaxima();
        double capacidadRecibida = cafeteraTest.getCapacidadMaxima();
        double capacidadRecibida2 = cafeteraTest2.getCapacidadMaxima();
        
        //Assert
        
        assertNotEquals(cafetera1, cafeteraTest);
        assertNotNull("Cannot be empty", cafetera1);
        assertFalse(capacidadEsperada==capacidadRecibida2);
        assertTrue(capacidadEsperada==capacidadRecibida);
        assertFalse(capacidadAux==capacidadRecibida);
        
    }

    @Test
    public void testServirTaza() {
        
       cs.servirTaza(cafetera1);
    }

    @Test
    public void testVaciarCafetera() {
        
        cafetera1.setCapacidadMaxima(20);
        cafetera1.setCantidadActual(20);
        cs.vaciarCafetera(cafetera1);
        assertEquals(0, cafetera1.getCantidadActual(),0.0);
        assertEquals(20, cafetera1.getCapacidadMaxima(),0.0);
        
        
    }

    @Test
    public void testAgregarCafe() {
        
        cafetera1.setCapacidadMaxima(20);
        cafetera1.setCantidadActual(10);
        double agregarCafe = 5.5;
        cafetera1.setCantidadActual(cafetera1.getCantidadActual() + agregarCafe);
        assertEquals(15.5, cafetera1.getCantidadActual(),0.0);
        assertEquals(20, cafetera1.getCapacidadMaxima(),0.0);
        
        
    }
    
}

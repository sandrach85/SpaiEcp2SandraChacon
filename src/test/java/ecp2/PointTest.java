package ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;
    private Point pt2;

    @Before
    public void before() {
        pt = new Point(2, 3);
        pt2 = new Point(2);
    }

    @Test
    public void testPointIntInt(){
        assertEquals( pt.getX(),2);
        assertEquals( pt.getY(),3);
    }

    @Test
    public void testPointInt() {
        assertEquals( pt2.getX(),2);
        assertEquals( pt2.getY(),2);
    }

    @Test
    public void testPoint() {
        pt = new Point();
        assertEquals( pt.getX(),0);
        assertEquals( pt.getY(),0);
    }

    @Test
    public void testModule() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testPhase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslateOrigin() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals( pt.getX(),1);
        assertEquals( pt.getY(),2);
    }

    @Test
    public void testGetX() {
        assertEquals( pt.getX(),2);
    }

    @Test
    public void testGetY() {
        assertEquals( pt.getY(),3);
    }

    @Test
    public void testToString() {
        assertEquals("Point["+pt.getX()+","+pt.getY()+"]","Point[2,3]");
    }
    
    @Test
    public void testCambiarCoordenada(){
        pt.cambiarCoordenada(4,5);
        assertEquals(pt.getX(), 4);
        assertEquals(pt.getY(), 5);
    }

    @Test
    public void testLimitar(){
    	pt = new Point(-15,150);
    	assertEquals(-10,pt.getX());
    	assertEquals(100,pt.getY());
    }
}

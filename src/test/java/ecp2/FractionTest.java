package ecp2;

import static org.junit.Assert.*;
import ecp2.Fraction;

import org.junit.Before;
import org.junit.Test;


public class FractionTest {
    private Fraction fra;
    
    private Fraction fraction;

    @Before
    public void before() {
        fra = new Fraction(1, 2);
        this.fraction = new Fraction(6,3);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(fra.getNumerator(), 1);
        assertEquals(fra.getDenominator(), 2);
    }

    @Test
    public void testFraction() {
        fra = new Fraction();
        assertEquals(fra.getNumerator(), 1);
        assertEquals(fra.getDenominator(), 1);
    }

    @Test
    public void testDecimal() {
        assertTrue(fra.decimal() == 0.5);
    }

    @Test
    public void testGetNumerator() {
        assertEquals(fra.getNumerator(), 1);
    }

    @Test
    public void testGetDenominator() {
        assertEquals(fra.getDenominator(), 2);
    }
    
    @Test
    public void testMenor(){
        Fraction f2 = new Fraction(1,3);
        assertEquals(fra.menor(f2), f2 );
    }
    
    @Test 
    public void testEquivalentes(){
        Fraction f = new Fraction(2,3);
        assertTrue(!fraction.equivalentes(f));
        Fraction f1 = new Fraction(12,6);
        assertTrue(fraction.equivalentes(f1));
    }
    

    @Test
    public void testSuma() {
    	Fraction f3 = this.fra.sumar(new Fraction(2,5));
    	assertEquals(9, f3.getNumerator());
    	assertEquals(10, f3.getDenominator());
    }
}

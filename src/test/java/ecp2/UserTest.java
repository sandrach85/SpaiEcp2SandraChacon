package ecp2;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class UserTest {
    
    private User us;
    
    
    @Before
    public void before() {
        us = new User(1, "Sandra", "Chacon");
    }
    @Test
    public void testUser() {
        assertEquals( us.getNumber(),1);
        assertEquals(us.getName(),"Sandra");
        assertEquals(us.getFamilyName(),"Chacon");
    }

    @Test
    public void testFullName() {
       assertEquals( us.fullName(),"Sandra Chacon");
    }

    @Test
    public void testInitials() {
        assertEquals( us.initials(),"S.");
    }
    @Test
    public void testGetNumber() {
        assertEquals( us.getNumber(),1);
    }

    @Test
    public void testGetName() {
        assertEquals( us.getName(),"Sandra");
    }

    @Test
    public void testGetFamilyName() {
        assertEquals( us.getFamilyName(),"Chacon");
    }
    
    @Test 
    public void testGetFullNameInvert() {
        assertEquals(us.getFullNameInvert(), "Chacon, Sandra");
    }
    
    @Test
    public void testNombreMayusculas(){
    	assertEquals("SANDRA CHACON", us.nombreMayusculas());
    }

}
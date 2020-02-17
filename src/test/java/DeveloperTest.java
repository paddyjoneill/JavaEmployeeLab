import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Paddy", "JH123456C", 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Paddy", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JH123456C", developer.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, developer.getSalary(),0.01);
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(1000);
        assertEquals(26000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, developer.payBonus(), 0.01);
    }


}

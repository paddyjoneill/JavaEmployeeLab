import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Brian", "JH123456C", 25000, "sales", 100000);
    }

    @Test
    public void canGetName(){
        assertEquals("Brian", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JH123456C", director.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, director.getSalary(),0.01);
    }

    @Test
    public void canGetDept(){
        assertEquals("sales", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(26000, director.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }

    @Test
    public void canSetName(){
        director.setName("Steve");
        assertEquals("Steve", director.getName());
        director.setName(null);
        assertEquals("Steve", director.getName());
    }

    @Test
    public void cantHaveNegativeSalaryRaise(){
        director.raiseSalary(-1000);
        assertEquals(25000, director.getSalary(),0.01);
    }



}



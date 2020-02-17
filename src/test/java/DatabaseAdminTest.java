import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Paul", "JH654321C", 20000);
    }


    @Test
    public void canGetName(){
        assertEquals("Paul", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JH654321C", databaseAdmin.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(21000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, databaseAdmin.payBonus(), 0.01);
    }

}

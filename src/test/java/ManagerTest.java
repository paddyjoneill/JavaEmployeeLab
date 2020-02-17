import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Brian", "JH123456C", 25000, "sales");
    }

    @Test
    public void canGetName(){
        assertEquals("Brian", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JH123456C", manager.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, manager.getSalary(),0.01);
    }

    @Test
    public void canGetDept(){
        assertEquals("sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(26000, manager.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, manager.payBonus(), 0.01);
    }
}

package staff;

public class Employee {
    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getnINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if(raise > 0) {
            salary += raise;
        }
    }

    public double payBonus(){
        return 0.01 * salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}

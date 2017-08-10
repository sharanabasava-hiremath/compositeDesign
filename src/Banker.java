import java.util.ArrayList;
import java.util.List;

public class Banker {
    private String name;
    private String dept;
    private int salary;
    private List<Banker> subordinates;

    // constructor
    public Banker(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Banker>();
    }


    public void add(Banker e) {
        subordinates.add(e);
    }

    public void remove(Banker e) {
        subordinates.remove(e);
    }

    public List<Banker> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Banker-->Name : " + name + ", dept : " + dept + ", salary :" + salary);
    }
}

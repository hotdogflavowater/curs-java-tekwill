package homeWork6.employee;

public class Programmer extends Employee implements Employee.Attendee  {
    public Programmer(String name, int id) {
        super(name, id);
    }


    @Override
    public void attendTraining() {
        System.out.println(getName() + " attends training");
    }
}

package homeWork6.employee;

public class Manager extends Employee implements Attendee, Interviewer {
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void attendTraining() {
        System.out.println(getName() + " attends training");
    }

    @Override
    public void conductInterview() {
        System.out.println(getName() + " conducts interview");
    }


}

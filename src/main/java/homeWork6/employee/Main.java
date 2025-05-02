package homeWork6.employee;

import homeWork6.meetingRoom.MeetingRoom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 1);
        Programmer programmer = new Programmer("Bob", 2);

        manager.attendTraining();
        manager.conductInterview();

        programmer.attendTraining();

        List<Employee.Attendee> trainingGroup = new ArrayList<>();
        trainingGroup.add(manager);
        trainingGroup.add(programmer);

        MeetingRoom meetingRoom = new MeetingRoom(trainingGroup);
        meetingRoom.startTraining();
    }
}

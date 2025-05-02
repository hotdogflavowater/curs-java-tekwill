package homeWork6.meetingRoom;

import homeWork6.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {
    private List<Employee.Attendee> attendees;

    public MeetingRoom(List<Employee.Attendee> attendees) {
        this.attendees = attendees;
    }

    public void startTraining() {
        for (Employee.Attendee a : attendees) {
            a.attendTraining();
        }
    }
}

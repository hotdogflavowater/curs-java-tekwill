package homeWork6.meetingRoom;

import homeWork6.employee.Attendee;
import homeWork6.employee.Employee;
import homeWork6.employee.Manager;

import java.util.List;

public class MeetingRoom {
    private List<Attendee> attendees;

    public MeetingRoom(List<Attendee> attendees) {
        this.attendees = attendees;
    }

    public void startTraining() {
        for (Attendee a : attendees) {
            a.attendTraining();
        }
    }
}

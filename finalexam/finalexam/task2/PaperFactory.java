package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    // Method to add a Person to the staff list
    public void addPerson(Person p) {
        staff.add(p);
    }

    // Method to delete a Person from the staff list
    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    // Method to get the list of staff
    public List<Person> getStaff() {
        return new ArrayList<>(staff); // Return a copy to prevent external modification
    }
}


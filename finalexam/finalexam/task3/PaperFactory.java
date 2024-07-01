package finalexam.task3;

import java.io.*;
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

    // Method to save the staff list to a file
    public void saveStaffListToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(staff);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load the staff list from a file
    public void loadStaffListFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            staff = (List<Person>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}



package finalexam.task3;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Add a unique identifier for serialization

    String name;
    String surname;
    String personalNumber;

    // Constructor
    public Person(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + ", personalNumber=" + personalNumber + "]";
    }
}


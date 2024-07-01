package finalexam.task3;


import finalexam.task2.PaperFactory;
import finalexam.task2.Person;

public class FactoryTester {
    public static void main(String[] args) {
        // Create an instance of PaperFactory
        PaperFactory factory = new PaperFactory();

        // Create and add Person objects directly
        Person person1 = new Person("Alice", "Smith", "123-45-6789");
        Person person2 = new Person("Bob", "Johnson", "987-65-4321");

        factory.addPerson(person1);
        factory.addPerson(person2);

        // Print the staff list
        System.out.println("Staff list after adding persons:");
        factory.getStaff().forEach(System.out::println);

        // Test deleting a person
        boolean deleted = factory.deletePerson(person1);
        System.out.println("Deleted Alice: " + deleted);

        // Print the staff list after deletion
        System.out.println("Staff list after deleting Alice:");
        factory.getStaff().forEach(System.out::println);

        // Additional tests
        testAddPerson(factory);
        testDeletePerson(factory);
    }

    // Method to test adding a person
    public static void testAddPerson(PaperFactory factory) {
        Person person = new Person("Charlie", "Brown", "555-55-5555");
        factory.addPerson(person);
        assert factory.getStaff().contains(person) : "Add person test failed";
        System.out.println("Add person test passed");
    }

    // Method to test deleting a person
    public static void testDeletePerson(PaperFactory factory) {
        Person person = new Person("Dana", "White", "666-66-6666");
        factory.addPerson(person);
        boolean deleted = factory.deletePerson(person);
        assert deleted : "Delete person test failed (person not deleted)";
        assert !factory.getStaff().contains(person) : "Delete person test failed (person still in staff list)";
        System.out.println("Delete person test passed");
    }
}


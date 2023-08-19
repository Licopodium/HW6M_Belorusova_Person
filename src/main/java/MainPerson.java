public class MainPerson {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person()
                .withFirstName("John")
                .withLastName("Doe")
                .withAge(30)
                .withAddress("123 Main St")
                .withEmail("john@example.com")
                .withPhoneNumber("555-987-65-43");

        Person person2 = new Person()
                .withFirstName("Alice")
                .withLastName("Smith")
                .withAge(25)
                .withAddress("456 Elm St")
                .withEmail("alice@example.com")
                .withPhoneNumber("555-123-45-67");

        Person person3 = new Person()
                .withFirstName("Emma")
                .withLastName("Johnson")
                .withAge(-10)
                .withAddress("")
                .withEmail("emma@example.com")
                .withPhoneNumber("-");

       System.out.println("Person 1 - FirstName: " + person1.getFirstName() +
                " LastName: " + person1.getLastName() +
                ", Age: " + person1.getAge() +
                ", Address: " + person1.getAddress() +
                ", Email: " + person1.getEmail() +
                ", PhoneNumber: " + person1.getPhoneNumber());

        System.out.println("Person 2 - FirstName: " + person2.getFirstName() +
                ", LastName: " + person2.getLastName() +
                ", Age: " + person2.getAge() +
                ", Email: " + person2.getEmail() +
                ", PhoneNumber: " + person2.getPhoneNumber());

        System.out.println("Person 3 - FirstName: " + person3.getFirstName() +
                ", LastName: " + person3.getLastName() +
                ", Address: " + person3.getAddress() +
                ", Age: " + person3.getAge() +
                ", Email: " + person3.getEmail() +
                ", PhoneNumber: " + person3.getPhoneNumber());

        }
}

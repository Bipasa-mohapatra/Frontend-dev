public class Person {
    // Fields
    private String name;
    private int age;
    private String address;
    private String email;
    // Constructor with arguments
    public Person(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }
    // Getters and Setters for each field
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }   
    public void setEmail(String email) {
        this.email = email;
    }
    // Example main method to demonstrate usage
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person = new Person("Lipi", 22, "756122 odisha", "mohapatrabipasa2002");
        
        // Using getters to retrieve information
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Email: " + person.getEmail());
        
        // Using setters to update information
        person.setAddress("786 bbsr");
        person.setEmail("mohapatrabipasa2024@gmail.com");
        
        // Display updated information
        System.out.println("\nUpdated Address: " + person.getAddress());
        System.out.println("Updated Email: " + person.getEmail());
    }
}
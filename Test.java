class Person {
  private String name;
  private int age;
  private String address;

  // Constructor
  public Person(String name, int age, String address) {
      this.name = name;
      this.age = age;
      this.address = address;
  }

  // Default constructor
  public Person() {
  }

  // Getters and Setters
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

  // Method to print person details
  public void printPersonDetails() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Address: " + address);
  }
}

public class Test {
  public static void main(String[] args) {
      // Create Object for Person and initialize values with Constructor
      Person person1 = new Person("John Doe", 30, "123 Main St");
      // Print the values
      person1.printPersonDetails();

      System.out.println();

      // Create another Object for Person
      Person person2 = new Person();
      // Assign values with Getters & Setters
      person2.setName("Jane Doe");
      person2.setAge(25);
      person2.setAddress("456 Elm St");
      // Print the values
      person2.printPersonDetails();
  }
}// Create Object for Person
      // Initialize values with Constructors
      // print the values
      // Create another Object for Person
      // Assign Values with Getters & Setters
      // print the values
    }
    }
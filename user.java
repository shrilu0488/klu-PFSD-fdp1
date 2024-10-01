public class User {
    // Attributes of the User class
    private String name;
    private int age;
    private String email;

    // Constructor to initialize user details
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Method to get user name
    public String getName() {
        return name;
    }

    // Method to get user age
    public int getAge() {
        return age;
    }

    // Method to get user email
    public String getEmail() {
        return email;
    }

    // Method to display user details
    public void displayUserDetails() {
        System.out.println("User Name: " + name);
        System.out.println("User Age: " + age);
        System.out.println("User Email: " + email);
    }

    // Main method to test the User class
    public static void main(String[] args) {
        // Creating an object of User class
        User user = new User("John Doe", 25, "john.doe@example.com");

        // Displaying the user details
        user.displayUserDetails();
    }
}

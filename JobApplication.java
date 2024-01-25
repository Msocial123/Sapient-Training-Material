import java.util.Scanner;

// Step 2: Create a JobApplication Class
class JobApplication {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String collegeName;
    private double totalMarks;
    private String skills;

    // Step 2: Create a constructor
    public JobApplication(String firstName, String lastName, String email, String phoneNumber,
                          String collegeName, double totalMarks, String skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.collegeName = collegeName;
        this.totalMarks = totalMarks;
        this.skills = skills;
    }

    // Step 2: Create getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}

public class JobApplicationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 3: Input Data from User
        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Email ID:");
        String email = scanner.nextLine();

        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter College Name:");
        String collegeName = scanner.nextLine();

        double totalMarks = 0;
        boolean validTotalMarks = false;
        while (!validTotalMarks) {
            try {
                System.out.println("Enter Total Marks on Degree:");
                totalMarks = Double.parseDouble(scanner.nextLine());
                validTotalMarks = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for Total Marks.");
            }
        }

        System.out.println("Enter Skills:");
        String skills = scanner.nextLine();

        // Step 3: Create an instance of the JobApplication class and set values
        JobApplication jobApplication = new JobApplication(firstName, lastName, email, phoneNumber,
                collegeName, totalMarks, skills);

        // Display the job application details
        System.out.println("\nJob Application Details:");
        System.out.println("First Name: " + jobApplication.getFirstName());
        System.out.println("Last Name: " + jobApplication.getLastName());
        System.out.println("Email ID: " + jobApplication.getEmail());
        System.out.println("Phone Number: " + jobApplication.getPhoneNumber());
        System.out.println("College Name: " + jobApplication.getCollegeName());
        System.out.println("Total Marks on Degree: " + jobApplication.getTotalMarks());
        System.out.println("Skills: " + jobApplication.getSkills());
    }
}

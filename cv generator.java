import java.util.Scanner;

public class CVGenerator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for basic information
        System.out.println("Welcome to the CV Generator!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter your education: ");
        String education = scanner.nextLine();
        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();
        System.out.print("Enter your work experience: ");
        String experience = scanner.nextLine();
        System.out.print("Enter any additional information: ");
        String additionalInfo = scanner.nextLine();
        
        // Generate the CV template
        System.out.println("\n=============================");
        System.out.println("          Curriculum Vitae          ");
        System.out.println("=============================\n");
        
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        
        System.out.println("\nEducation:");
        System.out.println(education);
        
        System.out.println("\nSkills:");
        System.out.println(skills);
        
        System.out.println("\nWork Experience:");
        System.out.println(experience);
        
        System.out.println("\nAdditional Information:");
        System.out.println(additionalInfo);
        
        scanner.close();
    }
}

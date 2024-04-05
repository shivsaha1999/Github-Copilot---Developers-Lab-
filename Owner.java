import java.util.Scanner;
public class Owner {
    private String name;
    private String email;

    public Owner(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter owner's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter owner's email: ");
        String email = scanner.nextLine();

        Owner owner = new Owner(name, email);
        System.out.println(owner);

        scanner.close();
    }
}
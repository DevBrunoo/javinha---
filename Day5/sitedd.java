import java.util.Scanner;

public class EmailDomainExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: "); // Digitar email de noia ne paiiiiaiiaiaiaiiaiajsnhdiohwdabuihwqhinçoiqhiohwdioqhwiodqhiofhhiofwfe
        String email = scanner.nextLine();

        int position = email.indexOf('@');
        if (position != -1) {
            String domain = email.substring(position + 1);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid email address.");
        }

        scanner.close();
    }
}

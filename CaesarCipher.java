import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        shift = shift % 26;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + shift + 26) % 26 + 'A');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + shift + 26) % 26 + 'a');
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Caesar Cipher ===");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.print("Choose an option: ");

        int choice = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your message: ");
        String message = scan.nextLine();

        System.out.print("Enter shift value: ");
        int shift = scan.nextInt();

        switch (choice) {
            case 1:
                String encrypted = encrypt(message, shift);
                System.out.println("Encrypted Message: " + encrypted);
                break;

            case 2:
                String decrypted = decrypt(message, shift);
                System.out.println("Decrypted Message: " + decrypted);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scan.close();
    }
}
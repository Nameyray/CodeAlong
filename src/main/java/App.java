import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Cipher app");
        System.out.println("please enter a message");
        String word = scanner.nextLine();

        MessageCipher messageCipher = new MessageCipher();
        System.out.println("Your ciphered message is:");
        System.out.println(messageCipher.cipherWord(word));
    }

}

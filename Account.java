import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Account {
    private String username;

    public Account(String username) throws FileNotFoundException {
        this.username = username;
    }
    public static boolean isAvaliable(String str) throws FileNotFoundException {
        File file = new File("usernames.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equals(str)) {
                scanner.close();
                return false;
            }
        }
        scanner.close();
        return true;
    }
}
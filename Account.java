import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Account {
    private String username;
    public String getUsername() {
        return username;
    }

    public Account(String requestedName) throws FileNotFoundException {
        int num = 1;
        String possibleName = requestedName;
        while (!isAvaliable(possibleName)) {
            possibleName = requestedName + num;
            num++;
        }
        username = possibleName;

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

    public String getShortenedName() {
        String shortName = username;
        int hyphen = shortName.indexOf("-");
        while (hyphen > 0) {
            shortName = shortName.substring(0, hyphen - 1) + shortName.substring(hyphen + 1);
            hyphen = shortName.indexOf("-");
        }
        return shortName;
    }
}
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account account = new Account("Luis-Cruz");
        System.out.println(account.getUsername());
        Account account2 = new Account("PSmith");
        System.out.println(account2.getUsername());
        System.out.println(account2.getShortenedName());
        Account a = new Account("Amy-Marie-Lin");
        System.out.println(a.getShortenedName());
        Account b = new Account("Sammy-Smith-B3");
        System.out.println(b.getShortenedName());
        
    }
}

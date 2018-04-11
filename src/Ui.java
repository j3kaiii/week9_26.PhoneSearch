
import java.util.Scanner;

/**
 *
 * @author j3kaiii
 */
public class Ui {
    private Scanner reader;
    private PhoneBook book;

    public Ui() {
        reader = new Scanner(System.in);
        book = new PhoneBook();
    }
    
    public void start() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println("");
        
        
        command();
        
    }

    private void command() {
        while (true) {
        System.out.print("command: ");
        String command = reader.nextLine();
        
        if (command.equals("1")) addNumber();
        if (command.equals("2")) searchNumber();
        if (command.equals("3")) searchPersonByNumber();
        if (command.equals("4")) addAddress();
        if (command.equals("5")) searchPeson();
        if (command.equals("6")) deletePerson();
        if (command.equals("7")) filterBook();
        if (command.equals("x")) break;
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        
        book.addNumber(name, number);
        System.out.println("");
    }
    
    private void searchNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        
        book.searchNumber(name);
        System.out.println("");
    }

    private void searchPersonByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();
        
        if (!book.searchByNumber(number)) System.out.println(" not found");
        
        System.out.println("");
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String address = reader.nextLine();
        System.out.print("city: ");
        address = address + " " + reader.nextLine();
        
        book.addAddress(name, address);
        System.out.println("");
    }

    private void searchPeson() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        book.searchPerson(name);
        System.out.println("");
    }

    private void deletePerson() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        book.deletePerson(name);
        System.out.println("");
    }

    private void filterBook() {
        System.out.print("keyword (if empty, all listed): ");
        String keyWord = reader.nextLine();
        
        book.filter(keyWord);
        System.out.println("");
    }
    
}

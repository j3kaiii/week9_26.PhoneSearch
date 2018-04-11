
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 *
 * @author j3kaiii
 */
public class PhoneBook {
   
    private Map<String, List<String>> phones;
    private Map<String, String> addresses;
    private List<String> person;

    public PhoneBook() {
        person = new ArrayList<String>();
        phones = new HashMap<String, List<String>>();
        addresses = new HashMap<String, String>();
    }

    void addNumber(String name, String number) {
        if (!person.contains(name)) {
            person.add(name);
            phones.put(name, new ArrayList<String>());
        }
        phones.get(name).add(number);
    }

    void searchNumber(String name) {
        if (phones.containsKey(name)) {
            for (String s : phones.get(name)) {
                System.out.println(" " + s);
            }
        } else {
            System.out.println("  not found");
        }
    }

    boolean searchByNumber(String number) {
        for (String s : phones.keySet()) {
            if (phones.get(s).contains(number)) {
                System.out.println(" " + s);
                return true;
            }
        }
        return false;
    }

    void addAddress(String name, String address) {
        if (!addresses.containsKey(name)) {
            if (!person.contains(name)) {
                person.add(name);
            }
            addresses.put(name, address);
        }
        
    }

    void searchPerson(String name) {
        if (addresses.containsKey(name)) {
            System.out.println("  address: " + addresses.get(name));
        } else {
            System.out.println("  address unknown");
        }
        
        if (phones.containsKey(name)) {
            System.out.println("  phone numbers:");
            for (String s : phones.get(name)) {
                System.out.println("   " + s);
            }
        } else {
            System.out.println("  phone number not found");
        }
    }

    void deletePerson(String name) {
        person.remove(name);
        phones.remove(name);
        addresses.remove(name);
    }

    void filter(String keyWord) {
        if (keyWord.isEmpty()) {
            Collections.sort(person);
        }
        
    }

    
}

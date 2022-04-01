import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class User {
    protected int userID;
    protected String name;
    protected String gender;
    protected String contact;
    protected String email;
    protected String ic;
    protected static int id = 0;
    protected static final String file = "./database/users.txt";

    // CONSTRUCTORS
    public User() {}
    public User(ArrayList<String> personInfo) {
        int tmpID = Integer.parseInt(personInfo.get(0));
        // assign ID manually if not provided
        userID = (tmpID >= 0) ? tmpID : id;
        name = personInfo.get(2);
        gender = personInfo.get(3);
        contact = personInfo.get(4);
        email = personInfo.get(5);
        ic = personInfo.get(6);
        id++;
    }

    // GETTERS
    public int getUserID() { return userID; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getContact() { return contact; }
    public String getEmail() { return email; }
    public String getIC() { return ic; }
    public String getFile() { return file; }
    public String getUsername() { return "N/A"; }
    public String getRole() { return "Customer"; }

    // SETTERS
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setContact(String contact) { this.contact = contact; }
    public void setEmail(String email) { this.email = email; }
    public void setIC(String ic) { this.ic = ic; }

    // OTHER METHODS
    public String toString() {
        return String.format("%d - %s (Customer)\n", userID, name);
    }

    // Add this user instance to database (users.txt)
    public void addToFile() {
        String line;
        try {
            // May throw FileNotFoundException
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            PrintWriter pw = new PrintWriter(bw);
            
            line = String.format("%d, %s, %s, %s, %s, %s, %s\n", userID, 
                            "customer", name, gender, contact, email, ic);
            pw.write(line);
            pw.close();
            // Add to ResortBooking's 'customers' ArrayList
            ResortBooking.addUsers(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isDuplicate() {
        ArrayList<User> customers = ResortBooking.getCusts();
        System.out.println(ic);
        for (User cust : customers) {
            // User duplication is trigerred when they have the same IC
            if (cust.getIC().equals(ic)) {
                id--;
                return true;
            }
        }
        return false;
    }

    public void updateInfo(String name, String contact, String email, String ic) {
        setName(name);
        setContact(contact);
        setEmail(email);
        setIC(ic);
        rewriteFile();
    }

    public static void rewriteFile() {
        String line;
        try {
            // May throw FileNotFoundException
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            PrintWriter pw = new PrintWriter(bw);
            pw.write("userID, role, name, gender, contact, email, IC / passport, username, password\n");
            
            for (Staff staff : ResortBooking.getStaffs()) {
                line = String.format("%d, staff, %s, %s, %s, %s, %s, %s, %s\n", staff.getUserID(),
                        staff.getName(), staff.getGender(), staff.getContact(), 
                        staff.getEmail(), staff.getIC(), staff.getUsername(), staff.getPassword());
                pw.write(line);
            }
            
            for (User cust : ResortBooking.getCusts()) {
                line = String.format("%d, customer, %s, %s, %s, %s, %s\n",
                        cust.getUserID(), cust.getName(), cust.getGender(), cust.getContact(), 
                        cust.getEmail(), cust.getIC());
                pw.write(line);
            }
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCustName(int custID) {
        for (User user : ResortBooking.getCusts()) {
            if (user.getUserID() == custID)
                return user.getName();
        }
        return "";
    }
}

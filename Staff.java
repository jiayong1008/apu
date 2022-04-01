import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Staff extends User {
    private String username;
    private String password;

    // CONSTRUCTOR
    public Staff(ArrayList<String> personInfo) {
        super(new ArrayList<String>(personInfo.subList(0, 7)));
        this.username = personInfo.get(7);
        this.password = personInfo.get(8);
    }

    // GETTER
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return "Staff"; }

    // SETTERS
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }

    // OTHER METHODS
    public String toString() {
        return String.format("%d - %s (Staff)\n", userID, name);
    }    

    // Add this user instance to database (users.txt)
    public void addToFile() {
        String line;
        try {
            // May throw FileNotFoundException
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            PrintWriter pw = new PrintWriter(bw);
            
            line = String.format("%d, %s, %s, %s, %s, %s, %s, %s, %s\n", userID, "staff", 
                                name, gender, contact, email, ic, username, password);
            pw.write(line);
            pw.close();
            // Add to ResortBooking's 'staffs' ArrayList
            ResortBooking.addStaffs(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isDuplicate() {
        ArrayList<Staff> staffs = ResortBooking.getStaffs();
        for (Staff staff : staffs) {
            // Staff cannot hv the same IC or username as other staff
            if (staff.getIC().equals(ic) || staff.getUsername().equals(username)) {
                id--;
                return true;
            }
        }
        return false;
    }
}

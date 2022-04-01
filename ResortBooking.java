import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class ResortBooking {

    private static final int price = 350;
    private static final float serviceTax = 0.1F; // 10%
    private static final int tourismTax = 10;
    private static ArrayList<User> customers = new ArrayList<User>();
    private static ArrayList<Staff> staffs = new ArrayList<Staff>();
    private static ArrayList<Booking> bookings = new ArrayList<Booking>();
    private static ArrayList<String> rooms = new ArrayList<String>();
    private static final String userFile = "./database/users.txt";
    private static final String bookingFile = "./database/bookings.txt";
    
    public static void main(String[] args) {
        loadUsers();
        loadBookings();
        loadRooms();
        login();
    }
    
    public static void login() {
        LoginFrame loginf = new LoginFrame();
        loginf.setVisible(true);
    }

    public static void loadUsers() {
        // Preventing redundancy
        customers.clear(); 
        staffs.clear();
        String line;
        
        try {
            // May throw FileNotFoundException
            BufferedReader br = new BufferedReader(new FileReader(userFile));
            
            br.readLine(); // Skip first line (header)
            while ((line = br.readLine()) != null) { // Read line by line till EOF
                String[] values = line.split(", "); // Split values by comma
                ArrayList<String> personInfo = new ArrayList<String>(Arrays.asList(values));

                if (personInfo.get(1).equals("customer")) {
                    User cust = new User(personInfo);
                    customers.add(cust);
                } else if (personInfo.get(1).equals("staff")) {
                    Staff staff = new Staff(personInfo);
                    staffs.add(staff);
                }
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadBookings() {
        bookings.clear();
        String line;
        try {
            // May throw FileNotFoundException
            BufferedReader br = new BufferedReader(new FileReader(bookingFile));
            
            br.readLine(); // Skip first line (header)
            while ((line = br.readLine()) != null) { // Read line by line till EOF
                String[] values = line.split(", "); // Split values by comma
                ArrayList<String> bookingInfo = new ArrayList<String>(Arrays.asList(values));
                Booking booking = new Booking(bookingInfo);
                bookings.add(booking);
            }
            br.close();  

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadRooms() {
        rooms.clear();
        for (int i = 0; i < 10; i++) {
            String jungleRoom = String.format("J%03d", i); // J001 ~ J009
            String seaRoom = String.format("S%03d", i); // S001 ~ S009
            rooms.add(jungleRoom);
            rooms.add(seaRoom);
        }
    }

    // GETTERS
    public static ArrayList<User> getCusts() { return customers; }
    public static ArrayList<Staff> getStaffs() { return staffs; }
    public static ArrayList<Booking> getBookings() { return bookings; }
    public static ArrayList<String> getRooms() { return rooms; }
    public static int getPrice() { return price; };
    public static float getServiceTax() { return serviceTax; };
    public static int getTourismTax() { return tourismTax; };

    // ADDING INFORMATION
    public static void addBookings(Booking booking) { bookings.add(booking); }
    public static void addUsers(User user) { customers.add(user); }
    public static void addStaffs(Staff staff) { staffs.add(staff); }
}


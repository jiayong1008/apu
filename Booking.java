import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Booking {
    
    private final int bookingID;
    private int userID;
    private String roomID;
    private String checkInDate;
    private String checkOutDate;
    private String bookingDate;
    private static int id = 0;
    private static int highestId = 0;
    private static final String file = "./database/bookings.txt";
    private static final SimpleDateFormat datef = new SimpleDateFormat("dd-MM-yyyy");

    // CONSTRUCTOR
    public Booking(ArrayList<String> bookingInfo) {
        int tmpID = Integer.parseInt(bookingInfo.get(0));
        // assign ID manually if not provided
        bookingID = (tmpID >= 0) ? tmpID : id;
        userID = Integer.parseInt(bookingInfo.get(1));
        roomID = bookingInfo.get(2);
        checkInDate = bookingInfo.get(3);
        checkOutDate = bookingInfo.get(4);
        bookingDate = bookingInfo.get(5);
        id++;

        if (bookingID > highestId)
            highestId = bookingID;
    }

    // GETTERS
    public int getBookingID() { return bookingID; };
    public int getUserID() { return userID; };
    public String getRoomID() { return roomID; };
    public String getCheckInDate() { return checkInDate; };
    public String getCheckOutDate() { return checkOutDate; };
    public String getBookingDate() { return bookingDate; };
    public static int getHighestId() { return highestId; };

    public static Booking getBooking(int id) {
        for (Booking booking : ResortBooking.getBookings()) {
            if (booking.getBookingID() == id)
                return booking;
        }
        return null;
    }

    // SETTERS
    public void setUserID(int id) { userID = id; };
    public void setRoomID(String id) { roomID = id; };
    public void setCheckInDate(String date) { checkInDate = date; };
    public void setCheckOutDate(String date) { checkOutDate = date; };
    public void setBookingDate(String date) { bookingDate = date; };

    // OTHER METHODS
    public String toString() {
        return String.format("Booking#%d, Room - %s", bookingID, roomID);
    }

    public int getDaysOfStay() {
        try {
            Date checkIn = datef.parse(checkInDate);
            Date checkOut = datef.parse(checkOutDate);
            long timeDiff = checkOut.getTime() - checkIn.getTime();
            int daysOfStay = (int) TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
            return daysOfStay;
        } catch (Exception e) {
            return -1;
        }   
    }

    public float getRoomPrice() {
        int daysOfStay = getDaysOfStay();
        if (daysOfStay == -1)
            return -1;
        float subtotal = (float) ResortBooking.getPrice() * daysOfStay;
        float serviceTax = subtotal * ResortBooking.getServiceTax();
        float total = subtotal + serviceTax + ResortBooking.getTourismTax();
        return total;
    }

    public boolean isDuplicate() {
        ArrayList<Booking> bookings = ResortBooking.getBookings();
        for (Booking booking : bookings) {
            if (booking.getUserID() == userID && booking.getRoomID().equals(roomID) &&
                booking.getCheckInDate() == checkInDate && booking.getCheckOutDate() == checkOutDate) {
                id--;
                return true;
            }
        }
        return false;
    }

    // Add this booking instance to database (bookings.txt)
    public void addToFile() {
        String line;
        try {
            // May throw FileNotFoundException
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            PrintWriter pw = new PrintWriter(bw);
            Calendar calendar = Calendar.getInstance();
            String today = datef.format(calendar.getTime());
            
            line = String.format("%d, %d, %s, %s, %s, %s\n", bookingID, userID, 
                                    roomID, checkInDate, checkOutDate, today);
            pw.write(line);
            pw.close();
            // Add to ResortBooking's 'bookings' ArrayList
            ResortBooking.addBookings(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateInfo(String checkIn, String checkOut) {
        setCheckInDate(checkOut);
        setCheckOutDate(checkOut);
        rewriteFile();
    }

    public static void rewriteFile() {
        String line;
        try {
            // May throw FileNotFoundException
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            PrintWriter pw = new PrintWriter(bw);
            pw.write("bookingID, userID, roomID, checkInDate, checkOutDate, bookingDate\n");
            
            for (Booking booking : ResortBooking.getBookings()) {
                line = String.format("%d, %d, %s, %s, %s, %s\n", booking.getBookingID(), booking.getUserID(), 
                                        booking.getRoomID(), booking.getCheckInDate(), 
                                        booking.getCheckOutDate(), booking.getBookingDate());
                pw.write(line);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

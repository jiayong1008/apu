# Resort Room Booking System    
A stand-alone GUI application used by resort staff to simulate resort room booking. 

![Resort Room Booking System](https://github.com/jiayong1008/apu/blob/java/resort-room/gui.png?raw=true)

## Specifications
This project has been implemented purely with Java (interface built with Java Swing). The system will simulate room booking in a week for a small resort with two views (Jungle & Sea), with each view consist of 10 rooms. The charges per room is RM350.00 per night. The system will be used by resort staff. Laid out as below are the list of specifications in this project:

**Resort Staff** may:
1. Sign in to use the system
2. Book room for customer
    - Select room based on day, the system will show all the available room(s) for the selected day. Now the staff can specify the room to book.
    - Booking details such as customer name, IC/Passport, contact number, email, room id, days of stay etc should be included while booking.
3. Manage room booking details (Modify/Delete/Search/View).
4. Manage users (Modify/Delete/Search/View).
5. View receipt which consist of details of customer, booked room and total charges including taxes.
    - Taxes imposed are service tax (10% of total room charges) plus tourism tax (RM10 per night).


## Files and Directories
- `ResortBooking.java` - Main Java program with the main method
- `User.java` - User object
- `Staff.java` - Staff object which inherits from User
- `Booking.java` - Booking object
- `LoginFrame.java` - Interface for staff authentication
- `MainFrame.java` - Interface for all other functionalities
- `database` directory - Act as the 'database' for this system
    - `users.txt` - Store all users, including staff details
    - `bookings.txt` - Store all booking details
- `documentation.pdf` - Full documentation of this system, you may find clearer project explanation here
- `README.md` - Short description of this project
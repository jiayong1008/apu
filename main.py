# LIM JIA YONG  TP059192
# LEANNE OOI XIN RU  TP059138
from datetime import date


""" MAIN PROGRAM """
def menu():
    print("\nWelcome to Super Car Rental Service (SCRS).\n")

    while True:
        # Prompts user to continue or terminate
        # Calls choice function for validation check
        options = [0, -1]
        option = choice("Do you want to continue? [‘0’ to Continue ‘-1’ to Terminate]: ", options)

        # If choice entered is '-1', break out of loop and end the program.
        if (option == -1):
            break

        print("Your options are: ")
        print("1.	Register as new customer.")
        print("2.	Log in as customer.")
        print("3.	Log in as admin.")
        print("4.	Remain as unregistered customer.")

        # Prompt user to enter option
        # Calls choice function for validation check
        options = [1, 2, 3, 4]
        option = choice("Enter your option: ", options)

        # Attempt to signup as new customer
        if (option == 1): 
            while True:
                # signup function returns 'None' if file doesnt exist, 'False' if signup attempt fail,
                # and returns username if signup is successful
                username = signup()
                
                # if signup is successful, render registered customer view  
                if (username):
                    registeredCustView(username)
                    break
                elif (username == None):
                    break # break out of While loop if None is returned

        # Attempt to log in as registered customer
        elif (option == 2):
            while True:
                # login function returns 'None' if file doesnt exist, 'False' if login attempt fail,
                # and returns username if login is successful
                username = login('customer')

                # if login is successful, render registered customer view 
                if (username):
                    registeredCustView(username)
                    break
                elif (username == None):
                    break # break out of While loop if None is returned

        # Attempt to log in as admin
        elif (option == 3):
            while True:
                # login function returns 'None' if file doesnt exist, 'False' if login attempt fail,
                # and returns username if login is successful
                username = login('admin')

                # if login is successful, render registered customer view 
                if (username):
                    adminView()
                    break
                elif (username == None):
                    break # break out of While loop if None is returned

        # remain as regular unregistered customer    
        else:
            customerView()
    
    print("Thank you and have a nice day!\n")



""" HELPER FUNCTIONS """
# Helper function - Get an integer from user, reprompts if value entered is not integer
def get_int(message):
    while True:
        try:
            number = int(input(message))
            return number
        except ValueError:
            print("Invalid Input")


# Helper function - Get a decimal from user, reprompts if value entered is not integer or decimal
def get_float(message):
    while True:
        try:
            decimal = float(input(message))
            return decimal
        except ValueError:
            print("Invalid Input")


# Helper function - Get a date from user, reprompts if invalid date is entered
def get_date(message):
    while True:
        inputDate = input(message).strip()
        try:
            # try to convert input date to '%Y-%m-%d' format (e.g. 2021-05-26)
            inputDate = date.fromisoformat(inputDate)
            return inputDate
        except ValueError:
            print("Invalid date, please ensure that you followed the date format requested.")


# Helper function - Get an email from user, reprompts if invalid email is entered
def get_email(message):
    while True:
        email = input(message).strip().lower()

        # check if '@' is in email, also check if last 4 characters are one of '.com', '.org', '.edu', '.gov', '.net'
        if ('@' not in email) or (email[-4:] not in ['.com', '.org', '.edu', '.gov', '.net']):
            print("Invalid Email.")
        else:
            return email


# Helper function - Function that reprompts user if choice entered is invalid
def choice(message, options):
    while True:

        # Prompt user to enter choice
        choice = get_int(message)
        if (choice in options):
            print()
            return choice

        # if choice is not in given list, print error message and continue the loop.
        print("Invalid Input.")


# returns list of all / available / unavailable cars
# if exception occurs (file does not exist), it returns
# 'availability' is a string value of either 'all', 'available' or 'unavailable'
def cars(availability):
    try:
        with open('bookings.txt', 'r') as bookingsFile:
            availableCars = [] # master list 1
            unavailableCars = [] # master list 2
            bookedCars = []

            for line in bookingsFile:
                # split each line in file into different values seperated by comma
                _, carPlate, *_, status = line.rstrip().split(', ')

                # If car is not returned (status of 'False'), append this car to 'bookedCars' list
                if (status == 'False'):
                    bookedCars.append(carPlate)

            try:
                with open('cars.txt', 'r') as carsFile:
                    if (availability == 'all'):
                        cars = [] # master list
                        for line in carsFile:
                            # read each line and store information in a list
                            carDetail = line.rstrip().split(', ')
                            cars.append(carDetail)
                        # returns master list containing all cars
                        return cars   

                    # if availability is not 'all', do the following:
                    for row in carsFile:
                        # split each line in file into different values seperated by comma
                        carPlate, *values = row.rstrip().split(', ')

                        if (carPlate not in bookedCars):
                            availableCars.append([carPlate, *values])
                        else:
                            unavailableCars.append([carPlate, *values])

            except FileNotFoundError:
                print("Could not open 'cars.txt' file.")
                return

    except FileNotFoundError:
        print("Could not open 'bookings.txt' file.")
        return

    # if user asks for available cars, return available cars, else return unavailable cars
    if (availability == 'available'):
        return availableCars
    else:
        return unavailableCars
        

""" SIGNUP, LOGIN FUNCTIONS """
# for every sign up, user are assumed to be a customer, not an admin
# signup function returns 'False' if username is already taken or simply returns if file does not exist
# if registeration is successful, username is returned
def signup():
    print("Please fill in the information below to signup.")
    username = input("Enter Username: ").strip()
    email = get_email("Enter Email: ")
    phoneNo = input("Enter Phone Number [e.g. 011-12345678]: ").strip()
    password = input("Enter Password: ").strip()
    confirmation = input("Enter Password Confirmation: ").strip()

    # Check if passwords match
    if (password != confirmation):
        print("Passwords must match. Please register again.\n")
        input("Press any key to continue...")
        return False

    try:
        # open 'users.txt' and check if username already exist
        with open ('users.txt', 'a+') as file:
            # bring file handler back to position 0 ('a+' will bring handler to end of file)
            file.seek(0)
            for line in file:
                # split each line in file into different values seperated by comma
                user, _, userType, *_ = line.rstrip().split(', ')
                if (user == username) and (userType == 'customer'):
                    print("Sorry, username has been taken. Please register with another username.\n")
                    input("Press any key to continue...")
                    return False
            
            # if nothing goes wrong, append user credentials to "users.txt" file
            file.write(f"{username}, {password}, customer, {email}, {phoneNo}\n")
            print(f"Registeration successful, welcome {username}.")
                    
    except:
        print("Error occured in 'users.txt' file.\n")
        return

    input("Press any key to continue...")
    return username    


# login function returns if file does not exist
# returns False if credentials provided are incorrect
# returns username of current user if login is successful
def login(userType):
    print(f"Please fill in your credentials. Note: You are currently trying to login as {userType}.")
    name = input("Enter Username: ")
    password = input("Enter Password: ")

    try:
        with open ('users.txt', 'r') as file:
            for line in file:
                # split each line in file into different values seperated by comma
                user, passw, userType, *_ = line.rstrip().split(', ')
                if (user == name) and (passw == password) and (userType == userType):
                    print(f"Welcome back, {user}.\n")
                    input("Press any key to continue...")
                    return user

    except FileNotFoundError:
        print("Could not open 'users.txt' file.\n")
        input("Press any key to continue...")
        return

    print("Invalid username and (or) password.\n")
    input("Press any key to continue...")
    return False


"""FUNCTIONS RELATED TO REGISTERED CUSTOMER VIEW"""
# The interface which registered customers get to access
def registeredCustView(username):
    
    print()
    print("Your options are: ")
    print("1.   Modify personal details.")
    print("2.   View Personal Rental History.")
    print("3.   View Detail of Cars to be Rented Out.")
    print("4.   Select and Book a car for a specific duration.")
    print("5.   Log out.")

    # Validation check
    options = list(range(1, 6)) # list of 1 to 5
    option = choice("Enter your option: ", options)

    if (option == 1): 
        modifyCustDetails(username)

    elif (option == 2):
        displayRentalHistory(username)

    elif (option == 3):
        displayCars('available')

    elif (option == 4):
        bookCar(username)

    else: # option == 5
        return
    
    return registeredCustView(username)


# Option 1 - Allow customer to modify personal details.
def modifyCustDetails(username):
    try:
        # Opening the users.txt to read and obtain the details
        with open ('users.txt', 'r') as file:
            lines = file.readlines()

            for index, line in enumerate(lines):
                # read each line and store information in a list
                userDetails = line.rstrip().split(', ')
                # continue if current line in file is not the user
                if (userDetails[0] != username): 
                    continue

                # display customer information
                print(f"These are your current details:")
                print(f"Email: {userDetails[3]}")
                print(f"Phone Number: {userDetails[4]}\n")

                print("Your options are: ")
                print("1. Change Password.")
                print("2. Change Email.")
                print("3. Change Phone Number.")
                print("4. Exit.")
                # Validation check
                options = list(range(1,5)) # List of 1 to 4
                option = choice("Enter your option: ", options)

                if (option == 1):
                    modifyPassword(userDetails, lines, index)

                elif (option == 2):
                    modifyEmail(userDetails, lines, index)

                elif (option == 3):
                    modifyPhoneNo(userDetails, lines, index)

                else: # option == 4
                    return

                input("Press any key to continue...")
                return modifyCustDetails(username)

    except FileNotFoundError:
        print("Could not open 'users.txt' file.\n")


# allow user to modify password
def modifyPassword(userDetails, lines, index):
    current_password = input("Enter your current password: ")
    password = userDetails[1]

    # Check if the the current password matches password in users.txt
    if (current_password != password):
        print("Invalid password.")
        return modifyPassword(userDetails, lines, index)       

    new_password = input("Enter your new password: ")
    confirm_password = input("Enter your new password to confirm: ")
    # Check if new password and confirmation password matches
    if (new_password != confirm_password):
        print("Passwords must match.")
        input("Press any key to continue...")
        return modifyPassword(userDetails, lines, index)

    # if all validations are passed, update user.txt file to reflect changes
    updateUserFile('password', userDetails, lines, index, new_password)


# allow user to modify email
def modifyEmail(userDetails, lines, index):
    new_email = get_email("Enter your new email address: ")
    confirm_email = get_email("Enter your new new email address to confirm: ")
    
     # Check if new email matches confirmation email
    if (new_email != confirm_email):
        print("Emails must match.")
        input("Press any key to continue...")
        return modifyEmail(userDetails, lines, index)

    # if all validations are passed, update user.txt file to reflect changes
    updateUserFile('email', userDetails, lines, index, new_email)


# Allow user to modify phone number
def modifyPhoneNo(userDetails, lines, index):
    new_phoneNo = input("Enter your new phone number: ")
    confirm_phoneNo = input("Enter your new new phone number to confirm: ")
    
    # Check if new phone number matches confirmation phone number
    if (new_phoneNo != confirm_phoneNo):
        print("Phone number must match.")
        return modifyPhoneNo(userDetails, lines, index)

    updateUserFile('phone number', userDetails, lines, index, new_phoneNo)


# logic for updating users.txt file
# key is a string value of either 'password', 'email', or 'phone number',
# userDetails is a list storing all information of current user,
# lines stores the entire content of 'users.txt' file line by line,
# index is the row number of 'users.txt' that should be modified
# information is the new_information to be updated in the file
def updateUserFile(key, userDetails, lines, index, information):

    username = userDetails[0]
    if (key == 'password'):
        currentInfo = userDetails[1]
        lines[index] = (f"{username}, {information}, {userDetails[2]}, {userDetails[3]}, {userDetails[4]}\n")
    elif (key == 'email'):
        currentInfo = userDetails[3]
        lines[index] = (f"{username}, {userDetails[1]}, {userDetails[2]}, {information}, {userDetails[4]}\n")
    else: # key = phone number
        currentInfo = userDetails[4]
        lines[index] = (f"{username}, {userDetails[1]}, {userDetails[2]}, {userDetails[3]}, {information}\n")

    # Double check with user
    print(f"{username}, your {key} will be modified from {currentInfo} to {information}.")
    options = [0, 1]
    answer = choice("Do you agree to this modification? ['0'= No, '1'= Yes]: ", options)

    # If user agrees, the modification will take place
    if (answer == 1):
        try:
            # overwriting old file
            with open('users.txt', 'w') as writeFile:
                writeFile.writelines(lines)
                print(f"{username}, you have successfully modified your {key}.")
        except:
            print("Error occured in 'users.txt' file.\n")

    else:
        print(f"No changes made.")

    return


# Option 2 - Allow customer to view personal rental history
def displayRentalHistory(user):
    found = False
    try:
        # Opening the bookings.txt file to read
        with open('bookings.txt', 'r') as file:
            print("Username         Car Plate     Start Date      End Date     Daily Rate (RM)     Pay Date    Return Status")
            for line in file:
                # split each line in file into different values seperated by comma
                bookingDetails = line.strip().split(', ')
                if (user == bookingDetails[0]):
                    # Showing the customer's rental history
                    found = True
                    print(f"{bookingDetails[0]}         {bookingDetails[1]}      {bookingDetails[2]}     {bookingDetails[3]}      {bookingDetails[4]}          {bookingDetails[5]}      {bookingDetails[6]}")
            if not found:
                print("No personal rental history found.")
    except:
        print("Could not open 'bookings.txt' file.\n")

    input("Press any key to continue...")
    return


# Option 3 - Display all details of cars available for rent
def displayCars(availability):
    vehicles = cars(availability)
    print(f"{availability.capitalize()} cars for rent: ")
    print("Number Plate\tModel Name\tNumber of Seats\tRental Price (RM)")

    # display information for each vehicle
    for vehicle in vehicles:
        print(f"{vehicle[0]}\t\t{vehicle[1]}\t\t{vehicle[2]}\t\t{vehicle[3]}")

    input("\nPress any key to continue...")
    return


# Option 4 - Allow customer to select and book a car for a specific duration.
def bookCar(username):
    # display all available cars to admin before asking which car to modify
    displayCars('available')
    print()
    carNo = input("Enter the number plate of the car that you wish to book: ")

    try:
        # Opening cars.txt to read
        with open('cars.txt', 'r') as file:
            found = False
            for line in file:
                # split each line in file into different values seperated by comma
                carPlate, *_, price = line.strip().split(', ')
                # Checking if car plate entered by customer matches with one of the car plates in text file
                if (carNo != carPlate):
                    continue

                found = True
                # Making sure that rental start date is within a week from today and must not be in the pass
                validStartDate = False
                while (validStartDate == False):
                    firstDate = get_date("Enter the start date of your rental. Must be after today and within 7 days from today [e.g. 2021-06-03]: ")
                    today = date.today()
                    numOfDaysFromToday = firstDate - today
                    if numOfDaysFromToday.days <= 7 and numOfDaysFromToday.days > 0:
                        validStartDate = True
                    else:
                        print("Please make sure the starting date is after today and within 7 days from today.\n")
                        continue

                    lastDate = get_date("Enter the ending date of your rental  [e.g. 2021-06-03]: ")
                    numberOfDays = (lastDate - firstDate).days
                    # Checking if the starting date is before end date
                    if (numberOfDays <= 0):
                        print("Start date has to be before end date.")
                        continue

                    bookingPrice = numberOfDays * float(price)
                    payDate = date.today()
                    return_status = "False"
                    # Confirming with the customer on his/her booking
                    print(f"{username}, you will be booking {carNo} from {firstDate} to {lastDate} with the price of RM{bookingPrice:.2f}.")
                    options = [0, 1]
                    answer = choice("Do you agree to this booking? ['0'= No, '1'= Yes]: ", options)
                    # If user agrees, the booking will take place
                    if (answer == 1):
                        try:
                            # Opening bookings.txt to append
                            with open('bookings.txt', 'a') as file:
                                file.write(f"{username}, {carNo}, {firstDate}, {lastDate}, {bookingPrice:.2f}, {payDate}, {return_status}\n")
                                print(f"Booking successful, thank you {username}.")
                        except:
                            print("Error occured in 'bookings.txt' file.\n")
                            break
                    else:
                        print("The booking process will not be carried out.")
            if not found:
                print(f"No match for car number plate - {carNo}\n")
    except:
        print("Could not open 'cars.txt' file.\n")

    input("Press any key to continue...")
    return


"""FUNCTIONS RELATED TO ADMIN VIEW"""
# The interface which admins get to access
def adminView():

    print()
    print("Your options are: ")
    print("1.	Add cars to be rented out.")
    print("2.	Modify car details.")
    print("3.	Display all details of cars rented out.")
    print("4.	Display all details of cars available for rent.")
    print("5.	Display all details of customer bookings.")
    print("6.	Display all details of customer payment for a specific time duration.")
    print("7.	Search specific record of customer booking.")
    print("8.	Search specific record of customer payment.")
    print("9.	Return a rented car.")
    print("10.	Log out.")

    # Validation check
    options = list(range(1, 11)) # list of 1 to 10
    option = choice("Enter your option: ", options)

    if (option == 1):
        addCars()

    elif (option == 2):
        modifyCarDetails()

    elif (option == 3):
        displayCars('unavailable')
    
    elif (option == 4):
        displayCars('available')

    elif (option == 5):
        displayCustBookings()

    # Display all details of customer payment for a specific time duration
    elif (option == 6):
        displayTimePayment()

    # Search specific record of customer booking
    elif (option == 7):
        searchCustBookings()

    # Search specific record of customer payment
    elif (option == 8):
        searchCustPayment()

    # Return a rented car
    elif (option == 9):
        returnCar()
        
    else: # option == 10
        print("Successfully logged out.")
        return

    return adminView()


# Option 1 - Allow admin to add cars to 'cars.txt' file
def addCars():
    print("Please fill in the information below to add a new car.")
    carPlate = input("Enter Car Number Plate: ").upper()
    carModel = input("Enter Car Model: ").upper()
    seaters = get_int("How many person can this car be seated? ")
    price = get_float("Enter Rental Rate (per day basis): RM")

    try:
        # Validation check: check if this car plate already exist
        with open('cars.txt', 'a+') as file:
            # bring file handler back to position 0 ('a+' will bring handler to end of file)
            file.seek(0)
            for line in file:
                # split each line in file into different values seperated by comma
                carNo, *_ = line.rstrip().split(', ')
                if (carNo == carPlate):
                    print(f"\nCar with the number plate {carPlate} already exist.")
                    input("Press any key to continue...")
                    return

            # Displaying final confirmation and prompting admin to continue or cancel
            print(f"Car model {carModel} ({carPlate}) with {seaters} seaters and a daily rental rate of RM{price:.2f} will be added.")
            options = [0, 1]
            answer = choice("Do you wish to add this car? ['0'= No, '1'= Yes]: ", options)

            if (answer == 1):
                # append to 'cars.txt' after passing validation check above
                file.write(f"{carPlate}, {carModel}, {seaters}, {price:.2f}\n")
                print(f"Car with the number plate {carPlate} succesfully added.\n")
            else:
                print("No changes made.")
                
    except:
        print("Error occured in 'cars.txt' file.")
    
    input("Press any key to continue...")
    return


# Option 2 - Allow admin to modify car details
def modifyCarDetails():
    # display all cars to admin before asking which car to modify
    displayCars('all')
    try:
        # Opening cars.txt to read and obtain the details
        with open('cars.txt', 'r') as file:
            lines = file.readlines()
            carModel = input("Enter the car model you wish to modify: ").upper().strip()
            sameModelCars = [] # master list
            found = False

            for index, line in enumerate(lines):
                # split each line in file into different values seperated by comma
                carDetails = line.rstrip().split(', ')
                # continue looping if current car model in line is not what we are searching for
                if (carModel != carDetails[1]):
                    continue
                
                found = True
                # append index to keep track of which row to be modified later on
                carDetails.append(index)
                sameModelCars.append(carDetails)
            
            if not found:
                print(f"Car model - {carModel} does not exist.")
            else:
                modifyPrice(lines, sameModelCars)

    except:
        print("Could not open 'cars.txt' file.\n")

    return


# Modify rental rate per day
def modifyPrice(lines, sameModelCars):
    new_price = get_float("Enter the new daily rental rate (RM): ")
    currentPrice = float(sameModelCars[0][3])
    modelName = sameModelCars[0][1]

    # Displaying final confirmation and prompting admin to continue or cancel
    print(f"The daily rental rate for all models of {modelName} will be modified from RM{currentPrice:.2f} to RM{new_price:.2f}.")
    options = [0, 1]
    answer = choice("Do you agree to this modification? ['0'= No, '1'= Yes]: ", options)

    # If user agrees, the modification will take place
    if (answer == 1):
        for car in sameModelCars:
            index = car[4]
            carPlate = car[0]
            lines[index] = (f"{carPlate}, {car[1]}, {car[2]}, {new_price:.2f}\n")

        try:
            # overwriting old file
            with open('cars.txt', 'w') as writeFile:
                writeFile.writelines(lines)
                print(f"You have successfully modified the daily rental rate for all models of {modelName}.")
                print(f"{len(sameModelCars)} record(s) affected.")
        except:
            print("Error occured in 'cars.txt' file.\n")

    else:
        print(f"No changes made.")

    input("Press any key to continue...")
    return


# Option 5 - Display all details of customer bookings
def displayCustBookings():
    try:
        # Opening the bookings.txt to read
        with open('bookings.txt', 'r') as file:
            print("Username\tCar Plate\tStart Date\tEnd Date\tDaily Rate\tPay Date\tReturn Status")

            for line in file:
                # split each line in file into different values seperated by comma
                bookingDetails = line.rstrip().split(', ')
                print(f"{bookingDetails[0]}\t{bookingDetails[1]}\t\t{bookingDetails[2]}\t{bookingDetails[3]}\t{bookingDetails[4]}\t\t{bookingDetails[5]}\t{bookingDetails[6]}")
    except:
        print("Error opening bookings.txt.")

    input("Press any key to continue...")
    return


# Option 6 - Display all details of customer payment for a specific time duration
def displayTimePayment():
    print("Fill in details below to search for specific record of customer payment.")
    startDate = get_date("Enter Start Date [e.g. 2021-05-31]: ")
    endDate = get_date("Enter End Date [e.g. 2021-05-31]: ")
    print()

    try:
        with open('bookings.txt', 'r') as file:
            found = False
            index = 0
            total = 0
            for line in file:
                # split each line in file into different values seperated by comma
                username, carPlate, *_, price, payDate, _ = line.strip("[]\n").split(', ')
                payDate = date.fromisoformat(payDate)
                if (payDate >= startDate) and (payDate <= endDate):
                    found = True
                    index += 1
                    total += float(price)
                    # displaying details of customer payment
                    print(f"{index}. {username} paid RM {price} for car plate - {carPlate} in {payDate}.")
        
        # print message if no record is found
        if not found:
            print(f"No customer payment record found from {startDate} to {endDate}.")
        else:
            print(f"Total revenue generated from {startDate} to {endDate}: RM{total:.2f}\n")

    except:
        print("Could not open 'bookings.txt' file.")

    input("Press any key to continue...")
    return


# Option 7 - Search specific record of customer booking
def searchCustBookings():
    print("Fill in details below to search for specific record of customer booking.")
    username = input("Enter customer's username: ")
    carPlate = input(f"Enter car plate booked by {username} [Leave this field empty if you wish to search for all records associated with {username}]: ").upper()
    print()

    try:
        with open('bookings.txt', 'r') as file:
            found = False
            index = 0

            # if car plate is not provided, print all booking information associated with this user
            if (carPlate == ''):
                for line in file:
                    # split each line in file into different values seperated by comma
                    name, carNo, startDate, endDate, *_, status = line.rstrip().split(', ')

                    if (username == name):
                        found = True
                        index += 1

                        # displaying details of customer booking
                        print(f"{index}. {username} booked for car with number plate - {carNo} from {startDate} to {endDate}, return status = {status}.")
            
            # if car plate is provided, print booking information matching username and car plate 
            else:
                for line in file:
                    # split each line in file into different values seperated by comma
                    name, carNo, startDate, endDate, *_, status = line.strip("[]\n").split(', ')

                    if (username == name) and (carPlate == carNo):
                        found = True
                        index += 1

                        # displaying details of customer booking
                        print(f"{index}. {username} booked for car plate - {carNo} from {startDate} to {endDate}, return status = {status}.")
                        
        # print message if no record is found
        if not found:
            if (carPlate == ''):
                print(f"No bookings record found for {username}.")
            else:
                print(f"{username} has not booked a car with number plate of {carPlate}.")
            
    except:
        print("Could not open 'bookings.txt' file.")
    
    input("Press any key to continue...")
    return


# Option 8 - Search specific record of customer payment
def searchCustPayment():
    print("Fill in details below to search for specific record of customer payment.")
    username = input("Enter customer's username: ")
    carPlate = input(f"Enter car plate booked by {username} [Leave this field empty if you wish to search for all records associated with {username}]: ").upper()
    print()

    try:
        with open('bookings.txt', 'r') as file:
            found = False
            index = 0

            # if car plate is not provided, print all payment information associated with this user
            if (carPlate == ''):
                for line in file:
                    # split each line in file into different values seperated by comma
                    name, carNo, *_, price, payDate, _ = line.strip("[]\n").split(', ')

                    if (username == name):
                        found = True
                        index += 1

                        # displaying details of customer payment
                        print(f"{index}. {username} paid RM {price}.00 for car plate - {carNo} in {payDate}.")
            
            # if car plate is provided, print payment information matching username and car plate 
            else:
                for line in file:
                    # split each line in file into different values seperated by comma
                    name, carNo, *_, price, payDate, _ = line.strip("[]\n").split(', ')

                    if (username == name) and (carPlate == carNo):
                        found = True
                        index += 1

                        # displaying details of customer payment
                        print(f"{index}. {username} paid RM {price}.00 for car plate - {carNo} in {payDate}.")
                        
        # print message if no record is found
        if not found:
            if (carPlate == ''):
                print(f"No payment record found for {username}.")
            else:
                print(f"No payment record found for {username} with car plate - {carPlate}.")
            
    except:
        print("Could not open 'bookings.txt' file.")

    input("Press any key to continue...")
    return


# Option 9 - Allow admin to return a rented car
def returnCar():
    carPlate = input(f"Enter car plate to return: ").upper()
    print()

    try:
        with open('bookings.txt', 'r') as file:
            found = False
            lines = file.readlines()

            for index, line in enumerate(lines):
                username, carNo, startDate, endDate, price, payDate, status = line.rstrip().split(', ')
                if (carPlate == carNo) and (status == 'False'):
                    found = True

                    # displaying booking details and prompting admin to continue or cancel
                    print(f"{username} booked for car plate - {carNo} from {startDate} to {endDate}.")
                    options = [0, 1]
                    answer = choice("Do you wish to return this car? ['0'= No, '1'= Yes]: ", options)

                    # if admin agrees, proceed with returning the car 
                    if (answer == 1):
                        lines[index] = f"{username}, {carNo}, {startDate}, {endDate}, {price}, {payDate}, True\n"

                        try:
                            # overwriting old file
                            with open('bookings.txt', 'w') as writeFile: 
                                writeFile.writelines(lines)
                                print(f"Car with number plate - {carNo} has been returned.")
                        except:
                            print("Error occured in 'bookings.txt' file.\n")
                    else:
                        print(f"Car with number plate - {carNo} is not returned.")
                    
                    # once record is found, break out of loop
                    break
        
            if not found:
                print(f"No active booking record for car with number plate - {carPlate}.")

    except:
        print("Could not open 'bookings.txt' file.")

    input("Press any key to continue...")
    return


"""UNREGISTERED CUSTOMER VIEW"""
# The interface which unregistered customers get to access
def customerView():
    # Show all available cars for rent
    displayCars('available')
    return


"""CALLING MAIN FUNCTION"""
menu()
# java_development-task1-
Overview
The Online Reservation System is a Java-based application designed to facilitate train ticket reservations. It aims to simplify the booking process for users by allowing them to log in, make reservations, and cancel tickets through a user-friendly interface. The system stores user and reservation data in memory, making it accessible during the session.

Key Features
User Authentication:

Users must log in with a valid username and password.
The system currently supports a sample user for testing purposes.
Reservation Management:

Users can make train reservations by providing essential details such as:
Train number
Train name
Class type (e.g., Sleeper, AC)
Date of journey
Departure and destination locations
Upon successful reservation, a unique PNR (Passenger Name Record) number is generated and displayed to the user.
Cancellation Functionality:

Users can cancel reservations by entering their PNR number.
The system verifies the PNR number and removes the reservation if it exists.
User-Friendly Interface:

The system operates through a command-line interface, providing clear prompts and feedback.
Users can choose between making a reservation, canceling a reservation, or exiting the application.
Data Handling:

The application maintains user and reservation data in memory using Java collections (HashMap).
This allows for quick access to user information and reservations during the session.
Components
User Class:

Represents a user with attributes like username and password.
Provides methods to retrieve user information.
Reservation Class:

Represents a train reservation with attributes such as train details, journey date, and PNR number.
Contains a method to generate a unique PNR number.
ReservationSystem Class:

The main class containing the application logic.
Handles user authentication, reservation creation, and cancellation.
Use Case
A user starts the application and is prompted to enter their username and password.
Upon successful login, they can choose to make a reservation or cancel an existing one.
The system processes their requests and provides feedback, such as confirmation of a reservation or cancellation.
The user can exit the application when finished.
Future Enhancements
Implement a database for persistent storage of user and reservation data.
Add a graphical user interface (GUI) using JavaFX or Swing for better user experience.
Expand user management to include multiple users with varying roles (e.g., admin).
Introduce validation for user inputs and error handling for a more robust application.

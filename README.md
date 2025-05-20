# library-management-system
A simple Java console-based Library Management System for managing books and patrons, including features like checkout, return, and late fee calculation.


Some Extenions:-
Late fee is ₹10 per day after the due date.
Checkout period is fixed at 14 days.
Currently, a book can be checked out by only one patron at a time.

This project follows the KISS (Keep It Simple, Stupid) principle with a clean, modular design. Core features like book checkout and return use straightforward logic, and the use of POJOs and preloaded data ensures simplicity and ease of testing.

🗂 Project Structure:-
com.rohitmdev29.library
│
├── Test.java       // Main class with console menu interface
├── Library.java    // Core logic for managing books and patrons 
├── Book.java       // Represents a Book entity.
└── Patron.java     // Represents a Patron entity (library user).



Preloaded Data:-
When the application starts, it comes with a few books and patrons already added for testing and demo purposes.

Preloaded Books Data in the Application:-
Books:-
Book1 by ABC (ISBN: 1111111111111, Year: 1949)
Book2 by PQR (ISBN: 2222222222222, Year: 1960)
Book3 by XYZ (ISBN: 3333333333333, Year: 1925)


Preloaded Patrons Data in the Application:-
| ID | Name    | Email                                         |
| -- | ------- | --------------------------------------------- |
| 1  | Patron1 | [patron1@email.com](mailto:patron1@email.com) |
| 2  | Patron2 | [patron2@email.com](mailto:patron2@email.com) |


Relationships:-
(1)Library → Book:-
One Library manages many books.
(2)Library → Patron:-
One Library registers many patrons.
(3)A Book may be checked out by at most one Patron (via patronId).




Requirements to Run this Application:-
Java 8 or higher (uses java.time API).
Console environment to interact with the menu.

Dependencies?
(1)Pure Java (no external libraries).


How to Run?
Step1:-Compile all .java files.
javac com/rohitmdev29/library/*.java

Step2:-Run the main class.
java com.rohitmdev29.library.Test



Sample Output:-
Library Management System
1. List Books
2. Checkout Book
3. Return Book
4. List Patrons
5. Add Book
6. Remove Book
7. Update Book
8. Exit
Enter your choice:




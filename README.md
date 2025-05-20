📚 Library Management System (Java Console Application)
A simple Java console-based Library Management System for managing books and patrons, including features like checkout, return, and late fee calculation.

📦 Features

- ➕ Add, update, and remove books
- 👤 Add and list patrons
- 📖 Book checkout with due date tracking
- 🔄 Book return with late fee notification
- 🧾 ISBN-based book identification
- ✅ Preloaded sample data for testing

Regarding Design:-
This project follows the KISS (Keep It Simple, Stupid) principle with a clean, modular design. Core features like book checkout and return use straightforward logic, and the use of POJOs and preloaded data ensures simplicity and ease of testing.
SRP (Single Responsibility Principle): Each class has a distinct role (Book, Patron, Library, Test).
Encapsulation: Book and Patron properties are accessed via getters/setters.

🗂 Project Structure:-
com.rohitmdev29.library

| File           | Description                                      |
|----------------|--------------------------------------------------|
| `Test.java`    | Main class with console menu interface           |
| `Library.java` | Core logic for managing books and patrons        |
| `Book.java`    | Represents a Book entity                         |
| `Patron.java`  | Represents a Patron entity (library user)        |


Preloaded Data:-
When the application starts, it comes with a few books and patrons already added for testing and demo purposes.
### 📚 Preloaded Books Data

| Title  | Author | ISBN           | Publication Year |
|--------|--------|----------------|------------------|
| Book1  | ABC    | 1111111111111  | 1949             |
| Book2  | PQR    | 2222222222222  | 1960             |
| Book3  | XYZ    | 3333333333333  | 1925             |


Preloaded Patrons Data in the Application:-
| ID | Name    | Email                                         |
| -- | ------- | --------------------------------------------- |
| 1  | Patron1 | [patron1@email.com](mailto:patron1@email.com) |
| 2  | Patron2 | [patron2@email.com](mailto:patron2@email.com) |


### 🔗 Entity Relationships

| From     | To      | Type of Relationship      | Multiplicity       | Notes                                 |
|----------|---------|---------------------------|--------------------|----------------------------------------|
| Library  | Book    | Manages                   | 1 → 0..*           | One Library can manage multiple Books |
| Library  | Patron  | Registers                 | 1 → 0..*           | One Library can have many Patrons     |
| Book     | Patron  | Is checked out by         | 0..1               | One Book can be checked out by 1 Patron at most (via `patronId`) |


## 💻 Requirements

- Java 8 or higher (uses `java.time` API)
- Console environment (e.g., Terminal, IntelliJ IDEA)

---

## ✅ Dependencies

- ✅ Pure Java
- ❌ No external libraries

---

## 🛠️ How to Run

```bash
+-------------------------------------+
| javac com/rohitmdev29/library/*.java |
+-------------------------------------+

+------------------------------+
| java com.rohitmdev29.library.Test |
+------------------------------+

```
---

Developed by rohitmdev29

Feel free to reach out with suggestions, improvements, or questions.
Your feedback and contributions are always welcome!

Thanks for checking out this project! 😊

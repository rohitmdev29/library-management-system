package com.rohitmdev29.library;
import java.util.Scanner;
public class Test {


        public static void main(String[] args) {
            Library library = new Library();
            library.addBook(new Book("Book1", "ABC", "1111111111111", 1949));
            library.addBook(new Book("Book2", "PQR", "2222222222222", 1960));
            library.addBook(new Book("Book3", "XYZ", "3333333333333", 1925));

            library.addPatron(new Patron("1", "Patron1", "patron1@email.com"));
            library.addPatron(new Patron("2", "Patron2", "patron2@email.com"));

            Scanner scanner = new Scanner(System.in);
            String command;

            do {
                System.out.println("\nLibrary Management System");
                System.out.println("1. List Books");
                System.out.println("2. Checkout Book");
                System.out.println("3. Return Book");
                System.out.println("4. List Patrons");
                System.out.println("5. Add Book");
                System.out.println("6. Remove Book");
                System.out.println("7. Update Book");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                command = scanner.nextLine();

                switch (command) {
                    case "1":
                        library.listBooks();
                        break;
                    case "2":
                        System.out.print("Enter ISBN of the book to checkout: ");
                        String checkoutIsbn = scanner.nextLine();
                        System.out.print("Enter Patron ID: ");
                        String patronId = scanner.nextLine();
                        library.checkoutBook(checkoutIsbn, patronId);
                        break;
                    case "3":
                        System.out.print("Enter ISBN of the book to return: ");
                        String returnIsbn = scanner.nextLine();
                        library.returnBook(returnIsbn);
                        break;
                    case "4":
                        library.listPatrons();
                        break;
                    case "5":
                        System.out.print("Enter Book Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter Book Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter Book ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Enter Publication Year: ");
                        int year = Integer.parseInt(scanner.nextLine());
                        library.addBook(new Book(title, author, isbn, year));
                        System.out.println("✅ Book added successfully.");
                        break;
                    case "6":
                        System.out.print("Enter ISBN of the book to remove: ");
                        String removeIsbn = scanner.nextLine();
                        library.removeBook(removeIsbn);
                        System.out.println("✅ Book removed successfully.");
                        break;
                    case "7":
                        System.out.print("Enter ISBN of the book to update: ");
                        String updateIsbn = scanner.nextLine();
                        System.out.print("Enter New Title: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Enter New Author: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Enter New Publication Year: ");
                        int newYear = Integer.parseInt(scanner.nextLine());
                        library.updateBook(updateIsbn, newTitle, newAuthor, newYear);
                        System.out.println("✅ Book updated successfully.");
                        break;
                    case "8":
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (!command.equals("8"));

            scanner.close();
        }
    }



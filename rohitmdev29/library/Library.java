package com.rohitmdev29.library;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
public class Library {



        Map<String, Book> books = new HashMap<>();
        Map<String, Patron> patrons = new HashMap<>();

        public void addBook(Book book) {
            books.put(book.getIsbn(), book);
        }

        public void removeBook(String isbn) {
            books.remove(isbn);
        }

        public void updateBook(String isbn, String newTitle, String newAuthor, int newYear) {
            Book book = books.get(isbn);
            if (book != null) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setPublicationYear(newYear);
            }
        }

        public void listBooks() {
            for (Book book : books.values()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                        ", ISBN: " + book.getIsbn() + ", Year: " + book.getPublicationYear() +
                        (book.isCheckedOut() ? ", Status: Checked Out (Due: " + book.getDueDate() + ")" : ", Status: Available"));
            }
        }

        public void addPatron(Patron patron) {
            patrons.put(patron.getId(), patron);
        }

        public void listPatrons() {
            for (Patron patron : patrons.values()) {
                System.out.println("ID: " + patron.getId() + ", Name: " + patron.getName() + ", Email: " + patron.getEmail());
            }
        }

        public void checkoutBook(String isbn, String patronId) {
            Book book = books.get(isbn);
            if (book != null && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                book.setCheckoutDate(LocalDate.now());
                book.setDueDate(LocalDate.now().plusDays(14));
                book.setPatronId(patronId);
                System.out.println("✅ Book checked out. Due Date: " + book.getDueDate());
            } else {
                System.out.println("❌ Book is not available.");
            }
        }

        public void returnBook(String isbn) {
            Book book = books.get(isbn);
            if (book != null && book.isCheckedOut()) {
                LocalDate today = LocalDate.now();
                long daysLate = ChronoUnit.DAYS.between(book.getDueDate(), today);
                if (daysLate > 0) {
                    long fee = daysLate * 10;
                    System.out.println("⚠️ Book is late by " + daysLate + " days. Late Fee: ₹" + fee);
                } else {
                    System.out.println("✅ Book returned on time.");
                }
                book.setCheckedOut(false);
                book.setCheckoutDate(null);
                book.setDueDate(null);
                book.setPatronId(null);
            } else {
                System.out.println("❌ This book wasn't checked out.");
            }
        }
    }



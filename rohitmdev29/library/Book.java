package com.rohitmdev29.library;

import java.time.LocalDate;

public class Book {
        private String title;
        private String author;
        private String isbn;
        private int publicationYear;
        private boolean isCheckedOut;
        private LocalDate checkoutDate;
        private LocalDate dueDate;
        private String patronId;

        public Book(String title, String author, String isbn, int publicationYear) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.publicationYear = publicationYear;
            this.isCheckedOut = false;
        }

        // Getters and setters
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }

        public String getAuthor() { return author; }
        public void setAuthor(String author) { this.author = author; }

        public String getIsbn() { return isbn; }

        public int getPublicationYear() { return publicationYear; }
        public void setPublicationYear(int year) { this.publicationYear = year; }

        public boolean isCheckedOut() { return isCheckedOut; }
        public void setCheckedOut(boolean checkedOut) { this.isCheckedOut = checkedOut; }

        public LocalDate getCheckoutDate() { return checkoutDate; }
        public void setCheckoutDate(LocalDate checkoutDate) { this.checkoutDate = checkoutDate; }

        public LocalDate getDueDate() { return dueDate; }
        public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

        public String getPatronId() { return patronId; }
        public void setPatronId(String patronId) { this.patronId = patronId; }


}

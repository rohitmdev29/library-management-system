package com.rohitmdev29.library;

public class Patron {
        private String id;
        private String name;
        private String email;

        public Patron(String id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public String getId() { return id; }

        public String getName() { return name; }

        public String getEmail() { return email; }

        // Optional setters if needed
        public void setId(String id) { this.id = id; }

        public void setName(String name) { this.name = name; }

        public void setEmail(String email) { this.email = email; }


}

package com.pluralsight;

public class NameFormatter {

        private NameFormatter() {
            // Private constructor to prevent instantiation of the class.
        }

        public static String format(String firstName, String lastName) {
            return lastName + ", " + firstName;
        }

        public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
            StringBuilder formattedName = new StringBuilder();
            formattedName.append(lastName).append(", ").append(prefix).append(" ").append(firstName);
            if (middleName != null && !middleName.isEmpty()) {
                formattedName.append(" ").append(middleName);
            }
            if (suffix != null && !suffix.isEmpty()) {
                formattedName.append(", ").append(suffix);
            }
            return formattedName.toString();
        }

        public static String format(String fullName) {
            String[] nameParts = fullName.split(", ");
            if (nameParts.length < 2) {
                return fullName; // Invalid format, return the original input.
            }

            String lastName = nameParts[0];
            String remainingPart = nameParts[1];

            return lastName + ", " + remainingPart;
        }

        public static void main(String[] args) {
            // Testing the methods
            System.out.println(format("Mel", "Johnson")); // Last Name First Name
            System.out.println(format("Dr.", "Mel", "B", "Johnson", "PhD")); // Last Name, Prefix First Middle, Suffix
            System.out.println(format("Johnson, Mel B, PhD")); // Full Name
        }
}

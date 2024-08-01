class MethodsInString{
    public static void main(String args[]){
        String str = "Coding is Good";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 3: " + str.charAt(3));

        // 3. toLowerCase, toUpperCase
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. trim()
        System.out.println("Trimmed: " + str.trim());

        // 5. substring()
        System.out.println("Substring from index 6: " + str.substring(6));

        // 6. replace()
        System.out.println("Replace 'Good' with 'Great': " + str.replace("Good", "Great"));

        // 7. indexOf()
        System.out.println("Index of 'is': " + str.indexOf("is"));

        // 8. equals()
        String str2 = "Coding is Good";
        System.out.println("Equals 'Coding is Good': " + str.equals(str2));

        // 9. lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // 10. compareTo()
        String str3 = "Coding is bad";
        System.out.println("Compare to 'Coding is bad': " + str.compareTo(str3));

        // Additional method: contains()
        System.out.println("Contains 'Good': " + str.contains("Good"));
    }
}

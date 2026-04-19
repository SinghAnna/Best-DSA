public class ClearIbit {
    public static void main(String[] args) {
        int number = 18; // Example number
        int position = 1; // Example position (0-based)

        // Create a mask by left shifting 1 to the desired position and then negating it
        int mask = ~(1 << position);

        // Use bitwise AND to clear the bit at the specified position
        int newNumber = number & mask;

        System.out.println("Original number: " + number);
        System.out.println("Number after clearing bit at position " + position + ": " + newNumber);
    }
}

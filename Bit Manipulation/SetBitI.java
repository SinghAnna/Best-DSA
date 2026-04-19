public class SetBitI {
    public static void main(String[] args) {
        int number = 18; // Example number
        int position = 3; // Example position (0-based)

        // Create a mask by left shifting 1 to the desired position
        int mask = 1 << position;

        // Use bitwise OR to set the bit at the specified position
        int newNumber = number | mask;

        System.out.println("Original number: " + number);
        System.out.println("Number after setting bit at position " + position + ": " + newNumber);
    }
}

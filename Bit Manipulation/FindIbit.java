public class FindIbit {
    public static void main(String[] args) {
        int number = 18; // Example number
        int position = 1; // Example position (0-based)

        // Right shift the number 'position' times and check the least significant bit
        int bit = (number >> position) & 1;

        System.out.println("The bit at position " + position + " in number " + number + " is: " + bit);
    }
}

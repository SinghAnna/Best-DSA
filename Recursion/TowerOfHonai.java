public class TowerOfHonai{

    public static void convertTower(int n , String src, String help, String des){
        if (n == 1) {
            System.out.println("Transfer disk "  + n + " from "+ src + " to " + des);
            return;
        }
        convertTower(n-1, src, des, help);
        System.out.println("Transfer disk "  + n + " from "+ src + " to " + des);

        convertTower(n-1, help, src, des);

    }

    public static void main(String... args){
       
        int n = 3;
        convertTower(n, "S", "H", "D");

    }
   
}
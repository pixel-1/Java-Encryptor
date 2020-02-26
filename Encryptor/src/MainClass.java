import java.util.Scanner;

public class MainClass {
    static Encryptor enc = new Encryptor();
    //static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        while(value < 5 && value >= 0) {
            System.out.println("\n~Main Menu:\n1.Encrypt\n2.Decrypt\n3.Modify number of shifts (current: " + enc.getN() + ")\n4.Modify value of each shift (current: " + enc.getS() + ")\n5.Exit\n");
            value = scan.nextInt();
            switch(value) {
                case(1):
                    case1();
                break;
                case(2):
                    case2();
                break;
                case(3):
                    case3();
                break;
                case(4):
                    case4();
                break;
            }
        }
    }

    public static void case1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n~Enter text to encrypt: ");
        String x=  scan.nextLine();
        enc.setInput(x);
        System.out.println("Encryption: " + enc.encrypt(1));
    }

    public static void case2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n~Enter text to decrypt: ");
        String x=  scan.nextLine();
        enc.setInput(x);
        System.out.println("Decryption:" + enc.encrypt(2));
    }

    public static void case3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n~Enter number of shifts: ");
        enc.setN(scan.nextInt());
    }

    public static void case4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n~Enter the value per shift: ");
        enc.setS(scan.nextInt());
    }
}

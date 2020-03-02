import java.util.Scanner;

public class MainClass {
    static Encryptor enc = new Encryptor();
    public static void main(String[] args) {
        
        //The user menu interface
        Scanner scan = new Scanner(System.in);
        int value = 0;
        while(value < 7 && value >= 0) {
            System.out.println("\n~Main Menu:\n1.Encrypt\n2.Decrypt\n3.Modify number of shifts (current: " + enc.getN() + ")\n4.Modify value of each shift (current: " + enc.getS() + ")\n5.Encrypt using a keyword\n6.Decrypt using a keyword\n7.Exit\n");
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
                case(5):
                    case5();
                break;
                case(6):
                    case6();
                break;
            }
        }
    }
    
    
    //Each option displayed according to selection
    
    public static void case1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n~Enter text to encrypt: ");
        String x=  scan.nextLine();
        enc.setInput(x);
        System.out.println(" Encryption: " + enc.encrypt(1));
    }

    public static void case2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n~Enter text to decrypt: ");
        String x=  scan.nextLine();
        enc.setInput(x);
        System.out.println(" Decryption:" + enc.encrypt(2));
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

    public static void case5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n~Enter the keyword: ");
        String y=  scan.nextLine();
        enc.setKey(y);
        System.out.print("\n~Enter text to encrypt: ");
        String x=  scan.nextLine();
        enc.setInput(x);
        System.out.println(" Encryption:" + enc.encryptKey(1));
    }

    public static void case6() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n~Enter the keyword: ");
        String y=  scan.nextLine();
        enc.setKey(y);
        System.out.print("\n~Enter text to decrypt: ");
        String x=  scan.nextLine();
        enc.setInput(x);
        System.out.println(" Decryption:" + enc.encryptKey(2));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       System.out.println("Kā Tevi sauc?");
       String user_name = scan.nextLine();
       System.out.println("Labdien, " + user_name);

       System.out.println("Vai vēlies apmeklēt Programmēšanas skolas nodarbības?");
       String ansver = scan.nextLine();
       if(ansver.contains("jā")) {
           System.out.println("Paldies! Mūsu konsultants sazināsies ar Tevi!");
       } if(ansver.contains("nē")) {
            System.out.println("Vai vēlies saņemt sīkāku informāciju?");
            String ansver_sec = scan.nextLine();
            if(ansver_sec.contains("jā")) {
                System.out.println("Paldies! Mūsu konsultants sazināsies ar Tevi!");
                } else {
                System.out.println("Paldies!");
            }
           }
        } 
    }

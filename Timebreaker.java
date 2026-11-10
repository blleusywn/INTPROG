import java.util.Scanner;
public class Timebreaker {

    public static void main(String[] args){
        Scanner a = new Scanner (System.in);
        int Seconds, Minutes, Hours;
        System.out.print("Enter Value in Seconds; ");
        Seconds = a.nextInt();
        Hours = Seconds/3600;
        Minutes = (Seconds % 3600) / 60;
        Seconds = Seconds % 60;
        System.out.println("Hours(s); " + Hours);
        System.out.println("Minute(s); " + Minutes);
        System.out.println("Senond(s); " + Seconds);
        a.close();
    }
}

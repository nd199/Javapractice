import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Prime Number

        System.out.println("Enter your Number");
        int  n = sc.nextInt();
        int count=1;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2) System.out.println("Prime");
        else System.out.println("not");
    }
}
class StringRev{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String s = sc.next();
        int i = s.length();
        while(i>0){
            System.out.println(s.charAt(i-1));
            i--;
        }
    }
}

class leap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year != 0) {

            if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            }
            else if (year % 100 == 0) {
                    System.out.println(year + " is not a leap year");
            }
            else if (year % 400 == 0) {
                        System.out.println(year + " is a leap year");
            }
            else System.out.println("Not a leap year " + year);
        }
        else System.out.println("Invalid year: " + year);
    }
}








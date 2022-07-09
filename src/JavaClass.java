import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaClass {

    public static void main(String[] args) {
        int r = 3;

        double areaOfCircle = 3.14 * r * r;
        Math.abs(areaOfCircle);

        System.out.println("Area of circle: " + areaOfCircle);

        int d = 8;
        int r1 = d / 2;
        double areaOfCircle1 = 3.14 * r1 * r1;
        System.out.println("Area of circle1: " + Math.abs(areaOfCircle1));

    }
}

class javaClass {

    public static void main(String[] args) {

        int h = 20;
        int b = 10;

        double areaOfTriangle = b / 2 * h;

        System.out.println("Area of triangle: " + Math.abs(areaOfTriangle));
    }

}

class FibonacciClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0, b = 1, next;

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = a + b;  // next = a + b; // 0 + 1 = 1
                a = b;  // a = b -> a = 0 -> a = 1
                b = next; // b = next ->  1

                 // a = 0
                 // b = 1
                 // next = 0 + 1 = 1 -> b = 1
                 // a + b = 1 + 1 = 2
                 // a = 1
                 // b = 1
                 // next = 1 + 1 = 2 -> b = 2
                 // a = 1
                 // b = 2
                // next = 1 + 2 = 3 -> b = 3
            }
            System.out.println(next);
        }
    }
}


class factorial{

    public static void main(String[] args) {

        int n = 4;
        int factorial = 1;

        for (int i = 1; i <=n; i++)
        {
            factorial = factorial * i;
            // i = 1  factorial = 1  ->  1 = 1 * 1   1 = 1*2   1=1*3  1=1*4
            // 1 * 2 * 3 * 4 = 24
        }
        System.out.println(factorial);
    }
}

class ElectricityBilling{

    public static void main(String[] args) {

        int watts = 500;
        int daysOfMonth = 30;
        int hours = 24;
        int totalWattsPerMonth = 30 * 24 * 500; // perMonth   he uses 500 for each hour 24 hours for 30 days a month
        //  calculate for $7 perUnit -> 1 unit = 7 dollars
        // W.K.T ,  ->   1 Unit = 1 KiloWatt
        // 1 kiloWatt -> 1000 watts
        int units = totalWattsPerMonth / 1000; //
        int cost = units * 7;
        System.out.println(cost);


    }
}

class ElectricityBill{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of units");
        int units = sc.nextInt();
        double billPay = 0;
        System.out.println("Enter Cost per Unit ");
        int cost = sc.nextInt();
        billPay = units * cost;
        System.out.println(billPay);
    }
}

class AverageOfNNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int Arr[] = new int[numbers];
        int sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
            sum = sum+Arr[i];
        }
        int average = sum / Arr.length;
        System.out.println("averageOfNNumbers is : " + average);
    }
}

class DiscountOfProduct{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount of the product");
        int Amount = sc.nextInt();
        System.out.println("Enter the DiscountOfProduct");
        double DiscountOfProduct = sc.nextDouble();
        System.out.println(DiscountOfProduct);
        DiscountOfProduct  = DiscountOfProduct/100;
        double RateAfterDiscount = (double) (Amount * DiscountOfProduct);
        System.out.println("Cost of Product AfterDiscount : " + RateAfterDiscount);

    }
}

class DistanceBetweenTwoPoints{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X1");
        int x1 = sc.nextInt();
        System.out.println("Enter Y1");
        int y1 = sc.nextInt();
        System.out.println("Enter X2");
        int x2 = sc.nextInt();
        System.out.println("Enter Y2");
        int y2 = sc.nextInt();
        int distance = (int) Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("Distance between two points : " + distance);
    }
}

class PowerOfNumber{

    public static void main(String[] args) {
        int a = 20;
        int power = 2;
        double powerOfNumber = Math.pow(a,power);
        System.out.println("PowerOfNumber" + powerOfNumber);

        for(int i=1; i<a ; i++) {
            a = a*power;

        }
        System.out.println("PowerOfNumber" + powerOfNumber);
    }
}


class StringReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String  s = sc.nextLine();
        int i = s.length();
        while(i>0){
            System.out.print(s.charAt(i-1));
            i--;
        }
    }
}

class LeapYear{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year!=0){
            if(year%400==0)
                System.out.println( year + " is a leap year ");
            else if (year%100==0) {
                System.out.println(year + " is not a leap year");
            } else if (year%4==0) {
                System.out.println(year + " is  a leap year");
            }
            else System.out.println(year+" is not a leapYear");
        }
        else System.out.println(year+" does not Exist ");
    }
}

class PrimeNumber{

    public static void main(String[] args) {

        int n = 2;
        int count =0;
        for(int i = 1 ; i<=7 ;i++){
            if(n%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("is a prime Number" );
        }
        else {
            System.out.println("Not a prime Number");
        }
    }
}


import java.util.Scanner;

public class CalculateMoneySpent {
    /**
     * @param args
     */
    public static void main (String[] args) {
        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay =7;

        Scanner input = new Scanner(System.in) ;

        System.out.println("Calculate Your Money!!!\n") ;

        System.out.println("How much money did you spend at theclub on Monday") ;
        moneySpent = input.nextInt() ; 

        total = moneySpent; 

        System.out.println("How much money did you spend at theclub on Tuesday") ;
        moneySpent = input.nextInt() ; 

        total = total + moneySpent; 

        System.out.println("How much money did you spend at theclub on Tuesday") ;
        moneySpent = input.nextInt() ;

        total = total + moneySpent;

        System.out.println("How much money did you spend at theclub on Wednesday") ;
        moneySpent = input.nextInt() ;

        total = total + moneySpent;

        System.out.println("How much money did you spend at theclub on Thursday") ;
        moneySpent = input.nextInt() ;

        total = total + moneySpent;

        System.out.println("How much money did you spend at theclub on Friday") ;
        moneySpent = input.nextInt() ;

        total = total + moneySpent;

        System.out.println("How much money did you spend at theclub on Saturday") ;
        moneySpent = input.nextInt() ;

        total = total + moneySpent;

        System.out.println("How much money did you spend at theclub on Sunday") ;
        moneySpent = input.nextInt() ;

        total = total + moneySpent;

        average = (double) total/totalDay;

        System.out.println("The Calculation Results:") ;

        System.out.println("Hi Jonson.") ;
        System.out.println("Your total expenditure at the club this week is $" + total) ;
        System.out.println("With an Average daily expenditureof $" + average) ;
    }
}

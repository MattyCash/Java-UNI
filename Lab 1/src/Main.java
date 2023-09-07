import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice,quantity,sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum = 0, sdacha = 0;
        System.out.println("Availible types of product");
        System.out.println("1.Maxi Tea 300tg");
        System.out.println("2.Water 250tg");
        System.out.println("3.Peki 300tg");
        System.out.println("4.Albeni 250tg");
        System.out.println("5.Pay");
        System.out.println("Your Money: ");
        Scanner money = new Scanner(System.in);
        int money2 = money.nextInt();
        while(true){
            System.out.println("Enter your choice");
            choice = s.nextInt();
            switch(choice){
                case 1:    System.out.println("You have choosen Maxi Tea");
                    System.out.println("Enter number of bottles:");
                    quantity = s.nextInt();
                    System.out.println("You have choosen " + quantity + " bottels");
                    sum1 += quantity * 300;
                    System.out.println("Total for Maxi Tea: " + sum1);
                    break;
                case 2:    System.out.println("You have choosen Water");
                    System.out.println("Enter number of bottles:");
                    quantity = s.nextInt();
                    System.out.println("You have choosen " + quantity + " bottels");
                    sum2 += quantity * 250;
                    System.out.println("Total for Water: " + sum2);
                    break;
                case 3:    System.out.println("You have choosen Peki");
                    System.out.println("Enter number of Peki: ");
                    quantity = s.nextInt();
                    System.out.println("You have choosen " + quantity + " Peki");
                    sum3 += quantity * 300;
                    System.out.println("Total for Peki: " + sum3);
                    break;
                case 4:    System.out.println("You have choosen Albeni");
                    System.out.println("Enter number of Albenies: ");
                    quantity = s.nextInt();
                    System.out.println("You have choosen " + quantity + " Albeni");
                    sum4 += quantity * 250;
                    System.out.println("Total for Albeni: "+ sum4);
                    break;
                case 5: System.out.println("Total sum: " + sum);
                    if(money2 > sum) {
                        sdacha = money2 - sum;
                        System.out.println("Collect your monney " + sdacha);
                        System.out.println("Want something else?");
                        System.out.println("Thank you! Have a nice day!");
                    }
                    else if(money2 < sum){
                        System.out.println("Oops! Low amount of money, enter more.");
                    }
                    System.exit(0);
            }
            sum = sum1 + sum2 + sum3 + sum4;
            System.out.println("Total sum: " + sum);
            System.out.println("Want something else?");
        }

    }
}

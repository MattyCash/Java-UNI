import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        User user1 = new User();
        user1.Userinfo("lolodil", "qwerty123");
                user1.auto();
        Product[] fruits = new Product[]{new Product("Apple", 200, 4.6), new Product("Banana", 225, 4.2)};
        Product[] vegetables = new Product[]{new Product("Cucumber", 210, 3.5), new Product("Onion", 170, 2.7)};
        Category Fruit = new Category("Fruit", fruits);
        Category Vegetables = new Category("Vegetables", vegetables);
        Category[] categories = new Category[]{Fruit, Vegetables};
        while (true) {
            System.out.println("Select your category:");
            for (int i = 0; i < categories.length; ++i) {
                System.out.println((i + 1) + ". " + categories[i].name);
            }
            System.out.println("0. Exit");
            int x = -1;
            while (true) {
                x = in.nextInt();
                if (x >= 0 && x <= categories.length) break;
                System.out.println("Select category:");
                for (int i = 0; i < categories.length; ++i) {
                    System.out.println((i + 1) + ". " + categories[i].name);
                }
            }
            if(x == 0) break;
            x--;
            System.out.println("Select product:");
            Category category = categories[x];
            for (int i = 0; i < category.products.length; ++i) {
                System.out.println((i + 1) + ". " + category.products[i].getName() + " " + category.products[i].getPrice() + " " + category.products[i].getRating());
            }
            int z = -1;
            while (true) {
                z = in.nextInt();
                if (z > 0 && z <= category.products.length) break;
                System.out.println("Select product:");
                for (int i = 0; i < category.products.length; ++i) {
                    System.out.println((i + 1) + ". " + category.products[i].getName() + " " + category.products[i].getPrice() + " " + category.products[i].getRating());
                }
            }
            user1.basket.add(category.products[z - 1]);

        }
        System.out.println("Your basket:\n" );
        List<Product> list = user1.basket;
        int totalprice=0;
        for(int i = 0 ; i < list.size(); ++i){
            System.out.println((i+1) + ". " + list.get(i).getName() + " " + list.get(i).getPrice());
            totalprice+=list.get(i).getPrice();
        }
        System.out.println("Total price: " + totalprice);

        System.out.println("Enter your money: ");
        Scanner cash = new Scanner(System.in);
        int cash1 = cash.nextInt();
        if(cash1 < totalprice){
            System.out.println("Not enough money! Enter more.");
            Scanner cash2 = new Scanner(System.in);
            int cash3 = cash.nextInt();
            System.out.println("Thanks for purchase, take your change " + Math.abs(totalprice - (cash1+cash3)));
        }
        else{
            System.out.println("Thanks for purchase, take your change " + Math.abs(totalprice - cash1));
        }
    }

}




class Product {
        private String name;
        private int price;
        private int id;
        private double rating;
        private static int counter = 1;

    public Product(String name, int price, double rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.id = counter++;
        }

        public void getInfo() {
            System.out.println("Product " + this.id + " is: " + this.name + ". Price is " + this.price + ". Rating is" + this.rating);
        }

        public String getName() {
            return this.name;
        }

        public int getPrice() {
            return this.price;
        }

    public double getRating() {
        return rating;
    }
}


class Category{
    String name;
    Product[] products;
    Category(String name,Product[] products){
        this.name=name;
        this.products=products;
    }

}

class Basket{
    List<Product> list = new ArrayList<Product>();

}

class User {
    private String username;
    private String password;
    List<Product> basket = new ArrayList<>();
    void Userinfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void auto() {
        System.out.println("Welcome to online shopping website!");
        System.out.println("Do you have an Account (Answer '1' for yes and '2' for no)");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Enter your Username");
            Scanner us = new Scanner(System.in);
            String username1 = us.nextLine();
            if (username1.equals(username)) {
                System.out.println("Enter your Password");
                Scanner ps = new Scanner(System.in);
                String password1 = us.nextLine();
                if (password1.equals(password)) {
                    System.out.println("Welcome to online shopping website");
                } else {
                    System.out.println("Wrong password! Try again.");
                }
            }
            else{
                System.out.println("Username is Incorrect");
            }
        }
        if (a == 2) {
            System.out.println("Enter your name");
            Scanner name = new Scanner(System.in);
            String username = name.nextLine();
            System.out.println("Enter your phone number");
            Scanner num = new Scanner(System.in);
            String number = num.nextLine();
            System.out.println("Enter your Password");
            Scanner ps = new Scanner(System.in);
            String password = ps.nextLine();
            System.out.println("You are successfully Registered! Welcome to online shopping website!");
        }
    }
}





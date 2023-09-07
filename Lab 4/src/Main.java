import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String full_name = name.nextLine();
        System.out.println("Enter your age: ");
        int age = name.nextInt();
        System.out.println("Enter your experience: ");
        int experience = name.nextInt();
        System.out.println("Enter your car-engine power: ");
        int power = name.nextInt();
        System.out.println("Enter your car company: ");
        Scanner companyname = new Scanner(System.in);
        String company = companyname.nextLine();

        Person person1 = new Person(full_name, age, experience, power, company);

        System.out.println("Your car type:");
        System.out.println("Lorry or SportCar");
        Scanner typecar = new Scanner(System.in);
        String cartype = typecar.next();

        if (cartype.equals("Lorry"))
        {
            System.out.println("How much luggage do you have? (1000kg is Available)");
            float luggage = name.nextFloat();
            if (luggage > 1000)
            {
                System.out.println("Too much weight");
            }
            else
            {
                if(luggage < 500) {
                    Car lorry1 = new Car();
                    lorry1.start();
                    for (int i = 0; i <= 100; i += 15) {
                        System.out.println("Speed: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("After 200m turn right");

                    System.out.println("After 100m turn right");
                    lorry1.turnRight();
                    for (int i = 0; i <= 100; i += 15) {
                        System.out.println("Speed: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    System.out.println("After 200m turn left");
                    System.out.println("After 100m turn left");
                    lorry1.turnLeft();
                    for (int i = 0; i <= 100; i += 15) {
                        System.out.println("Speed: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("After 200m final destination");
                    System.out.println("After 100m final destination");
                    lorry1.stop();
                    System.out.println("You have arrived!");
                }
                else{
                    Car lorry1 = new Car();
                    lorry1.start();
                    for (int i = 0; i <= 100; i += 10) {
                        System.out.println("Speed: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("After 200m turn right");
                    System.out.println("After 100m turn right");
                    lorry1.turnRight();
                    for (int i = 0; i <= 100; i += 10) {
                        System.out.println("Speed: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("After 200m turn left");
                    System.out.println("After 100m turn left");
                    lorry1.turnLeft();
                    for (int i = 0; i <= 100; i += 10) {
                        System.out.println("Speed: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("After 200m final destination");
                    System.out.println("After 100m final destination");
                    lorry1.stop();
                    System.out.println("You have arrived!");
                }
            }
        }
        else if (cartype.equals("SportCar"))
        {
            System.out.println("How fast your car can be? (no more than 220 km/h)");
            int maxspeed = name.nextInt();
            if (maxspeed  > 220)
            {
                System.out.println("Too fast");
            }
            else
            {
                Car car1 = new Car();
                car1.start();
                for(int i = 0; i <= 100; i+=25){
                    System.out.println("Speed: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("After 200m turn right");
                System.out.println("After 100m turn right");
                car1.turnRight();
                for(int i = 0; i <= 100; i+=25){
                    System.out.println("Speed: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("After 200m turn left");
                System.out.println("After 100m turn left");
                car1.turnLeft();
                for(int i = 0; i <= 100; i+=25){
                    System.out.println("Speed: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("After 200m final destination");
                System.out.println("After 100m final destination");
                car1.stop();
                System.out.println("You have arrived!");
            }
        }
        }
    }



class Engine
{
    int power;
    String company;
    public String toString(int power, String company) {return power + "\n" + company;}
}


class Person extends Driver
{
    private String full_name;
    private int age;
    public Person(String full_name, int age, int experience, int power, String company)
    {
        this.full_name = full_name;
        this.age = age;
        this.experience = experience;
        this.power = power;
        this.company = company;
    }
    public String toString(String full_name, int age, int experience, int power, String company){return full_name + "\n" + age + "\n" + experience + "\n" + power + "\n" + company;}
}

class Driver extends Engine
{
    int experience;
    public String toString(int experience){return experience + "\n";}
}


class Car extends Engine
{
    private String model;
    private String type;
    private double weight;
    public void start()
    {
        System.out.println("Go");
    }
    public void stop()
    {
        System.out.println("Stop");
    }
    public void turnRight()
    {
        System.out.println("Right");
    }
    public void turnLeft()
    {
        System.out.println("Left");
    }
    class Lorry
    {
        float load_capacity;
    }
    class SportCar
    {
        int max_speed;
    }
}

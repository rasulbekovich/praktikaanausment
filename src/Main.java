import accontument.Accontument;
import device.Laptop;
import device.Phone;
import home.Home;
import transport.Airplane;
import transport.Car;
import transport.Helicopter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner=new Scanner(System.in);
        Phone phone1 = new Phone("Iphone", "\uD83D\uDE0E", 147000, "Amazing phone", "14 PRO Max", 256);
        Phone phone2 = new Phone("Samsung", "\uD83E\uDD29", 50000, "Great phone", "S21", 128);
        Phone[] phones = {phone1, phone2};

        Laptop laptop1 = new Laptop("MacBook", "\uD83D\uDE0D", 5000, "Wonderful laptop", "Mac OS");
        Laptop laptop2 = new Laptop("Acer", "\uD83E\uDD16", 176000, "Productive laptop", "Windows");
        Laptop[] laptops = {laptop1, laptop2};

        Home home1 = new Home("Ihlas", "\uD83C\uDFE2", 3500000, "Great Home", "Multi-storey", 10);
        Home home2 = new Home("Chaos", "\uD83C\uDFE0", 15000000, "Amazing Home", "House", 25);
        Home[] homes = {home1, home2};

        Car car1 = new Car("Mercedes-Benz", "\uD83D\uDE98", 15000000, "Wonderful Car", "Black", LocalDate.of(2010, 3, 6));
        Car car2 = new Car("BMW", "\uD83D\uDE99", 12000000, "Fast Car", "Purple", LocalDate.of(2020, 8, 28));
        Car[] cars = {car1, car2};

        Airplane airplane1 = new Airplane("Supermarine Spitfire", "\uD83D\uDEE9", 125000000, "Fast Airplane", "White", LocalDate.of(2015, 1, 14));
        Airplane airplane2 = new Airplane("Airbus A320", "✈️", 23000000, "Large Airplane", "Blue", LocalDate.of(2004, 11, 16));
        Airplane[] airplanes = {airplane1, airplane2};

        Helicopter helicopter1 = new Helicopter("MD 500 Defender", "\uD83D\uDE81", 13500000, "Fast Helicopter", "Brown", LocalDate.of(2012, 12, 23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache", "\uD83D\uDE81", 115000000, "Large Helicopter", "Red", LocalDate.of(1999, 7, 9));
        Helicopter[] helicopters = {helicopter1, helicopter2};
        Accontument[] accontuments = {phone1, phone2, car1, car2, helicopter1, helicopter2, home1, home2, airplane1, airplane2, laptop1, laptop2};
//        System.out.println("baasy:");
        findByPrice(5000, accontuments);
        //     System.out.println("aty:");
        fineByName("BMW", accontuments);
        //       System.out.println("opisanie");
        fineByDescription("Fast Helicopter", accontuments);
        fineByMaxPrice(accontuments);
    }

    public static void findByPrice(double price, Accontument[] accontuments) {
        for (Accontument accontument : accontuments) {
            if (accontument.getPrice() == price) {
                System.out.println(accontument);
            }

        }
    }

    public static void fineByName(String name, Accontument[] accontuments) {
        for (Accontument accontument : accontuments) {
            if (accontument.getName() == name) {
                System.out.println(accontument);
            }

        }
    }

    public static void fineByDescription(String description, Accontument[] accontuments) {
        for (Accontument accontument : accontuments) {
            if (accontument.getDescription() == description) {
                System.out.println(accontument);
            }

        }

    }

    public static void fineByMaxPrice( Accontument[] accontuments) {
        double maxPrice=accontuments[0].getPrice();
        for (Accontument accontument : accontuments) {
            if (accontument.getPrice()>maxPrice)
                maxPrice=accontument.getPrice();}
        for (Accontument accontument : accontuments) {
            if (accontument.getPrice()==maxPrice)
                System.out.println("max price"+accontument);
        }
    }
}



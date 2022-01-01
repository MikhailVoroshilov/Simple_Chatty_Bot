import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner robo = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String name = robo.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int three = robo.nextInt();
        int five = robo.nextInt();
        int seven = robo.nextInt();
        int age = (three * 70 + five * 21 + seven * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int cicle = robo.nextInt();
        for (int i = 0; i <= cicle; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");

    }
}



import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String Answer ;
    public static void main(String[] args) {
        System.out.println("What's Up Man ");
        //Take UserName
        System.out.println("Welcome To Our System ");
        System.out.print("Enter Your name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome " + name + " How is your Day?");
        //Asking for day
        System.out.println("Good or Bad?");
        Answer = scanner.next();
        if (Answer.equals("Good")) {
            System.out.println("Happy to hear that");
        }else{
            System.out.println("I'm sorry wish u good luck ");
    }
        //Know your Elements

        //Workers
        System.out.println("Meet our Workers !");
        Workers mo =new Workers("Mohamed","Manger","White",50);
        Workers youssef = new Workers("Youssef","Owner","White",35);
        Workers Shadow = new Workers("Mohamed Ahmed ","Cleaner","Black",55);
        System.out.println(youssef.name+" "+youssef.age+" "+youssef.color+" "+youssef.position);
        System.out.println(mo.name+" "+mo.age+" "+mo.color+" "+mo.position);
        System.out.println(Shadow.name+" "+Shadow.age+" "+Shadow.color+" "+Shadow.position);
        // Help to know your animals
        System.out.println("Wanna Know about our animals ?");
        System.out.println("yes or no");
        Answer= scanner.next();
        if (Answer.equals("yes")) {
            System.out.println("Here is our Animals");
            Lions lion = new Lions("Simba", true, "white", 2);
            Birds bird = new Birds("Phoenix", true, "Gold", 2, 2);
            Monkeys monkey = new Monkeys("chimpanzee", true, "Black", 2);

            //Print Names of Animals
            System.out.println(lion.getName());
            System.out.println(bird.getName());
            System.out.println(monkey.getName());
        }
        else {
            System.out.println("We will continue anyway  ");
        }
        //Ask for Test
        System.out.println("Do You mind if u take a quick test ?");
        System.out.println("yes or no ? ");
        Answer = scanner.next();
        if (Answer.equals("yes")) {
            System.out.println("alright let's start ");
        } else{
            System.out.println("We will Start anyway");
        }
        // Quick Test
            System.out.println("What is monkeys eat ?");
            System.out.print("Enter Your Answer : ");
           // Scanner scanner = new Scanner(System.in);
            Answer = scanner.next();
            Monkeys.food(Answer);
            //Lions Test
            System.out.println("What is Lions eat ?");
            System.out.print("Enter Your Answer : ");
            String Answer = scanner.next();
            Lions.food(Answer);
            //Birds Test
            System.out.println("Is birds fly ?");
            System.out.print("Enter Your Answer : ");
            Answer = scanner.next();
            Birds.isFly(Answer);
        }
    }

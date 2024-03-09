public class Monkeys extends Animals {
    public Monkeys(String name, boolean hasTale, String color, int legs) {
        super(name, hasTale, color, legs);
    }

    public  static void  food(String food) {

            if (food.equals("banana"))
                System.out.println("Correct");
            else
                System.out.println("Try again MF");
    }
}
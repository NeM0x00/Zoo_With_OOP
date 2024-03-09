public class Lions extends Animals {

    public Lions(String name, boolean hasTale, String color, int legs) {
        super(name, hasTale, color, legs);
    }
    public  static void food(String food ){
        if (food.equals("meat")){
            System.out.println("Hell Yeah");
        } else {
            System.out.println("Try again MF");
        }
    }
}
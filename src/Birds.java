public class Birds extends Animals {
    private int wings ;

    public Birds(String name, boolean hasTale, String color, int legs, int wings) {
        super(name, hasTale, color, legs);
        this.wings = wings;
    }

    public static void isFly (String isFly){
        if (isFly.equals("yes"))
            System.out.println("You are on fire");
            else if (isFly.equals("no")){
            System.out.println("Alright ! Who is flying ?? your girlfriend ?");
        }
        else
            System.out.println("Your IQ is zero ");
    }
    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}

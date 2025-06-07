public class constant {

    public  static final int WIDTH = 800;
    public  static final int HEIGHT = 600;
    public static final Person P1 = new Person("");
    public static final int NUM_ENEMIES = 5;

    public static void main(String[] args) {

        // contstant never change, constats are upper case
        // declare constant by using the ''final' modififer, constant can be public because thyere is no harm in accessing variable directly if you can not alter it
        System.out.println(" Width is :" + constant.WIDTH);
        System.out.println(Math.PI);
    }    
}

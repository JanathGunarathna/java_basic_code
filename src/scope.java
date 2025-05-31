public class scope {
    public static void main(String[] args) {
        x=5;
        System.err.println(x);
        doSomething();
        System.err.println(x);
    }
    static int x;

    static void doSomething(){
        x=10;
    }
}
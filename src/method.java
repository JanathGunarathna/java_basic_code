public class method {
    public static void main(String[] args) {
        sayHelloworldNew();

        sayHelloWorldNew2("charlie");
        sayHelloWorldNew2("John");

        int x = returnThree();
        System.out.println(x);

        int result= square(returnThree());
        System.out.println(result);
    }
    static int square(int x){
        return x*x;
    }
    static int returnThree(){
        return 3;
    }

    static void sayHelloWorldNew2(String name) {
        System.out.println("Hello, " + name);
    }
    static void sayHelloworldNew() {
        System.out.println("Hello World");
    }
}

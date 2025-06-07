package overriding;

// subclass is inheritang all the variable and methods desine in base
public class Subclass extends Base{
    public static void main(String[] args) {
        
        Subclass s = new Subclass();
    }
    public Subclass(){
        sayHello(); // we are calling the sayHello methhod define in base
    }

    @Override // clicking ctrl+ space , we can get many option
    public void sayHello() {
        super.sayHello();

        System.out.println(" Hi");
    }

}

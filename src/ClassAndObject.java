
import javax.swing.JLabel;

public class ClassAndObject {
    public static void main(String[] args) {
        JLabel label = new JLabel();

        Person Amala = new Person("Amala");
        //Amala.name = "Amala";
        Amala.setAge(20);

        Person perera = new Person("perera");
        //perera.name = "Perera";
        perera.setAge(34);

        Amala.sayHeyTo(perera);
        System.out.println("Amala is " + Amala.age + " and " + perera.name);
    }
}
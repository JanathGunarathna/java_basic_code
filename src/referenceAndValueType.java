public class referenceAndValueType {
    public static void main(String[] args) {
        int x=6;
        addOneTo(x);
        System.out.println(x);

        Person john;
        john= new Person("john");
        john.setAge(20);
        celebrateBirthday(john);
        System.out.println(john.getAge());

    }
    public static void celebrateBirthday(Person john) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'celebrateBirthday'");
       john.setAge(john.getAge()+1);
    }
    static void addOneTo (int number){
        number= number + 1;
    }
}

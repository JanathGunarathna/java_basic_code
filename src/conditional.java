public class conditional{
    public static void main(String[] args) {
       boolean sayHello = false;
     //  boolean sayBye = true;
       
        if(sayHello){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
        //if(sayBye){
           // System.out.println("Bye");
        //}
        if(false && true){
            System.out.println("AND operation");
        }
        if(false || false){
            System.out.println("OR operation");
        }
    }
}
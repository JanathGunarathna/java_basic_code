
public class loop{
    public static void main(String[] args) {
        //whileloop();
        //doWhileloop();
        forloop();
    }
    static void whileloop(){
        int counter =8;
        while (counter < 10){
            counter= counter + 1;
            System.out.println(counter);
        }
    }
    static void doWhileloop(){
        int counter=9;
        do { 
            counter=counter+1;
            System.out.println(counter);
        } while (counter<10);
    }
    static void forloop(){
         for(int counter=0;counter<10;counter++){
            System.out.println(counter);
         }   
    }
}


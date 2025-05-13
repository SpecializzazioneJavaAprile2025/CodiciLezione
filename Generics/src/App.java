import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        GenericClass<Integer, Integer, String, LinkedList<String>> gc = new GenericClass<>(1);
        
        System.out.println(gc.getData());

        //GenericClass<String> gs = new GenericClass<>("Hello");

        //System.out.println(gs.getData());
    }
}

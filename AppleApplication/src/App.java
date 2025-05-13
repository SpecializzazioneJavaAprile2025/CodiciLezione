import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Apple> apples = List.of(
            new Apple(Color.GREEN, 120),
            new Apple(Color.RED, 170),
            new Apple(Color.GREEN, 150),
            new Apple(Color.RED, 110),
            new Apple(Color.GREEN, 89),
            new Apple(Color.RED, 75),
            new Apple(Color.GREEN, 180),
            new Apple(Color.RED, 115)
        );

        // List<Apple> greenApples = filterGreenApples(apples);

        // List<Apple> greenApples = filterApples(apples, Color.GREEN);

        // for (Apple apple : greenApples) {
        //     System.out.println(apple.getColor());
        // }

        // List<Apple> redApples = filterRedApples(apples);

        // List<Apple> redApples = filterApples(apples, Color.RED);

        // for (Apple apple : redApples) {
        //     System.out.println(apple.getColor());
        // }

        // List<Apple> applesByWeight = filterApplesByWeight(apples, 150);

        // List<Apple> redApples = filterApples(apples, new AppleRedColorPredicate());
        // List<Apple> greenApples = filterApples(apples, new AppleGreenColorPredicate());
        // List<Apple> heavyApples = filterApples(apples, new AppleWeightPredicate());

        // for (Apple apple : redApples) {
        //     System.out.println(apple.getColor());
        // }

        
        // for (Apple apple : greenApples) {
        //     System.out.println(apple.getColor());
        // }

        
        // for (Apple apple : heavyApples) {
        //     System.out.println(apple.getWeight());
        // }

        Predicate<Apple> redApple = (Apple a) -> a.getColor().equals(Color.RED);
        Predicate<Apple> greenApple = (Apple a) -> a.getColor().equals(Color.GREEN);
        Predicate<Apple> lightApple = (Apple a) -> a.getWeight() < 150;
        Predicate<Apple> heavyApple = (Apple a) -> a.getWeight() > 150;


        List<Apple> redApples = filterApples(apples, redApple);
        List<Apple> greenApples = filterApples(apples, greenApple);
        List<Apple> heavyApples = filterApples(apples, heavyApple);

        for (Apple apple : redApples) {
            System.out.println(apple.getColor());
        }

        
        for (Apple apple : greenApples) {
            System.out.println(apple.getColor());
        }

        
        for (Apple apple : heavyApples) {
            System.out.println(apple.getWeight());
        }

    }

    // public static List<Apple> filterGreenApples(List<Apple> apples){
    //     List<Apple> result = new ArrayList<>();
    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(Color.GREEN)){
    //             result.add(apple);
    //         }
    //     }
    //     return result;
    // }

    // public static List<Apple> filterRedApples(List<Apple> apples){
    //     List<Apple> result = new ArrayList<>();
    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(Color.RED)){
    //             result.add(apple);
    //         }
    //     }
    //     return result;
    // }


    // public static List<Apple> filterApples(List<Apple> apples, Color color){
    //     List<Apple> result = new ArrayList<>();
    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(color)){
    //             result.add(apple);
    //         }
    //     }
    //     return result;
    // }

    // public static List<Apple> filterApplesByWeight(List<Apple> apples, int weight){
    //     List<Apple> result = new ArrayList<>();
    //     for(Apple apple : apples){
    //         if(apple.getWeight() > weight){
    //             result.add(apple);
    //         }
    //     }
    //     return result;
    // }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


}

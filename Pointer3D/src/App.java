import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // Set<Pointer3D> points = new HashSet<>(
        //     Set.of(
        //         new Pointer3D(10,10,5),
        //         new Pointer3D(10,10,5),
        //         new Pointer3D(20,10,5),
        //         new Pointer3D(30,10,5),
        //         new Pointer3D(40,10,5)
        //     )
        // );

        class Point3DComparator implements Comparator<Pointer3D> {
            @Override
            public int compare(Pointer3D p1, Pointer3D p2) {
                return (p1.x + p1.y + p1.z) - (p2.x + p2.y + p2.z);
            }
        }

        Set<Pointer3D> points = new TreeSet<>(new Point3DComparator());

        points.addAll(Set.of(
            new Pointer3D(10,10,5),
            new Pointer3D(10,10,5),
            new Pointer3D(20,10,5),
            new Pointer3D(30,10,5),
            new Pointer3D(40,10,5)
        ));

        for (Pointer3D point : points) {
            System.out.println(point.print());
        }

    }
}

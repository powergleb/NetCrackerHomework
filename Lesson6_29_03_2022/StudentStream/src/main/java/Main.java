import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static BigInteger getFactorial(int f) {
        if (f < 2) {
            return BigInteger.valueOf(1);
        }
        else {
            return IntStream.rangeClosed(2, f).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }
    public static void main(String[] args) {
        System.out.println();
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ivan","Ivanovi4", new int[]{5,4,5,4}));
        students.add(new Student("Mixa","MIxailov", new int[]{3,4,5,2}));
        students.add(new Student("Petya","Petrov", new int[]{4,4,4,4}));
        students.add(new Student("Jack","Allen", new int[]{5,5,5,5}));
        students.add(new Student("Jacob","Lang", new int[]{2,3,3,3}));
        students.add(new Student("Jerry","Barnett", new int[]{3,2,3,5}));
        students.add(new Student("William","Miles", new int[]{3,4,3,4}));
        students.add(new Student("Jacob","Lang", new int[]{5,5,5,5}));
        students.add(new Student("Leonard","Ballard", new int[]{4,4,4,4}));
        students.add(new Student("Benjamin","Thompson", new int[]{4,5,3,2}));


        List<Student> studentsNew =  students.stream().filter(x -> Arrays.stream(x.getMarks()).anyMatch(mark -> mark == 3 || mark ==2)).collect(Collectors.toList());

        studentsNew.stream().forEach(x -> System.out.println(x.toString()));


        System.out.println(getFactorial(7));

    }
}

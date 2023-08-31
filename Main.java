import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        names.remove("Walter");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Mike"));
        System.out.println(names.isEmpty());
        for (String name: names) {
            System.out.println(name);
        }
        names.forEach(System.out::println);
        names.clear();
        System.out.println(names);

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(1);
        numberList.add(2);
        System.out.println(numberList);
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);
    }
}
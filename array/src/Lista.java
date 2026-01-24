import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Danilo");
        list.add("Ana");
        list.add("Alex");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        list.remove("Alex");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------");
        System.out.println("Index of Ana: " + list.indexOf("Ana"));
        System.out.println("Index of Danilo: " + list.indexOf("Danilo"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x : list) {
            System.out.println(x);
        }
    }
}

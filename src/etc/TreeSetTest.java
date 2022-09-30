package etc;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(Integer.parseInt("1"));
        ts.add(Integer.parseInt("3"));
        ts.add(Integer.parseInt("4"));
        ts.add(Integer.parseInt("-1"));
        ts.add(Integer.parseInt("-4"));

        System.out.println(ts.last());
        System.out.println(ts.first());

        String answer = ts.last() + " " + ts.first();
        System.out.println(answer);
    }
}

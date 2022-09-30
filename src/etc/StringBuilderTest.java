package etc;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "1111229399000";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.toString().length());
        System.out.println(sb.toString().contains("0"));

    }
}

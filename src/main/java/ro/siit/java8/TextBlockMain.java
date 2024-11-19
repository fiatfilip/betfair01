package ro.siit.java8;

public class TextBlockMain {
    public static void main(String[] args) {
        String block =
                "  Line 1\n" +
                "    " + "Line 2\n" +
                "  " + "  Line 3";
        System.out.println(block);
        String block2 = """
          Line 1
            Line 2
          Line 3
        """;
        System.out.println(block2);
    }
}

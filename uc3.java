public class UC4ArrayLoops {

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*     ","   *"),
            String.join(" ", "*****", "*****", "*    ", "*****")
        };

        // Loop use karke print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
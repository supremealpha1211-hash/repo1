public class BannerAppUC5 {

    public static void main(String[] args) {

        String text = "JAVA";

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", "                            ", "*"),
                String.join("", "*", "                            ", "*"),
                String.join("", "*", "        ", text, "            ", "*"),
                String.join("", "*", "                            ", "*"),
                String.join("", "*", "                            ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*",
                                   "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };\n
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
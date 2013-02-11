public class ExcelNumbers {
    public static void main(String[] args) {
        System.out.println(convert("XWA"));
    }

    private static int convert(String s) {
        if (s.isEmpty())
            return 0;
        int num = s.charAt(0) - 'A' + 1;
        if (s.length() > 1)
            return num * 26 + convert(s.substring(1));
        return num;
    }
}

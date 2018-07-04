package testingjava;

public class FormatNo16 {
    private static String format(String input) {
        String output = "";
        for (int i = 1; i < input.length(); i++) {
            for (int j = 0; j < Character.getNumericValue(input.charAt(i)); j++) {
                output += input.charAt(i - 1);
            }
            i++;
        }

        return output;
    }

    private static String formatString(String input) {
        input += " ";
        String output = "";
        char ch;
        int point = 0, cnt = 0;
        while (point != input.length() - 1) {
            ch = input.charAt(point);
            if (ch == ' ')
                break;
            for (int i = point; i < input.length(); i++) {
                if (ch == input.charAt(i)) {
                    cnt++;
                } else {
                    output += ch;
                    output += cnt;
                    cnt = 0;
                    point = i;
                    break;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "a5b4c2d3";
        String output = format(input);
        System.out.println(output);
        String in = "aaaaabbbccccddeeeeff";
        output = formatString(in);
        System.out.println(output);

    }
}

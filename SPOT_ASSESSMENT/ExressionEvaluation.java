import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class ExressionEvaluation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Expression = scan.nextLine();
        checkExpression(Expression);
    }

    private static void checkExpression(String S) {
        S = S.toLowerCase();
        int para = 0, flag = 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                para++;
            if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                if (S.charAt(i + 1) > 36 && S.charAt(i + 1) < 48)
                    continue;
                else
                    flag = 0;
            }
            if (S.charAt(i) == ')')
                para--;

        }

        if (para == 0 && flag == 1)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}

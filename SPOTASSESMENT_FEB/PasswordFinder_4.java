
import java.util.*;

public class PasswordFinder_4 {

    public static void main(String[] args) {
        PasswordFinder_4 obj = new PasswordFinder_4();
        Scanner scanner = new Scanner(System.in);

        System.out.println("No. of test cases : ");
        int sub = scanner.nextInt();

        for (int i = 0; i < sub; i++) {
            System.out.println("No. of Users :");
            int users = scanner.nextInt();

            System.out.println("Users Passwords : ");
            List<String> userPasswords = new ArrayList<>();
            for (int j = 0; j < users; j++)
                userPasswords.add(scanner.next());

            System.out.println("Login Attempt :");
            String loginAttempt = scanner.next();

            obj.findPassword(userPasswords, loginAttempt, loginAttempt.length());
        }
        scanner.close();

    }

    public void findPassword(List<String> list, String s, int len) {
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        String ans = "";
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (dp[j] && list.contains(sub)) {
                    dp[i] = true;
                    ans += sub + " ";
                }
            }
        }
        if (dp[len])
            System.out.println(ans);
        else
            System.out.println("WRONG PASSWORD");
    }
}
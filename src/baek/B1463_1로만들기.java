package baek;

import java.util.Scanner;

public class B1463_1로만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N+1];

        for(int i = 2; i <= N; i++){
            int min = Integer.MAX_VALUE;
            if(i % 3 == 0) {
                min = dp[i / 3] + 1;
            }
            if(i % 2 == 0 && dp[i/2] < min) {
                min = dp[i / 2] + 1;
            }
            if(dp[i-1] < min) {
                min = dp[i - 1] + 1;
            }
            dp[i] = min;
        }
        System.out.println(dp[N]);
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            String[] xy = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(xy[0]);
            arr[i][1] = Integer.parseInt(xy[1]);
        }

        Arrays.sort(arr, (e1, e2) -> {
            return (e1[0] != e2[0]) ? e1[0] - e2[0] : e1[1] - e2[1];
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}

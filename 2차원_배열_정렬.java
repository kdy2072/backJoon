import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] dots = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            dots[i][0] = Integer.parseInt(st2.nextToken());
            dots[i][1] = Integer.parseInt(st2.nextToken());
        }


        Arrays.sort(dots, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(dots[i][0] + " " + dots[i][1] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
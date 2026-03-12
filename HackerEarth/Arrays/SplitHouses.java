package HackerEarth.Arrays;

import java.io.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        if(s.contains("HH")) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

        s = s.replace('.', 'B');
        System.out.println(s);
    }
}
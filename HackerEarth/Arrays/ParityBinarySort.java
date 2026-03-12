package HackerEarth.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0)
        {
            int N = Integer.parseInt(br.readLine());

            String[] input = br.readLine().split(" ");

            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            for(int i = 0; i < N; i++)
            {
                int num = Integer.parseInt(input[i]);

                int setBits = Integer.bitCount(num);

                if(setBits % 2 == 0)
                    even.add(num);
                else
                    odd.add(num);
            }

            Collections.sort(even);
            Collections.sort(odd);

            for(int x : even)
                System.out.print(x + " ");

            for(int x : odd)
                System.out.print(x + " ");

            System.out.println();
        }
    }
}

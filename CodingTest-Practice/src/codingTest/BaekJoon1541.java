package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1541 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE;	
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
		 
		while (sub.hasMoreTokens()) {
			int temp = 0;
			StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
					
			while (add.hasMoreTokens()) {
				temp += Integer.parseInt(add.nextToken());
			}
					
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);

	}

}

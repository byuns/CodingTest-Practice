package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FuseExam {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		float computer = Float.parseFloat(st.nextToken())*2.5f;
		float printer = Float.parseFloat(st.nextToken())*2;
		float router = Float.parseFloat(st.nextToken()) * 0.5f;
		
		float total = computer + printer + router;
		int answer = (int)Math.ceil((total * 2) / 10) * 10;
		System.out.println(answer + " amperes");


	}

}
/*
 
 프로그램 명: fuse(open)
제한시간: 1 초
대부분의 사람들은 연구실에 있는 모든 컴퓨터를 가동하면 얼마 만큼의 전기가 소비되는지 를 인식하지 못한다.
퓨즈가 견딜수 있는 한도를 초과하면 퓨즈가 쉽게 녹을수 도 있다.
전기가 얼마나 필요한 지를 계산하는 것은 쉬운 작업이지만 계속 반복하는 것은 아주 따분한 일이다. 이를 계산하는 일을 도와 주는 것이 일이다.
다음은 각 기기가 소비하는 전기량이다.
•	본체 한대가 소비하는 전류 1.5 amperes
•	모니터 한대가 소비하는 전류 1.0 amperes
•	프린터 한대가 소비하는 전류 2.0 amperes
•	라우터 한대가 소비하는 전류 0.5 amperes
컴퓨터 한대에 하나의 모니터가 있다.
퓨즈는 각 모든 소비 전기의 최소 두 배를 견딜수 있는 것으로 준비해야 한다. 그리고 퓨즈의 용량은 10 , 20 , 30 , ... 10 의 배수 단위로 사용된다.
입력
입력은 세 개의 음이 아닌 정수가 주어진다. 차례대로 컴퓨터 , 프린터 , 라우터의 수이다. 반드시 컴퓨터의 수보다 다른 기기의 수가 적을 필요는 없다.(실험실이니)
모든 수는 100 이하이다.
출력
최소 퓨즈의 용량을 출력 예의 형식으로 출력한다.
입출력 예
입력

10 2 1

출력

60 amperes

입력

5 4 0

출력

50 amperes
입출력 보충
첫 번째 입출력 예에서
•	컴퓨터의 수가 10 이니 본체의 수와 모니터의 수는 각 10 대 ...(1.5 + 1.0)* 10 = 25
•	프린터 2 대 ... 2.0 * 2 = 4.0
•	라우터 1 대 ... 0.5
총 전류의 합 25 + 4.0 + 0.5 = 29.5
퓨즈는 2 배이상이고 10 의 배수단위의 용량을 사용해야 하므로 29.5 * 2 = 59 ---> 60
출처: cs.utah.edu

 */ 

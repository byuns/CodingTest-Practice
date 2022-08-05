package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CociNote {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		List<Integer> list = new ArrayList<>();
		for(int i=0; i<8; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			list.add(tmp);
		}
		
		int count = 0;
		for(int i=0; i<list.size()-1;i++) {
			if(list.get(i) < list.get(i+1)) {
				count++;
			}else {
				count--;
			}
		}
		
		if(count == list.size()-1) {
			System.out.println("ascending");
		}else if(count == (list.size()-1)*(-1)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}

/*
 프로그램 명: coci_note
제한시간: 1 초
C 장조의 음계는 8 개로 나타내어진다(c d e f g a h C). 이를 1 에서 숫자 8 로 약속을 한다.
1 에서 8 까지의 수가 임의의 순서로 한 번 나오는 수열이 주어질 때 이 수열이 오름차순(ascending)인지 내림차순(descending)인지 아니면 섞여(mix) 있는지 를 알아내는 문제이다.
입력
1 에서 8 까지의 수가 임의의 순서로 한 번 나타난다.
출력
ascending , descending , mixed 중 하나를 출력한다.
입출력 예
입력

1 2 3 4 5 6 7 8

출력

ascending

입력

8 7 6 5 4 3 2 1

출력

descending

입력

8 1 7 2 6 3 5 4

출력

mixed
출처: coci 2009/2010 contest1 1/6

 */

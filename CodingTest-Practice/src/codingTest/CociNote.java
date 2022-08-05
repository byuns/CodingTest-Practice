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
 ���α׷� ��: coci_note
���ѽð�: 1 ��
C ������ ����� 8 ���� ��Ÿ��������(c d e f g a h C). �̸� 1 ���� ���� 8 �� ����� �Ѵ�.
1 ���� 8 ������ ���� ������ ������ �� �� ������ ������ �־��� �� �� ������ ��������(ascending)���� ��������(descending)���� �ƴϸ� ����(mix) �ִ��� �� �˾Ƴ��� �����̴�.
�Է�
1 ���� 8 ������ ���� ������ ������ �� �� ��Ÿ����.
���
ascending , descending , mixed �� �ϳ��� ����Ѵ�.
����� ��
�Է�

1 2 3 4 5 6 7 8

���

ascending

�Է�

8 7 6 5 4 3 2 1

���

descending

�Է�

8 1 7 2 6 3 5 4

���

mixed
��ó: coci 2009/2010 contest1 1/6

 */

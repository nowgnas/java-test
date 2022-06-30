package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class prob1_두개의숫자열 {
//	https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PpoFaAS4DFAUq&categoryId=AV5PpoFaAS4DFAUq&categoryType=CODE&problemTitle=1959&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 1 5 3
		// 1 6 -7 5 4
		// 자유롭게 움직여 숫자들이 서로 마주보는 위치를 변경 가능
		// 1 5 3
		// 3 6 -7 5 4
		// 와 같은 정렬일 경우 최댓값이 된다

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(buffer.readLine());
		for (int index = 0; index < n; index++) {
			String input = buffer.readLine();
			String[] array = input.split(" ");
			System.out.println(input);

		}

	}

}

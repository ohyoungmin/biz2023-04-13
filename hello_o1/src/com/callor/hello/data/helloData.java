package com.callor.data;

public class helloData {
	public static void main(String[] args) {
		System.out.println("HELLO Korea");
		System.out.println("HELLO" + "korea");
		System.out.println("HELLO    Korea");
		System.out.println("HELLO" + "Korea");

		System.out.println(40 + 30);
		System.out.println("40" + "30");
		System.out.println("30  + 40");

		System.out.println("30  + 40 = 70");
		System.out.println("30  + 40 = " + 30 + 40);

		// "30+40"+30을 연산하려고 시도
		// 이연산은 문자열 + 숫자 의 연산이다
		// 이럴때는 숫자 데이터인 30을 문자열30으로 바꿔버린다

		System.out.println("30 + 40 =" + (30 + 40));
		System.out.println();
		// 문자열은 + (연결 연산자)만 가능하다

	}
}
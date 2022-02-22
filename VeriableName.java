package java_day02;

public class VeriableName {
	// 프로젝트 이름은 앞에 영어 알파벳 대문자를 쓴다.(관용표현)
	// 패키지 이름은 전부 소문자로 쓴다.(관용표현)
	// 클래스 이름은 파에 알파벳 대문자를 쓴다.
	
	// 변수명 찾기
	// 카멜(camel) 방식
	int todayIsHappy = 0;  // 변수선언
	
	// 스네이크(snake) 방식
	int today_is_happy = 1;
	
	// 헝가리안 방식
	int intTodayIsHappy = 2;
	String strTodayIsHappy = "행복해";
	
	// 변수면 변수명 앞에 v_ 를, 함수면 함수명 앞에 f_ 를, 파라미터면 파라미터명 앞에 p_
	int v_todayIsHappy = 3;

	// 변수명 규칙
	// 공백문자 및 특수문자는 변수이름으로 사용 할 수 없다.
	// int todayishappy＠;
	// 영어 대소문자를 구분한다.
	int todayishappy = 5;
	// 숫자를 이름 제일앞에 쓰는건 허용하지 않음.
	// int 2todayIsHappy;
	
	// 글자 수의 제한은 없다.
	String nextItPhone = "042 - 751 - 8850";
	
	// 맨 앞에 $, _ 기호를 쓸 수 있다.
	int $todayIsHappy = 0;
	int _todayIsHappy = 0;
	
	// 자바 예약어 사용불가
	// int private = 4; 예약어를 변수이름(식별자)으로 사용 불가
}

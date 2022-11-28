// 문제 : 아래가 실행되도록 해주세요.

class Main {
	public static void main(String[] args) {
		전사 a전사 = new 전사();
	
		a전사.나이 = 20;
		a전사.a무기 = new 활();
		a전사.a무기 = new 칼();

		a전사.a무기.공격();
		
	}
}

class 전사 {
	int 나이;
	// 나이의 변수타입은 int 인데 위에서 20이라는 값을 넣어주었기때문이다
	무기 a무기;
	// a무기의 변수 타입은 무기이다
	// 활과 칼이 무기에게 상속되었기 때문이다
	// 활객체와 칼객체를 동시에 받을수 있는 것은 무기라는 객체이기 때문이다

}

class 무기 {
	// 활과 칼을 동시에 만족시킬수 있는 클래스를 만들어준다
	void 공격() {
		System.out.println("공격하다");
		//실행은 무기 클래스의 공격메서드만 실행된다
		//그이유는 아래의 클래스들은 상속 받았기에 무기인척을 하여 값을 버린다
	}
}

class 활 extends 무기 {
	void 쏘다() {
		System.out.println("쏘다");
	}
}

class 칼 extends 무기 {
	void 베다() {
		System.out.println("베다");
	}
}

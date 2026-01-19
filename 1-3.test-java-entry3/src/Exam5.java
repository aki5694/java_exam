public class Exam5 {

	public static void main(String[] args) {
		int answer1 = addition();
		System.out.println("足し算結果:"+answer1);
		int answer2 = subtraction();
		System.out.println("引き算結果:"+answer2);
		int answer3 = multiplication();
		System.out.println("掛け算結果"+answer3);
		int answer4 = division();
		System.out.println("割り算結果:"+answer4);
        int anser5 = remainder();
        System.out.println("余剰算結果:"+anser5);
	}

	static int addition() {
		int num1 =5;
		int num2 =3;
		return num1 + num2;
	}

	static int subtraction() {
		int num1 =5;
		int num2 =3;
		return num1 - num2;
	}

	static int multiplication() {
		int num1 =5;
		int num2 =3;
		return num1 * num2;
	}

	static int division() {
		int num1 =5;
		int num2 =3;
		return num1 / num2;
	}

    static int remainder() {
        int num1 =5;
        int num2 =3;
        return num1 % num2;
    }

}

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산 입력>>");
        double operand1 = scanner.nextDouble();  
        String operator = scanner.next();  
        double operand2 = scanner.nextDouble(); 

	if (operator.equals("더하기")) System.out.println(operand1 + " 더하기 " + 		operand2 + " = " + (operand1 + operand2));

	else if (operator.equals("빼기")) System.out.println(operand1 + " 빼기 " + 	operand2 + " = " + (operand1 – operand2));

	else if (operator.equals("곱하기")) System.out.println(operand1 + " 곱하기 " + 	operand2 + " = " + (operand1 * operand2));

	else if (operator.equals("나누기")) {
		if (operand2 == 0) System.out.println("0으로 나눌 수 없습니다.");
		else System.out.println(operand1 + " 나누기 " + operand2 + " = " + 		(operand1 / operand2));
	}

	else System.out.println("사칙연산이 아닙니다.");

        scanner.close();
    }
}
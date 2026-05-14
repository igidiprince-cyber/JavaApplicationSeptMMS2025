public class OperatorPart1{
	public static void main(String[] agrs){
		// Assignment operator(=)
		int num = 200;
		System.out.printf("The value of num is %d%n",num);
		
		//Arithimetic Operators(+,-,/,*,%)
		int num1 = 80;
		int num2 = 100;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		double division = (double) num1/num2;
		int multiplication = num1 * num2;
		int remainder = num1 % num2;
		
		System.out.printf("%d + %d = %d%n",num1,num2,addition);
		System.out.printf("%d - %d = %d%n",num1,num2,subtraction);
		System.out.printf("%d / %d = %.if%n",num1,num2,division);
		System.out.printf("%d * %d = %d%n",num1,num2,multiplication);
		System.out.println("");
		System.out.println("==========================");
		
		num1 += num2;
		System.out.printf("The value of num1 has changed to %d%n",compAddition);
		
	}
}	
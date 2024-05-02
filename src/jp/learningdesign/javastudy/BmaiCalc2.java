package jp.learningdesign.javastudy;
import java.util.Scanner;
public class BmaiCalc2 {
/*BMI（体格指数）を計算するプログラム
 * BMI = 体重　/ （身長　*身長）
 * 体重　kg、身長　cm
 */
	public static void main(String[] args) {
		double weight,height,bmi;
		
//		weight = 74;
//		height = 182;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？（kg）：");
		weight = stdIn.nextDouble();
		System.out.println("身長は？（cm）：");
		height = stdIn.nextDouble();
		
		height = height / 100; 
		//height/= 100;は同じ意味
		
		bmi = weight / (height * height);
		double after = Math.round(bmi);
		System.out.println((double)after);
		System.out.println("BMI:" + bmi + "です。");

	}

}
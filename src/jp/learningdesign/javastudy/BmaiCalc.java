package jp.learningdesign.javastudy;

public class BmaiCalc {
/*BMI（体格指数）を計算するプログラム
 * BMI = 体重　/ （身長　*身長）
 * 体重　kg、身長　m
 */
	public static void main(String[] args) {
		double weight,height,bmi;
		
		weight = 72;
		height = 1.8;
		bmi = weight / (height * height);
		
		System.out.println(bmi);

	}

}

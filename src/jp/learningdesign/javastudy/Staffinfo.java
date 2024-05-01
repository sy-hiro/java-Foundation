package jp.learningdesign.javastudy;

class Staff{
	String name;
	int staffid;
	String email;
	
	public void sayhello(){
		System.out.println("Hello " + this.name + " "+ this.email + " " + this.staffid);
	
	}
	public void sayinfo(){
		System.out.println(this.email + " " + this.staffid);
	}
}
public class Staffinfo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		yamada.email ="gmai";
		yamada.staffid =123;
		
		yamada.sayhello();
		yamada.sayinfo();
//		System.out.println(yamada.name);

	}

}

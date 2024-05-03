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
	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

class RemoteStaff extends Staff{
	public String location;
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
}
public class Staffinfo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff("Taro Yamada",123456,"yamada@abc.co.jp");
		RemoteStaff tanaka = new RemoteStaff("Hanako Tanaka",123456,"tanaka@.abc.jp");
		tanaka.location = "大阪";
//		yamada.name = "Taro Yamada";
//		yamada.email ="gmai";
//		yamada.staffid =123;
		
//		yamada.sayhello();
//		yamada.sayinfo();
		
		System.out.println("[社員情報]");
		System.out.println("氏名：　"+ yamada.getName());
		System.out.println("社員番号：　"+ yamada.getStaffid());
		System.out.println("Email：　"+ yamada.getEmail());
		
		System.out.println("[社員情報]");
		System.out.println("氏名：　"+ tanaka.getName());
		System.out.println("社員番号：　"+ tanaka.getStaffid());
		System.out.println("Email：　"+ tanaka.getEmail());
		System.out.println("勤務地：　"+ tanaka.location);


	}

}

package day1129;
/*
 * 1，定义抽象的门，
 * 有开门openDoor()和关门closeDoor()方法
   2，防盗--theftproof()、防水--waterproof()、防弹--bulletproof()三个接口
           继承门接口，分别有防盗，防水，防弹功能
   3，实现以上接口
   4，测试类

 */
import java.util.Scanner;

interface men1{
	abstract void Door();
	abstract void openDoor();
	abstract void closeDoor();
}
interface heftproof extends men1{
	abstract void fangdao();
}
interface waterproof extends men1{
	abstract void fangshui();
}
interface bulletproof extends men1{
	abstract void fangdan();
}
class cb implements men1,heftproof,waterproof,bulletproof{
	public void Door() {
		System.out.println("这是一扇门");
	}
	public void openDoor() {
		System.out.println("开门");
	}
	public void closeDoor() {
		System.out.println("关门");
	}
	public void fangdao() {
		Scanner p=new Scanner(System.in);
		System.out.println("请使用开门方法");
		String a=p.nextLine();
		if(a=="使用铁丝开锁") {
		System.out.println("开门失败");
		}
	}
	public void fangshui() {
		Scanner p=new Scanner(System.in);
		System.out.println("请使用开门方法");
		String b=p.nextLine();
		if(b=="提起加特林") {
		System.out.println("开门失败");
		}
	}
	public void fangdan() {
		Scanner p=new Scanner(System.in);
		System.out.println("请使用开门方法");
		String c=p.nextLine();
		if(c=="提起加特林") {
		System.out.println("开门失败");
		}
	
	}
}

public class men {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cb s=new cb();
		s.Door();
		s.closeDoor();
		s.openDoor();
		s.fangdao();
		s.fangshui();
		s.fangdan();

	}

}

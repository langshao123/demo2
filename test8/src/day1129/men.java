package day1129;
/*
 * 1�����������ţ�
 * �п���openDoor()�͹���closeDoor()����
   2������--theftproof()����ˮ--waterproof()������--bulletproof()�����ӿ�
           �̳��Žӿڣ��ֱ��з�������ˮ����������
   3��ʵ�����Ͻӿ�
   4��������

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
		System.out.println("����һ����");
	}
	public void openDoor() {
		System.out.println("����");
	}
	public void closeDoor() {
		System.out.println("����");
	}
	public void fangdao() {
		Scanner p=new Scanner(System.in);
		System.out.println("��ʹ�ÿ��ŷ���");
		String a=p.nextLine();
		if(a=="ʹ����˿����") {
		System.out.println("����ʧ��");
		}
	}
	public void fangshui() {
		Scanner p=new Scanner(System.in);
		System.out.println("��ʹ�ÿ��ŷ���");
		String b=p.nextLine();
		if(b=="���������") {
		System.out.println("����ʧ��");
		}
	}
	public void fangdan() {
		Scanner p=new Scanner(System.in);
		System.out.println("��ʹ�ÿ��ŷ���");
		String c=p.nextLine();
		if(c=="���������") {
		System.out.println("����ʧ��");
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

package shop;


import java.util.ArrayList;
import java.util.Scanner;


public class Array implements IArray {

	public  void help() {
		System.out.println("---������ϵͳ---");
		System.out.println("1   ������Ʒ");
		System.out.println("2   ����");
		System.out.println("3   ����");
		System.out.println("4   �ο����");
		System.out.println("5   �˳�����");
		
	}
	
	public void addShop(ArrayList<Shop> arrayList, Scanner sc) {
		String s= sc.next();
		String[] sp= s.split(",");
		if (sp.length!=4) {
			System.out.println("����ĸ�ʽ����");
		}else{
			Shop shop=new Shop(sp[0], sp[1], Double.parseDouble(sp[2]),new Integer(sp[3]));
			arrayList.add(shop);
			System.out.println(shop.toString());
		}

	}

	
	public void stockShop(ArrayList<Shop> arrayList, Scanner sc) {
		System.out.println("��������Ʒ���");
		String a = sc.next();
		boolean isnull =false;
		for (Shop shop : arrayList) {
			if (shop.getId().equals(a)) {	
			System.out.println("�������������");
			int b=sc.nextInt();
			shop.setNumber(shop.getNumber()+b);
			System.out.println("�����ɹ�������Ʒ���ӵ�"+shop.getNumber());
			isnull =true;
			break;
		}else{
			isnull=false;
		}
		}
		if (!isnull) {
			System.out.println("����ʧ��");
		}
}

	
	

	public void sellShop(ArrayList<Shop> arrayList, Scanner sc) {
	System.out.println("�����������۵���Ʒ��ţ�");
	String string = sc.next();
	System.out.println("����������������");
	int b=sc.nextInt();
	boolean is=false;
	for (Shop shop : arrayList) {
	
	if (shop.getId().equals(string)) {
		is=true;
		if (shop.getNumber()>=b) {
			shop.setNumber(shop.getNumber()-b);
			System.out.println("���۳ɹ�������Ʒʣ��"+shop.getNumber());
		} else {
System.out.println("����ʧ��");
		}
		break;
	} 
	else{
		is=false;
	}
	
	}
if (!is) {
	System.out.println("�Ҳ�������Ʒ,����ʧ��");
}
	}

	
	public void infoShop(ArrayList<Shop> arrayList) {
		for (Shop shop : arrayList) {
			System.out.println(shop.toString());
		}

	}
	
}

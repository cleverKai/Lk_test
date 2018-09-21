package com.hecdeu.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Operation {
	private static Scanner sc;
	public static void main(String[] args) {
		showMenu();
		List<Employee> list=new ArrayList<Employee>();//��ʼ��һ��Ա�����ϣ�
		while(true){
			System.out.print("��ѡ�������");
			sc=new Scanner(System.in);
			String item=sc.nextLine();
			switch (item) {
			case "1":
				add(list);   //����
				break;
			case "2":
				remove(list);//ɾ��
				break;
			case "3":
				update(list);  //�޸�
				break;		
			case "4":
				select(list);//����
				break;
			case "5":		
				showAll(list);	//���
				break;
			case "0":
				System.out.println("\t�˳��ɹ���");
				System.exit(0);
			default:
				System.out.println("�������������ѡ��");
				break;
			}
		}
		
	}
	
	//��ѯ ���� ��
	
	private static void select(List<Employee> list) {
		System.out.println("\t����ѯԱ����");
		System.out.print("\t���������ѯ���ţ�");
		String id=sc.nextLine();
		int index=0;
		boolean bool=false;
		for (Object object : list) { 
			Employee emp=(Employee)object;
			if(Integer.parseInt(id)==emp.getId()){
				index=list.indexOf(emp);
				bool=true;
				System.out.println("\t���Ժ�...");
				System.out.println("\t"+emp.getId()+"\t"+emp.getName()+"t"+emp.getAge()+"\t"+emp.getEmail()+"\t"+emp.getAddress());
			}
		}
		if(bool) {
			System.out.println("\t��ѯ�ɹ���");
			
		} else{
			System.out.println("\t��������ȷ�Ĺ��ţ�");
		}
	}
 
	//ɾ�� Ա������  ��
	private static void remove(List<Employee> list) {
		System.out.println("\t��ɾ��Ա����");
		System.out.print("\t������ԭ�����ţ�");//����Ա����Ž���ɾ��Ա����Ϣ
		String oldId=sc.nextLine();
/*		//System.out.print(id);
		System.out.print("\t������ԭ��������");//Ҳ����Ա��������ɾ��Ա����Ϣ
*/
		int index=0;
		boolean bool=false;
		for (Object object : list) { 
			Employee emp=(Employee)object;
			if(Integer.parseInt(oldId)==emp.getId()){
				index=list.indexOf(emp);
				bool=true;
			}
		}
		if(bool) {
			list.remove(index);
			System.out.println("\tɾ���ɹ���");
		} else{
			System.out.println("\t��������ȷ�Ĺ��ţ�");
		}
	}
	
	// ���Ա������
	private static void showAll(List<Employee> list) {
		System.out.println("\t����\t����\t����\t����\t\t��ַ");
		for (Object object : list) {
			Employee emp=(Employee)object;
			System.out.println("\t"+emp.getId()+"\t"+emp.getName()+"\t"+emp.getAge()+"\t"+emp.getEmail()+"\t"+emp.getAddress());
		}
	}
	
	// ���� Ա������ ��
	private static void add(List<Employee> list) {
		System.out.println("\t������Ա����");
		System.out.print("\t������Ա���ţ�");
		String id=sc.nextLine();
		System.out.print("\t����������:");
		String name=sc.nextLine();
		System.out.print("\t����������:");
		String age =sc.nextLine();
		System.out.print("\t����������:");
		String email=sc.nextLine();
		System.out.print("\t�������ַ:");
		String address=sc.nextLine();
		list.add(new Employee(Integer.parseInt(id),name,Integer.parseInt(age) ,email,address));//����Ա����Ϣ
		System.out.println("\t���ӳɹ���");
	}
	
	//  �޸�Ա�� ����  
	private static void update(List<Employee> list) {
		System.out.println("\t���޸�Ա����");
		System.out.print("\t������ԭ��Ա���ţ�");
		String oldId=sc.nextLine();
		int index=0;
		boolean bool=false;
		for (Object object : list) { 
			Employee emp=(Employee)object;
			if(Integer.parseInt(oldId)==emp.getId()){
				index=list.indexOf(emp);
				System.out.println("\t���Ժ�..."); 
				bool=true;    // ��֤ Ա���š�
			}
		}
		if(bool) {
			System.out.print("\t�������µ�Ա���ţ�");
			String id=sc.nextLine();
			System.out.print("\t�������µ�������");
			String name=sc.nextLine();
			System.out.print("\t�������µ����䣺");
			String age=sc.nextLine();
			System.out.print("\t�������µ����䣺");
			String email=sc.nextLine();
			System.out.print("\t�������µĵ�ַ��");
			String address=sc.nextLine();
			list.set(index,new Employee(Integer.parseInt(id),name,Integer.parseInt(age),email,address));
			System.out.println("\t�޸ĳɹ���");
		} else {
			System.out.println("\t��������ȷ��Ա���ţ�");
		}
	}
	public static void showMenu() {
		System.out.println("========================");
		System.out.println("��ӭʹ��Ա������ϵͳ");
		System.out.println("========================");
		System.out.println("�����б�:");
		System.out.println("��1������Ա����Ϣ");
		System.out.println("��2��ɾ��Ա����Ϣ");
		System.out.println("��3���޸�Ա����Ϣ");
		System.out.println("��4����ѯԱ����Ϣ");
		System.out.println("��5�����Ա����Ϣ");
		System.out.println("��0���˳�ϵͳ");
		System.out.println("========================");
		
	}

	}


package test;
import java.util.*;
public class InToEng {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));
	}

	//���l���p�󂷂�ϊ����郁�\�b�h
	static String translateEng(int n){

		//0~9�����͂��ꂽ��String�̒��̕������������
		String[] a ={"zero","one","two","three","four","five","six","seven","eight","nine"};
		return a[n];

		//�ǂݍ��񂾐��l���P�̈ʂ���ꌅ���z��ɓ���Ă�
/*
		int a[]=new int[10];
		for(int i=0;n/10>0;i++)
			a[i]=n%10;
		String c ="";
		return c;
		*/
	}
}

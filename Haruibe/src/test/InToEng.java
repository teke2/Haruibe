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
		String[] s1 ={"","one","two","three","four","five","six","seven","eight","nine"};
		String[] s2 ={"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] s3 ={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		//�ǂݍ��񂾐��l�̌��������߂�
		int y=n;
		int x=n;
		int count=0;
		while(y>0){
			y/=10;
			count++;
		}
		//�ǂݍ��񂾐��l���P�̈ʂ���ꌅ���z��ɓ����
		int a[]=new int[count];
		for(int i=0;n>0;i++){
			a[i]=n%10;
			n=n/10;
		}
		if(x==0) return "zero";
		//if(a.length==1&&a[0]==0) return "zero";
		String str="";
		//�R�����Ƃɓ����悤�ȍ�Ƃ��J��Ԃ�����,12,000��12��1000�̂Ƃ������悤�Ȋ�����
		if(a.length>2) str += s1[a[2]]+" hundred ";
		if(a.length>1 && a[1]==1){str +=s2[a[0]]; return str;}
			else if(a.length>1) str +=s3[a[1]]+" ";
		//�����񂪋󂾂�����0�Ԃ�
		str+=s1[a[0]];

		return str;

	}
}

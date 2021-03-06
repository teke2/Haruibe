package test;
import java.util.*;
public class InToEng {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));
	}

	//数値を英訳する変換するメソッド
	static String translateEng(int n){
		//読み込んだ数値の桁数を求める
		int y=n;
		//元々の数値が0だったらzeroを返す
		if(n==0) return "zero";
		int count=0;
		while(y>0){
			y/=10;
			count++;
		}
		//読み込んだ数値を１の位から一桁ずつ配列に入れる
		int a[]=new int[count];
		for(int i=0;n>0;i++){
			a[i]=n%10;
			n=n/10;
		}

		String str="";
		if((a.length-1)/3==2){
			str += xyz(a,2) + " million ";
			str += xyz(a,1) + " thousand ";
			str += xyz(a,0);
		}
		else if((a.length-1)/3==1){
			str += xyz(a,1) + " thousand ";
			str += xyz(a,0);
		}
		//一つのif文で一個だけxyzを使うようにしたかった
		else if((a.length-1)/3==0)
			str += xyz(a,0);

		return str;
	}
	 //３桁ごとに同じような作業を繰り返したい,12,000は12個の1000のといったような感じで
	static String xyz(int[] b,int c){
		String str="";
		//0~9が入力されたらStringの中の文字列をかえす
		String[] s1 ={"","one","two","three","four","five","six","seven","eight","nine"};
		String[] s2 ={"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] s3 ={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

		if(b.length>(2+3*c)) str += s1[b[2+3*c]]+" hundred ";
		if(b.length>(1+3*c) && b[1+3*c]==1) {str +=s2[b[0+3*c]]; return str;}
		else if(b.length>(1+3*c)) str +=s3[b[1+3*c]]+" ";
		str+=s1[b[0+3*c]];
		return str;
	}	
}
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
/*
		//0~9が入力されたらStringの中の文字列をかえす

		return a[n];
*/
		String[] s1 ={"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] s2 ={"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		//読み込んだ数値の桁数を求める
		int y=n;
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
		if(a.length>1 && a[1]==1) System.out.print(s2[a[0]]);
		else for(int i=a.length-1;i>=0;i--)
			System.out.print(s1[a[i]]+" ");
		String c ="";
		return c;
		
	}
}

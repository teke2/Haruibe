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

		//0~9が入力されたらStringの中の文字列をかえす
		String[] a ={"zero","one","two","three","four","five","six","seven","eight","nine"};
		return a[n];

		//読み込んだ数値を１の位から一桁ずつ配列に入れてる
/*
		int a[]=new int[10];
		for(int i=0;n/10>0;i++)
			a[i]=n%10;
		String c ="";
		return c;
		*/
	}
}

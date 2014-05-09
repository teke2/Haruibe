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
		String[] s1 ={"","one","two","three","four","five","six","seven","eight","nine"};
		String[] s2 ={"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] s3 ={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		//読み込んだ数値の桁数を求める
		int y=n;
		int x=n;
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
		if(x==0) return "zero";
		//if(a.length==1&&a[0]==0) return "zero";
		String str="";
		//３桁ごとに同じような作業を繰り返したい,12,000は12個の1000のといったような感じで
		if(a.length>2) str += s1[a[2]]+" hundred ";
		if(a.length>1 && a[1]==1){str +=s2[a[0]]; return str;}
			else if(a.length>1) str +=s3[a[1]]+" ";
		//文字列が空だったら0返す
		str+=s1[a[0]];
		return str;
	}
}

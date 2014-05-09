package test;
import java.util.*;
public class InToEng {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));
	}

	//”’l‚ð‰p–ó‚·‚é•ÏŠ·‚·‚éƒƒ\ƒbƒh
	static String translateEng(int n){
		//0~9‚ª“ü—Í‚³‚ê‚½‚çString‚Ì’†‚Ì•¶Žš—ñ‚ð‚©‚¦‚·
		String[] s1 ={"","one","two","three","four","five","six","seven","eight","nine"};
		String[] s2 ={"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] s3 ={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		//“Ç‚Ýž‚ñ‚¾”’l‚ÌŒ…”‚ð‹‚ß‚é
		int y=n;
		int x=n;
		int count=0;
		while(y>0){
			y/=10;
			count++;
		}
		//“Ç‚Ýž‚ñ‚¾”’l‚ð‚P‚ÌˆÊ‚©‚çˆêŒ…‚¸‚Â”z—ñ‚É“ü‚ê‚é
		int a[]=new int[count];
		for(int i=0;n>0;i++){
			a[i]=n%10;
			n=n/10;
		}
		if(x==0) return "zero";
		//if(a.length==1&&a[0]==0) return "zero";
		String str="";
		//‚RŒ…‚²‚Æ‚É“¯‚¶‚æ‚¤‚Èì‹Æ‚ðŒJ‚è•Ô‚µ‚½‚¢,12,000‚Í12ŒÂ‚Ì1000‚Ì‚Æ‚¢‚Á‚½‚æ‚¤‚ÈŠ´‚¶‚Å
		if(a.length>2) str += s1[a[2]]+" hundred ";
		if(a.length>1 && a[1]==1){str +=s2[a[0]]; return str;}
			else if(a.length>1) str +=s3[a[1]]+" ";
		//•¶Žš—ñ‚ª‹ó‚¾‚Á‚½‚ç0•Ô‚·
		str+=s1[a[0]];

		return str;

	}
}

package test;
import java.util.*;
public class InToEng {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));
	}

	//”’l‚ğ‰p–ó‚·‚é•ÏŠ·‚·‚éƒƒ\ƒbƒh
	static String translateEng(int n){

	
		//“Ç‚İ‚ñ‚¾”’l‚ÌŒ…”‚ğ‹‚ß‚é

		int y=n;
		//Œ³X‚Ì”’l‚ª0‚¾‚Á‚½‚çzero‚ğ•Ô‚·
		if(n==0) return "zero";
		int count=0;
		while(y>0){
			y/=10;
			count++;
		}
		//“Ç‚İ‚ñ‚¾”’l‚ğ‚P‚ÌˆÊ‚©‚çˆêŒ…‚¸‚Â”z—ñ‚É“ü‚ê‚é
		int a[]=new int[count];
		for(int i=0;n>0;i++){
			a[i]=n%10;
			n=n/10;
		}
		String str="";
		if((a.length-1)/3==1){
			str += xyz(a,1) + " thousand ";
			str += xyz(a,0);
		}
		if((a.length-1)/3==0)
			str += xyz(a,0);
		

		return str;
	}
	 //‚RŒ…‚²‚Æ‚É“¯‚¶‚æ‚¤‚Èì‹Æ‚ğŒJ‚è•Ô‚µ‚½‚¢,12,000‚Í12ŒÂ‚Ì1000‚Ì‚Æ‚¢‚Á‚½‚æ‚¤‚ÈŠ´‚¶‚Å
	static String xyz(int[] b,int c){
		String str="";
		//0~9‚ª“ü—Í‚³‚ê‚½‚çString‚Ì’†‚Ì•¶š—ñ‚ğ‚©‚¦‚·
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

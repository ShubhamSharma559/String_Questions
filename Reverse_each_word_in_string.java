public class Main
{
	public static void main(String[] args) {
		String str = "hello bro how are you";
		String s = "";
		String a = "";
		
		for(int i = 0;i<str.length();i++){
		    char c = str.charAt(i);
		    
		    if(c != ' '){
		        a = c+a;
		    }
		    else{
		        a = a+' ';
		        s = s+a;
		        a = "";
		    }
		}
		a = a+' ';
		s = s+a;

		System.out.println(s);
	}
}

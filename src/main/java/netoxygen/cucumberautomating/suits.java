package netoxygen.cucumberautomating;

public class suits {

	public static void main(String[] args) {
		String str="suits";
		char rev = 0;
		String res=" ";

		for(int i=str.length()-1 ; i>=0 ; i--) 
		{
			rev=str.charAt(i);
			res=res+rev;
			
		}
		
		System.out.print(res);

	}

}

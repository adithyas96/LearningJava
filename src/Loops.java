
public class Loops {
	
	public static void main1(String[] args) {
		boolean flag;
		for(int i=2; i<=50;i++ ){
			flag=true;
			
			for(int j=2; j<=i/2 ; j++){
				
				if(i%j==0)
					flag=false;
			}
			if(flag)
				System.out.println(i);
		}
	}
}


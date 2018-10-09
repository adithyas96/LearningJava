
public class OperatorDemo {

	public static void main(String[] args) {
		int i,j=0;
		i=5679;
		while(i>0){
			j=(j*10)+(i%10);
			i=i/10;
			System.out.println(j);
		}
		System.out.println(j);
	}
}

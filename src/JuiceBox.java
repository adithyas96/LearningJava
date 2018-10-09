
import java.util.Date;


public class JuiceBox {
	final String brand;
	String type;
	double volume;
	private double price;
	Date mfd;
	Date exprdate;
	boolean opened;{ opened = false;}
	
	public void isExpired(){
		Date date = new Date();

		if(date.before(exprdate)){
			System.out.println("Juice Box is expired");
		}
		else 
			System.out.println("Juice Box is still consumable");
	}
	public void isEmpty(){
		if(volume==0.0){
			System.out.println("The Juice Box is empty");
		}
		else
			System.out.println("There is still content inside");
	}
	public void isUsed(){
		if(opened){
			System.out.println("Juice Box is sealed");
		}
		else 
			System.out.println("Juice Box has been tampered with");
	}
	
	public JuiceBox(String a, String b, double c, double d, Date e, Date f, boolean g){
		brand = a;
		type = b; 
		volume = c;
		price = d;
		mfd = e;
		exprdate = f;
		opened = g;
	}
	
	public double getPrice(){
		return price;
	}
	public double setPrice(double p){
		price = p;
		return price;
	}
	
	public void getInfo(){
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
		System.out.println("Volume: " + volume);
		System.out.println("Price: " + price);
		System.out.println("Date of Manufacture: " + mfd);
		System.out.println("Date of Expiry: " + exprdate);
		System.out.println("Tampered: " + opened);
	}
	
}

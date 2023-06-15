package oOps;

class RBI{
	public int rateofintrest() {
		return 0;
	}
	}
class SBI extends RBI{
	public int rateofintrest() {
	 return 1;
	}
	}
class ICICI extends RBI{
	public int rateofintrest() {
		return 3;
			
		}
}
public class Eg2 {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println(sbi.rateofintrest());
		
		ICICI icici = new ICICI();
		System.out.println(icici.rateofintrest());
		
	}
}
	
	




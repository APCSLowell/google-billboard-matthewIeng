public String digits = "0";
public double nums = 0;

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	for(int i = 2; i < (e.length() - 10); i++) {
    digits = e.substring(i, i+10);
    nums = Double.parseDouble(digits);
    if(isPrime(nums) == true) {
    break;
    }
  }
	public static void main(final String[] args) {
		
		System.out.println(nums); }
    }
	}
	

	//Finish this function
	public static boolean isPrime(double d){
	for(int j = 2; j <= Math.sqrt(d); j++) {
      if(d % j == 0 ){
      return false;
    }
  }
  return true;

}


package in.venkatesh;

public class loginPage {
	public static boolean loginValidation(Long mobNo,String password) {
		boolean result;
		if (mobNo == 9790430272l && password=="ragul") {
			result = true;
		} 
		else 
		{
			result = false;
		}
		
		return result;
	}
}

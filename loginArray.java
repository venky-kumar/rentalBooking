package in.venkatesh;

import java.util.ArrayList;

public class loginArray {
	public static long arraylogin(){
		ArrayList<Detail> userDetail = new ArrayList<Detail>();
		Detail user1 = new Detail();
			user1.usermobileNO = 9790430272L;
			user1.password = "ragul";
			
			Detail user2 = new Detail();	
			user2.usermobileNO = 9865739455L;
			user2.password = "gunal";
			userDetail.add(user1);
			userDetail.add(user2);
			
			for (Detail user : userDetail)
			{
				System.out.println(user.usermobileNO + "-"  + user.password);
			}
			return 0;
	}
	
}

	

	
	


package org.devops.ass2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//This is the basics of the performance test that i have gotten written down.
// The idea is to test the function repeatedly 


@RunWith(Parameterized.class)
public class FriendsPerformanceTest {


	    @Parameterized.Parameters
	    public static Object[][] data() {
	        return new Object[10][0];
	    }

	    public void RunTenTimes() {
	    	String link = "https://www.facebook.com/valid-link";
	   		FacebookFriends.facebookFriends(link);
	    }

	    @Test
	    public void runsTenTimes() {
	        System.out.println("run");
	    }
	
	
 

}
package jp.te4a.spring.boot.myapp1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    	
    }
    
    @Test
    public void test_hello()
    {
	    String greeting = "Hello, Spring Boot!";
    	HelloController hellocontroller = new HelloController();
		String actual =  hellocontroller.index();
	    assertEquals(greeting,actual);
    }
    
    
}

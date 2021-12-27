package tw.org.iii.cma;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

@SpringBootTest
class LabbootJspApplicationTests {
	@Test
	void contextLoads() {
	}
	
	@Autowired
	private MessageSource messageSource;
	
	@Test
	public void testMessageSource() {
		String mess1 = messageSource.getMessage(
				"login.username.required", null, Locale.TAIWAN);
		System.out.println("mess1="+mess1);
	}
}

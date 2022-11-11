package test.com.twitter.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.com.twitter.util.EncodeDecode;

class UtilTest {

	@Test
	void test() {
		String pass="root";
		String enco="cm9vdA==";
		
		pass=EncodeDecode.encode(pass);
		assertEquals(pass,enco);
	}

}

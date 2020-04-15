package cn.tedu.sp04;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test1 {

	@Test
	public void t() {
		Integer a=100;	
		Integer b=150;
		Integer c=b-50;
		System.out.println(c==a);
	}
}

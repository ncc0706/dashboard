package com.xlinyu.util;

import org.junit.Test;

public class JwtUtilTest {

	@Test
	public void test() throws Exception {
		String jwt = JwtUtil.createJWT("u001", "admin", 120L);
	
		System.out.println(jwt);
	
//		String str = JwtUtil.parseJWT(jwt).toString();
	}

}
package com.sqa.sb.auto;


public abstract class AbstractLoginTest extends BasicTest {

	public AbstractLoginTest(String baseUrl) {
		super(baseUrl);
	}

	abstract public void login(String username, String password) throws InterruptedException;

	abstract public void logout();
}

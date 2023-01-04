package org.test;

import org.junit.Test;

public class Ass extends BaseClass{
@Test
private void tc2() {
	launchUrl("https://www.facebook.com/");
LoginPojo l = new LoginPojo();
click webElement(l.getAccBtn());
}
}

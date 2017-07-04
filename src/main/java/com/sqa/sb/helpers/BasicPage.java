package com.sqa.sb.helpers;

import org.openqa.selenium.support.*;

import com.sqa.sb.adactin.*;
import com.sqa.sb.auto.*;

public class BasicPage extends Core {

	public BasicPage(BasicTest test) {
		super(test);
		PageFactory.initElements(getDriver(), this);
	}
}

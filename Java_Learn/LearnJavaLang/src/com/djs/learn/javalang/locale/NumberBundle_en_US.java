
package com.djs.learn.javalang.locale;

import java.util.ListResourceBundle;

public class NumberBundle_en_US extends ListResourceBundle
{
	@Override
	public Object[][] getContents(){
		return contents;
	}

	static final Object[][] contents = {{"A", new Integer(12300)}, {"B", new Float(0.123)}};
}

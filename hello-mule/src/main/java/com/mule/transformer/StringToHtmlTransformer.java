package com.mule.transformer;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class StringToHtmlTransformer extends AbstractTransformer{

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		String content = src.toString();
		return content;
	}

}

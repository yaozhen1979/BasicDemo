package com.tw.dom4j;

import static java.lang.System.*;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DemoOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("xml","bookstore.xml"));
		Element root = doc.getRootElement();
		parse(root);
	}

	private static void parse(Element ele) {
		// TODO Auto-generated method stub
		parseAttribute(ele);
		List el = ele.elements();
		for (Object obj : el) {
			Element element = (Element)obj;
			if (!element.isTextOnly()) {
				parse(element);
			} else {
				parseAttribute(element);
				out.println(element.getQName().getName() + 
						"--->" + element.getText());
			}
		}
	}

	private static void parseAttribute(Element ele) {
		// TODO Auto-generated method stub
		List attList = ele.attributes();
		for(Object obj : attList){
			Attribute attr = (Attribute)obj;
			out.println(ele.getQName().getName() + "元素的" + 
					attr.getQName().getName() + " 屬性值為:" + 
					attr.getValue());
		}
	}

}

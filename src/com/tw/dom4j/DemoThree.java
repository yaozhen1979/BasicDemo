package com.tw.dom4j;

import java.io.File;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DemoThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SAXReader reader = new SAXReader();
		reader.setStripWhitespaceText(true);
		reader.setMergeAdjacentText(true);
		
		Document doc = reader.read(new File("xml", "test.xml"));
		Element root = doc.getRootElement();
		Element add_test = root.addElement("add_test");
		add_test.setText("test three");
		
		// output to the xml file.
		OutputFormat format = new OutputFormat("    ", true, "UTF-8");
		FileWriter fw = new FileWriter(new File("xml","test.xml"));
		XMLWriter writer = new XMLWriter(fw, format);
		writer.write(doc);
		fw.close();
	}

}

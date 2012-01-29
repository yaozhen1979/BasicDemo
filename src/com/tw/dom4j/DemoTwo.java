package com.tw.dom4j;

import java.io.File;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DemoTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DocumentFactory factory = new DocumentFactory();
		Document doc = factory.createDocument();
		doc.addProcessingInstruction("demo_test", "website=\"http://www.google.com.tw\"");
		
		String DEFAULT_NAMESPACE = "http://uxb2b.com/GOVID/LcCanceAgreedlList";
		Namespace rootNs = new Namespace("", DEFAULT_NAMESPACE ); // root namespace uri
		//Namespace xsiNs = new Namespace("xsi", XSI_NAMESPACE); // xsi namespace uri
		QName rootQName = QName.get("GOVIDLcCancelAgreedListRequest", rootNs); // your root ele
		
		// <!-- 銀行查詢受益人(招標機關)同意註銷信用狀清冊-請求 -->
		//Element root = doc.addElement("GOVIDLcCancelAgreedListRequest");
		//root.addAttribute("xmlns", "http://uxb2b.com/GOVID/LcCanceAgreedlList");
		Element root = doc.addElement(rootQName);
		
		//  <!-- 開狀銀行總行代碼 -->
		Element ISSUING_BANK_ID = root.addElement("ISSUING_BANK_ID");
		ISSUING_BANK_ID.setText("007");
		
		// <!-- 開狀銀行分行代碼 -->
		Element ISSUING_BRANCH_ID = root.addElement("ISSUING_BRANCH_ID");
		ISSUING_BRANCH_ID.setText("0937");
		
		// <!-- 開狀起始日 -->
		Element ISSUING_DATE_START = root.addElement("ISSUING_DATE_START");
		ISSUING_DATE_START.setText("2011/12/08");
		
		// <!-- 開狀截止日 -->
		Element ISSUING_DATE_END = root.addElement("ISSUING_DATE_END");
		ISSUING_DATE_END.setText("2012/01/08");
		
		// test by myself
		Element test = root.addElement("test");
		test.addAttribute("isbn","1234567890");
		Element testChildOne = test.addElement("testChildOne");
		testChildOne.setText("test_one");
		Element testChildTwo = test.addElement("testChildTwo");
		testChildTwo.setText("test_two");
		
		// output to the xml file.
		OutputFormat format = new OutputFormat("    ", true, "UTF-8");
		FileWriter fw = new FileWriter(new File("xml","test.xml"));
		XMLWriter writer = new XMLWriter(fw, format);
		writer.write(doc);
		fw.close();
		
	}

}

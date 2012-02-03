package IoC.factory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import IoC.injection.IDeviceWriter;
import IoC.service.Business;

public class BusinessFactory {
	
	private static BusinessFactory factory;
	private Properties props;
	private Business business;;
	private IDeviceWriter writer;
	
	private BusinessFactory() throws Exception{
		props = new Properties();
		props.load(new FileInputStream("config.properties"));
		String businessClass = props.getProperty("business.class");
		String writerClass = props.getProperty("writer.class");
		business = (Business) Class.forName(businessClass).newInstance();
		writer = (IDeviceWriter) Class.forName(writerClass).newInstance();
		business.setWriter(writer);
	}
	
	// class singleton
	public static BusinessFactory getInstance() throws Exception{
		if(factory == null){
			factory = new BusinessFactory();
		}
		
		return factory;
	}

	public Business getBusiness() {
		return business;
	}

	public IDeviceWriter getWriter() {
		return writer;
	}		
	
}

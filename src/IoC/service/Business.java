package IoC.service;

import IoC.injection.IDeviceWriter;

public class Business {
	
	private IDeviceWriter writer;

	public void setWriter(IDeviceWriter writer) {
		this.writer = writer;
	}
	
	public void save(){
		System.out.println("準備存入資料:");
		writer.saveToDevice();
	}
	
}

package IoC.injectionImpl;

import IoC.injection.IDeviceWriter;

public class FloppyWriter implements IDeviceWriter {

	@Override
	public void saveToDevice() {
		// TODO Auto-generated method stub
		System.out.println("存入至軟碟機.");
	}

}

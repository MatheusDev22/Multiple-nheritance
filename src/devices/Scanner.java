package devices;

public class Scanner  extends Device{

	public Scanner() {
	}
	public Scanner(String serialDevice) {
		super(serialDevice);
	}
	
	
	@Override
	public void processDoc(String doc){
		System.out.println("Scanner processing: " + doc);
	}
	
	public String scan() {
		return "Scanned content" ;
	}
}

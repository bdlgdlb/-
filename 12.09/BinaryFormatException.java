public class BinaryFormatException extends NumberFormatException{
	private String binary;

	public BinaryFormatException(String binary){
		super(binary + " is not binary String ");
		this.binary = binary;
	}

	public String getBinary(){
		return binary;
	}
}
package builder;

public class Client {
	
	public static void main(String[] args) {
 		TextConveter convertor;
 		if (args[0].equals("pdf")) {
 			convertor = new PDFConverter();
 		} else {
 			convertor = new DOCConverter();
 		}
 		convertor.convert();
 	}
}

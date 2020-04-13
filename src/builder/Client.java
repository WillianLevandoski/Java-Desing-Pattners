package builder;

public class Client {
	
	public static void main(String[] args) {
		Director converter = new Director(new DOCConverter());
		converter.convert();
		
		TextConverterProduct textConvert = converter.getTextConverter();
		System.out.println(textConvert.character);
		System.out.println(textConvert.paragraph);
		System.out.println(textConvert.font);
		
		System.out.println();

		converter = new Director(new PDFConverter());
		converter.convert();
		 textConvert = converter.getTextConverter();
		
		System.out.println(textConvert.character);
		System.out.println(textConvert.paragraph);
		System.out.println(textConvert.font);
		
 	}
}

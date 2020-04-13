package builder;

public abstract class TextConveterBuilder {
	 protected TextConverterProduct textConverter = new TextConverterProduct();
	
	public abstract  void characterConverter();

 	public abstract  void paragraphConverter();

 	public abstract void fontConverter();
 	
 	public TextConverterProduct getTextConverter() {
 		return textConverter;
 	}
}

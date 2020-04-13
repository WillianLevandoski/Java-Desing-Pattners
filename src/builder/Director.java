package builder;

public class Director {
	
	protected TextConveterBuilder converter;
	
	public Director(TextConveterBuilder builder) {
		this.converter = builder;
	}
	
	public void convert() {
		converter.characterConverter();
		converter.paragraphConverter();
		converter.fontConverter();
	}

	public TextConverterProduct getTextConverter() {
		return converter.getTextConverter();
	}
	
}

package builder;

class DOCConverter extends TextConveterBuilder {

	@Override
	public void characterConverter() {
		textConverter.character = "DOC Character";
	}
	
	@Override
	public void paragraphConverter() {
		textConverter.paragraph = "DOC Paragraph";
	}

	@Override
	public void fontConverter() {
		textConverter.font = "DOC Font";
	}
}
 	
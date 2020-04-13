package builder;

class PDFConverter extends TextConveterBuilder {

	@Override
	public void characterConverter() {
		textConverter.character = "PDF Character";
	}
	
	@Override
	public void paragraphConverter() {
		textConverter.paragraph = "PDF Paragraph";
	}
	
	@Override
	public void fontConverter() {
		textConverter.font = "PDF Font";
	}
 }




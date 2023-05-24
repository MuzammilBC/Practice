package rakuten_SS;
public class Files {
	void display() {

	}
}

class JpgFile extends Files{
	@Override
	void display() {
		System.out.println("Displays image");
	}
	void showDimension() {
		System.out.println("showDimension");
	}
	void displaysize() {
		System.out.println("12.45 MB");
	}
}
class PdfFile extends Files{
	@Override
	void display() {
		System.out.println("Displays document");
	}
	void convertToWord() {
		System.out.println("Converted from PDF to Word");
	}
	void displaysize() {
		System.out.println("45 KB");
	}
}
class JavaFile extends Files{
	@Override
	void display() {
		System.out.println("Displays codes");
	}
	
	void compileToClassFile() {
		System.out.println("Compiled to Byte code");
	}
	void displaysize() {
		System.out.println("5 KB");
	}
}
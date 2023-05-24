package rakuten_SS;
public class OpenApp {
public static void main(String[] args) {
	// upcasting - super class reference referring to subclass object
	Files f = new JpgFile();
	Files g = new PdfFile();
	Files h = new JavaFile();
	
	JpgFile j = (JpgFile) f;
	j.displaysize();
	JavaFile jf = (JavaFile) f;
	jf.displaysize();

	
}
}

package javajung;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parce("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parce("document2.html");
	}
}

interface Parseable {
	public abstract void parce(String fileName);
}

class ParserManager {
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parce(String fileName) {
		//구문 분석 코드 
		System.out.println(fileName + "-XML parsing completed.");
	}
}

class HTMLParser implements Parseable {

	
	public void parce(String fileName) {
		// 구문 분석 코드 
		System.out.println(fileName + "-HTML parsing completed.");
	}
	
}
package collection;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UrlLibrary urlLibrary = new UrlLibrary();
		for (String html : urlLibrary) {
			System.out.println(html.length());
			System.out.println(html);
		}
	}

}

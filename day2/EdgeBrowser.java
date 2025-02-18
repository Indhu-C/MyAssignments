package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser objName = new Browser();
		objName.launchBrowser("EdgeBrowser");
		//objName.loadUrl(true);
		System.out.println(objName.loadUrl(true));
	}
}

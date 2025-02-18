package week1.day2;

public class Browser {
	
	void launchBrowser() {
		System.out.println("Browser launched successfully");
	}
	
	void launchBrowser(String name) {
		System.out.println("Browser"+name+" launched successfully");
	}
	
	void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
	
	boolean loadUrl(boolean status) {
		System.out.println("Application URL loaded successfully");
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser objName = new Browser();
		objName.launchBrowser();
		objName.loadUrl();
		
	}

}

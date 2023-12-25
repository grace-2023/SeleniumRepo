package homeassigment.week1;

public class LaunchBrowser {


			
			public String launchBrowser(String browsername)
			{
				System.out.println("Browser launched successfully");
				return browsername;
			}
			
			public void loadUrl()
			{
				System.out.println("Application url is launched successfully");
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				LaunchBrowser browser=new LaunchBrowser();
				browser.launchBrowser("Google");
				browser.loadUrl();
			
				
			}

	
	

}

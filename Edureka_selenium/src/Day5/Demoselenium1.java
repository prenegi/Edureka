package Day5;

public class Demoselenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Selenium1 preeti;
		preeti = new Selenium1();
		preeti.invokeBrowser();
		System.out.println(preeti.getPageTitle());
		preeti.closeBrowser();

	}

}

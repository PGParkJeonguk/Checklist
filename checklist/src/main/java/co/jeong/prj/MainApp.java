package co.jeong.prj;

import co.jeong.prj.common.GB;
import co.jeong.prj.common.Login;
import co.jeong.prj.common.Menu;

public class MainApp {
	public static void main(String[] args) {
		Login login = new Login();
		Menu menu = new Menu();
		login.run();
		menu.run();
		GB.scn.close();
	}
}

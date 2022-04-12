package main;

import common.CommonService;
import common.OpenService;
import javafx.scene.Parent;

public class Controller {
	
	private OpenService openService;
	private static Parent loginForm;
	private static Parent mainForm;
	private static Parent nowForm;
	private static Parent regForm;
	private CommonService commonService;
	private static String loginId;
	
	public Controller() {
		openService = new OpenService();
		commonService = new CommonService();
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public void setNowForm(Parent nowForm) {
		this.nowForm = nowForm;
	}
	
	public void setMainForm(Parent mainForm) {
		this.mainForm = mainForm;
	}
	
	public void openLoginPage() {
		commonService.windowClose(nowForm);
		openService.openLoginPage();
	}
	
	public void openMainPage() {
		commonService.windowClose(nowForm);
		openService.openMainPage();
	}
	
	public void openRegPage() {
		commonService.windowClose(nowForm);
		openService.openRegPage();
	}
	
	public void setLoginForm(Parent loginForm) {
		this.loginForm = loginForm;
	}
	
	public void setRegForm(Parent regForm) {
		this.regForm = regForm;
	}
	
	public void cancelPage() {
		commonService.windowClose(nowForm);
		openService.openMainPage();
	}
	
	
	
}

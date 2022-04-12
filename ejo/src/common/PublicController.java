package common;

import main.Controller;

public class PublicController {
	
	private Controller controller;
	
	
	public PublicController() {
		controller = new Controller();
	}
		
	//로그인 화면으로 이동
	public void loginProc() {
		controller.openLoginPage();
	}
	
	//id,pw찾기 화면으로 이동
	public void idpwProc() {
	}
	
	//회원가입 화면으로 이동
	public void regProc() {
		controller.openRegPage();
	}
	
	//마이페이지 화면으로 이동
	public void myPageProc() {
	}
	
	//메인 화면으로 이동
	public void mainProc() {
		controller.openMainPage();
	}
	
	//검색기능
	public void searchProc() {
	}
	
	//공지사항 화면으로 이동
	public void noticeProc() {
		
	}
	
	public void eventProc() {
		
	}
	
	
}

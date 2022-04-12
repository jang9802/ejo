package main;

import java.net.URL;
import java.util.ResourceBundle;

import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MainController extends PublicController implements Initializable{
	
	private @FXML Label loginButton;  
	private @FXML Label idpwButton;
	private @FXML Label regButton;
	private @FXML Label mypageButton;
	private @FXML ImageView logo;
	private @FXML TextField searchfield;
	private @FXML Button searchButton;
	private @FXML ImageView goodsImage;
	private @FXML ImageView eventImage;
	private @FXML ImageView drawImage;
	private MainService mainService;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mainService = new MainService();
	}
	
	//상품 화면으로 이동
	public void goGoods() {
		mainService.goGoods();
	}
	
	//마우스 굿즈에 갖다댔을 때 글자로 변경
	public void onGoodsCursor() {
		mainService.onGoodsCursor(goodsImage);
	}
	
	//마우스 굿즈에서 땟을때
	public void offGoodsCursor() {
		mainService.offGoodsCursor(goodsImage);
	}
	
	//이벤트 화면으로 이동
	public void goEvent() {
		mainService.goEvent();	
	}
	
	//마우스 이벤트에 갖다댔을 때 글자로 변경
	public void onEventCursor() {
		mainService.onEventCursor(eventImage);
	}
	
	//마우스 이벤트에서 땟을 때
	public void offEventCursor() {
		mainService.offEventCursor(eventImage);
	}
	
	//드로우 화면으로 이동
	public void goDraw() {
		mainService.goDraw();	
	}
	
	//마우스 드로우에 갖다댔을 때
	public void onDrawCursor() {
		mainService.onDrawCursor(drawImage);
	}
	
	//마우스 드로우에서 땟을 때
	public void offDrawCursor() {
		mainService.offDrawCursor(drawImage);
	}

	
	
}

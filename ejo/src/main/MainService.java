package main;

import java.io.File;

import common.CommonService;
import common.PublicController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainService extends PublicController{
	
	CommonService csv = new CommonService();
	Image goodsImage = new Image(new File("drawImage.png").toURI().toString());
	
	private String GOODS_URL = "C:\\javas\\workspace\\ejo\\resource\\goodsImage.jpg";
	private String GOODS_WORD_URL = "C:\\javas\\workspace\\ejo\\resource\\productword.png";
	private String EVENT_URL = "C:\\javas\\workspace\\ejo\\resource\\eventImage.png";
	private String EVENT_WORD_URL = "C:\\javas\\workspace\\ejo\\resource\\eventword.png";
	private String DRAW_URL = "C:\\javas\\workspace\\ejo\\resource\\drawImage.png";
	private String DRAW_WORD_URL = "C:\\javas\\workspace\\ejo\\resource\\drawword.png";
	//로그인 화면으로 이동

	
	//상품 화면으로 이동
	public void goGoods() {
		
	}
	
	//마우스 굿즈에 갖다댔을 때 글자로 변경
	public void onGoodsCursor(ImageView imageView) {
		changeImage(GOODS_WORD_URL,imageView);
	}
	
	//마우스 굿즈에서 땟을때
	public void offGoodsCursor(ImageView imageView) {
		changeImage(GOODS_URL,imageView);
	}
	
	//이벤트 화면으로 이동
	public void goEvent() {
		
	}
	
	//마우스 이벤트에 갖다댔을 때 글자로 변경
	public void onEventCursor(ImageView imageView){
		changeImage(EVENT_WORD_URL,imageView);
	}
	
	//마우스 이벤트에서 땟을 때
	public void offEventCursor(ImageView imageView) {
		changeImage(EVENT_URL,imageView);
	}
	
	//드로우 화면으로 이동
	public void goDraw() {
		
	}
	
	//마우스 드로우에 갖다댔을 때
	public void onDrawCursor(ImageView imageView) {
		changeImage(DRAW_WORD_URL,imageView);
	}
	
	//마우스 드로우에서 땟을 때
	public void offDrawCursor(ImageView imageView) {
		changeImage(DRAW_URL,imageView);
	}
	
	public void changeImage(String url, ImageView imageView) {
		File imageFile = new File(url);
		Image image = new Image(imageFile.toURI().toString());
		imageView.setImage(image);
	}
	
	

}

package gui;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MainViewController {

	@FXML
	private MenuItem menuItemSeller;
	

	@FXML
	private MenuItem menuItemDepartment;

	@FXML
	private MenuItem menuItemAbout;
	
	public void onMenuItemSellerAction() {
		System.out.println("onMenuItemSellerAction");
	}
	
	public void onMenuItemDepartmentAction() {
		System.out.println("onMenuItemDepartmentAction");
	}
	
	public void onMenuItemAboutAction() {
		System.out.println("onMenuItemAboutAction");
	}
}

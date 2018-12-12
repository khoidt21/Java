package com.company.car;

public class XeDap extends Car {
	
	// màu sắc vành xe 
	// ghi đông 
	
	String colorRim;
	String chainlink;
	String handleBar;
	
	public String getColorRim() {
		return colorRim;
	}
	public void setColorRim(String colorRim) {
		this.colorRim = colorRim;
	}
	// ghi đông 
	public String getHandleBar() {
		return handleBar;
	}
	public void setHandleBar(String handleBar) {
		this.handleBar = handleBar;
	}
	// Phương thức bóp còi xe
	public String whistle() {
		return "Bạn đang bóp còi xe.";
	}
	
}

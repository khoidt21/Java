package com.company.car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XeHoi xeFord = new XeHoi();
		XeHoi xeToyota = new XeHoi();
		
		// xe Ford
		// so banh
		xeFord.setNumberOfWheels(4);
		// nha san xuat
		xeFord.setManufactuner("Ford");
		// suc chua
		xeFord.setCapcity(4);
		// mau sac
		xeFord.setColor("Màu Trắng");
		// nam san xuat 
		xeFord.setYearManufactuner(1990);
		
		System.out.println("---Xe ô tô Ford---");
		System.out.println("Số bánh " + xeFord.getNumberOfWheels());
		System.out.println("Nhà sản xuất " + xeFord.getManufactuner());
		System.out.println("Sức chứa " + xeFord.getCapcity());
		System.out.println("Màu sắc " + xeFord.getColor());
		System.out.println("Năm sản xuất "+ xeFord.getYearManufactuner());
		System.out.println("Xe ô tô Ford " + xeFord.AutomaticSettings());
		System.out.println("Xe ô tô Ford " + xeFord.SelfSteeringNumber());
		// di chuyen bao nhieu km
		System.out.println(xeFord.move(10000));
		
		System.out.println("---------------------------------------------");
		
		// Xe Toyota
		xeToyota.setNumberOfWheels(4);
		// nha san xuat
		xeToyota.setManufactuner("Toyota");
		// suc chua
		xeToyota.setCapcity(7);
		// mau sac
		xeToyota.setColor("Màu �?�?");
		// nam san xuat 
		xeToyota.setYearManufactuner(1995);
		
		System.out.println("---Xe ô tô Toyota---");
		System.out.println("Số bánh " + xeToyota.getNumberOfWheels());
		System.out.println("Nhà sản xuất " + xeToyota.getManufactuner());
		System.out.println("Sức chứa " + xeToyota.getCapcity());
		System.out.println("Màu sắc " + xeToyota.getColor());
		System.out.println("Năm sản xuất " + xeToyota.getYearManufactuner());
		System.out.println("Xe ô tô Toyota " + xeToyota.AutomaticSettings());
		System.out.println("Xe ô tô Toyota " + xeToyota.SelfSteeringNumber());
		// di chuyen bao nhieu km 
		System.out.println(xeToyota.move(15000));
		
		// Xe may 
		
		System.out.println("---------------------------------------------");
		XeMay dream = new XeMay();
		XeMay sh2018 = new XeMay();
		XeMay lead = new XeMay();
		 
		dream.setNumberOfWheels(2);
		dream.setColor("Màu đen");
		dream.setCapcity(2);
		dream.setYearManufactuner(1985);
		dream.setDiscbrakes("Phanh đĩa");
		
		System.out.println("Dream Số bánh " + dream.getNumberOfWheels());
		System.out.println("Dream Màu sắc " + dream.getColor());
		System.out.println("Dream Sức chứa " + dream.getCapcity());
		System.out.println("Dream Năm sản xuất " + dream.getYearManufactuner());
		System.out.println("Dream " + dream.getDiscbrakes());
		System.out.println("Dream đi số km " + dream.move(2000));
		System.out.println("Dream " + dream.UpNumber(2));
		System.out.println("---------------------------------------------");
		
		sh2018.setNumberOfWheels(2);
		sh2018.setColor("Màu trắng");
		sh2018.setCapcity(2);
		sh2018.setYearManufactuner(1983);
		sh2018.setHandbrake("Phanh tay");
		
		System.out.println("SH2018 Số bánh " + sh2018.getNumberOfWheels());
		System.out.println("SH2018 Màu sắc " + sh2018.getColor());
		System.out.println("SH2018 Sức chứa " + sh2018.getCapcity());
		System.out.println("SH2018 Năm sản xuất " + sh2018.getYearManufactuner());
		System.out.println("SH2018 " + sh2018.getDiscbrakes());
		System.out.println("SH2018 đi số km " + sh2018.move(2000));
		System.out.println("SH2018 " + sh2018.UpNumber(2));
		System.out.println("---------------------------------------------");
		
		lead.setNumberOfWheels(2);
		lead.setColor("Màu đen");
		lead.setCapcity(2);
		lead.setYearManufactuner(1879);
		lead.setDiscbrakes("Phanh tay");
		
		System.out.println("Led Số bánh " + lead.getNumberOfWheels());
		System.out.println("Led Màu sắc " + lead.getColor());
		System.out.println("Led Sức chứa " + lead.getCapcity());
		System.out.println("Led Năm sản xuất " + lead.getYearManufactuner());
		System.out.println("Led " + lead.getDiscbrakes());
		System.out.println("Led đi số km " + lead.move(2000));
		System.out.println("Led " + lead.UpNumber(2));
		System.out.println("---------------------------------------------");
		
		// Xe dap 
		XeDap phuongHoang = new XeDap();
		XeDap thongNhat = new XeDap();
		XeDap jaPan = new XeDap();
		XeDap korean = new XeDap();
		XeDap china = new XeDap();
		
		phuongHoang.setNumberOfWheels(2);
		phuongHoang.setColor("Phượng hoàng Màu trắng");
		phuongHoang.setCapcity(2);
		phuongHoang.setYearManufactuner(1983);
		phuongHoang.setColorRim("Phượng hoàng Màu sắc vành đ�?");
		phuongHoang.setHandleBar("Ghi đông thẳng");
		System.out.println("Phượng hoàng số bánh " + phuongHoang.getNumberOfWheels());
		System.out.println("Phượng hoàng màu sắc " + phuongHoang.getColor());
		System.out.println("Phượng hoàng sức chứa " + phuongHoang.getCapcity());
		System.out.println("Phượng hoàng năm sản xuất " + phuongHoang.getYearManufactuner());
		System.out.println(phuongHoang.getColorRim());
		System.out.println("Phượng hoàng " + phuongHoang.getHandleBar());
		System.out.println("Phượng hoàng " + phuongHoang.whistle());
		
		System.out.println("---------------------------------------------");
		thongNhat.setNumberOfWheels(2);
		thongNhat.setColor("Thống nhất màu trắng");
		thongNhat.setCapcity(2);
		thongNhat.setYearManufactuner(1982);
		thongNhat.setColorRim("Thống nhất màu sắc vành xanh");
		thongNhat.setHandleBar("Ghi đông thẳng");
		System.out.println("Thống nhất số bánh " + thongNhat.getNumberOfWheels());
		System.out.println("Thống nhất màu sắc " + thongNhat.getColor());
		System.out.println("Thống nhất sức chứa " + thongNhat.getCapcity());
		System.out.println("Thống nhất năm sản xuất " + thongNhat.getYearManufactuner());
		System.out.println(thongNhat.getColorRim());
		System.out.println("Thống nhất " + thongNhat.getHandleBar());
		System.out.println("Thống nhất " + thongNhat.whistle());
		
		System.out.println("----------------------------------------------");
		jaPan.setNumberOfWheels(2);
		jaPan.setColor("Xe Nhật màu đỏ");
		jaPan.setCapcity(2);
		jaPan.setYearManufactuner(1981);
		jaPan.setColorRim("Xe Nhật màu sắc vành trắng");
		jaPan.setHandleBar("Ghi đông tay ngang");
		System.out.println("Xe nhật số bánh " + jaPan.getNumberOfWheels());
		System.out.println("Xe nhật màu sắc " + jaPan.getColor());
		System.out.println("Xe nhật sức chứa " + jaPan.getCapcity());
		System.out.println("Xe nhật năm sản xuất " + jaPan.getYearManufactuner());
		System.out.println(jaPan.getColorRim());
		System.out.println("Xe nhật " + jaPan.getHandleBar());
		System.out.println("Xe nhật " + jaPan.whistle());
		
		System.out.println("-----------------------------------------------");
		korean.setNumberOfWheels(2);
		korean.setColor("Xe hàn quốc màu đỏ");
		korean.setCapcity(2);
		korean.setYearManufactuner(1981);
		korean.setColorRim("Xe hàn quốc màu sắc vành trắng");
		korean.setHandleBar("Ghi đông tay ngang");
		System.out.println("Xe hàn quốc số bánh " + korean.getNumberOfWheels());
		System.out.println("Xe hàn quốc màu sắc " + korean.getColor());
		System.out.println("Xe hàn quốc sức chứa " + korean.getCapcity());
		System.out.println("Xe hàn quốc năm sản xuất " + korean.getYearManufactuner());
		System.out.println(korean.getColorRim());
		System.out.println("Xe hàn quốc " + korean.getHandleBar());
		System.out.println("Xe hàn quốc " + korean.whistle());
		
		System.out.println("------------------------------------------------");
		china.setNumberOfWheels(2);
		china.setColor("Xe trung quốc màu đỏ");
		china.setCapcity(2);
		china.setYearManufactuner(1981);
		china.setColorRim("Xe trung quốc màu sắc vành xanh");
		china.setHandleBar("Ghi đông tay ngang");
		System.out.println("Xe trung quốc số bánh  " + china.getNumberOfWheels());
		System.out.println("Xe trung quốc màu sắc " + china.getColor());
		System.out.println("Xe trung quốc sức chứa " + china.getCapcity());
		System.out.println("Xe trung quốc năm sản xuất " + china.getYearManufactuner());
		System.out.println(china.getColorRim());
		System.out.println("Xe trung quốc " + china.getHandleBar());
		System.out.println("Xe trung quốc " + china.whistle());
		System.out.println("------------------------------------------------");
		
		
	}

}

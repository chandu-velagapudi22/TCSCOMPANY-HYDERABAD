package com.infotech.tcs;

public class Hyderabad_TCS {
	public static void hr_Dept() {
		System.out.println("****************");
		System.out.println("We are the hr deperatment of tcs");
		System.out.println("****************");
	}

	public void ui_Dept() {
		System.out.println("****************");
		System.out.println("WE ARE THE UI_DEPT OF THE TCS COMPANY");
		System.out.println("****************");
	}

	public static void main(String[] args) {

		Hyderabad_TCS tcs = new Hyderabad_TCS();
		tcs.ui_Dept();
		hr_Dept();
	}
}

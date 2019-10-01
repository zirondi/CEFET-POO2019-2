package br.com.lojavirtual.papelaria;

public class Teclado {
	private double Preço;
	private boolean Usb;
	
	public double getPreço() {
		return Preço;
	}
	public void setPreço(double preço) {
		this.Preço = preço;
	}
	public boolean isUsb() {
		return Usb;
		//foco no isUsb (no caso de boolean get é is, importante na prova
	}
	public void setUsb(boolean usb) {
		this.Usb = usb;
	}

}

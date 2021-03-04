package main;
import remoteControl.RemoteControl;

public class Main {

	public static void main(String[] args) {
		
		RemoteControl control = new RemoteControl();
		
//		CHAMANDO ALGUNS MÉTODOS
//		MÉTODO LIGAR
		control.turnOn();
		
//		MÉTODO AUMENTAR O VOLUME
		control.upVolume();
		
//		MÉTODO ABRIR MENU
		control.openMenu();
		
//		MÉTODO FECHAR MENU
		control.closeMenu();
		
	}
}
 
package main;
import remoteControl.RemoteControl;

public class Main {

	public static void main(String[] args) {
		
		RemoteControl control = new RemoteControl();
		
//		CHAMANDO ALGUNS M�TODOS
//		M�TODO LIGAR
		control.turnOn();
		
//		M�TODO AUMENTAR O VOLUME
		control.upVolume();
		
//		M�TODO ABRIR MENU
		control.openMenu();
		
//		M�TODO FECHAR MENU
		control.closeMenu();
		
	}
}
 
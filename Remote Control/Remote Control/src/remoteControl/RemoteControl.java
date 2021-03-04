package remoteControl;

import controlador.Controlador;

public class RemoteControl implements Controlador {
	
//	ATTRIBUTES
	private int volume;
	private boolean on, playing;
	
//	CONSTRUCTOR
	public RemoteControl() {
		super();
		this.setVolume(50);
		this.setOn(false);
		this.setPlaying(false);
	}

//	MÉTHOD GET E SET
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public boolean getPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

//	ABSTRACT METHODS
	@Override
	public void turnOn() {
		this.setOn(true);
	}

	@Override
	public void turnOff() {
		this.setOn(false);
	}
	
	@Override
	public void openMenu() {
		if (this.getOn() == true) {
			System.out.print(   "---- MENU ----" + "\n" +
					"Está ligado? " + this.getOn() + "\n" +
					"Está tocando? " + this.getPlaying() + "\n" +
					"Volume: " + this.getVolume());
			
			for (int i = 0; i <= this.getVolume(); i += 10) {
				System.out.print(" | ");
			}
			
		} else {
			System.out.println("Não é possível abrir o menu");
		}

	}

	@Override
	public void closeMenu() {
		System.out.println("Fechando menu.");
	}

	@Override
	public void upVolume() {
		if (this.getOn()) {
			this.setVolume(this.getVolume() + 5); 
		} else {
			System.out.println("Impossível aumentar o volume.");
		}
	}

	@Override
	public void downVolume() {
		if (this.getOn()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossível abaixar o volume.");
		}
	}

	@Override
	public void mute() {
		if (this.getOn() && this.getVolume() > 0) {
			this.setVolume(0);
		}	
	}

	@Override
	public void muteOff() {
		if(this.getOn() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.getOn() && !(this.getPlaying())) {
			this.setPlaying(true);			
		} else {
			System.out.println("Não é possível reproduzir");
		}
	}

	@Override
	public void pause() {
		if (this.getOn() && this.getPlaying()) {
			this.setPlaying(false);
		} else {
			System.out.println("Não é possível dar pausa");
		}
	}
}
package Ex4;

public class ControleRemoto extends Televisao {
	
	// Aumentar e Diminuir Volume
	public void maisVolume() {
		setVolume(getVolume() + 1);
	}
	public void menosVolume() {
		setVolume(getVolume() - 1);
	}
	
	// Mudar Canal
	public void avancarCanal() {
		setCanal(getCanal() + 1);
	}
	public void retrocederCanal() {
		setCanal(getCanal() - 1);
	}
	
	
	
	//Imprimir
	public String imprimir() {
		return "\n\nVolume: " + getVolume() + "\nCanal: " + getCanal();
	}

}

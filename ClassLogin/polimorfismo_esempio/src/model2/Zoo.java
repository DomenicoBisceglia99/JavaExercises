package model2;

public class Zoo {
	private Animale[] animali = new Animale[10];

	public Animale[] getAnimali() {
		return animali;
	}

	public void addAnimale(Animale animale) {
		for(int i = 0; i < animali.length; i++) {
			if(animali[i] == null) {
				animali[i] = animale;
				break;
			}
		}
	}

	
}

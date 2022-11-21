package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronain;
import personnages.Yakuza;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "the", 20);
		Commercant chonin = new Commercant("Chonin", "the", 40);
		Commercant kumi = new Commercant("Kumi", "the", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronain roro = new Ronain("Roro", "shochu", 60);
		
		marco.faireConnaissance(roro);
		marco.faireConnaissance(yaku);
		marco.faireConnaissance(chonin);
		marco.faireConnaissance(kumi);
		
		marco.listerConnaissances();
		yaku.listerConnaissances();
		
	}

}

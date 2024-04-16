package myOwn;

public class LabbFyraEgetSpel {

	public static void main(String[] args) {

		playerSetUp p = new playerSetUp();
		firstDayoOfSchool f = new firstDayoOfSchool(p.returnHealth(), p.returnPlayerStressLvl());

		p.enterName();
		p.playIntro();
		f.playGame();
		// anropar metoderna

	}

}

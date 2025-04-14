package Collections1;

public class Q3 {

	public static void main(String[] args) {
		MusicLibrary ml=new MusicLibrary();
		ml.addSong(new Song("Without Me","Eminen"));
		ml.addSong(new Song("josh","nagchaitu"));
		ml.addSong(new Song("bunny","licifer"));
		ml.displayLiabrary();
		ml.removeSong("bunny");
		ml.playRamdomSong();
		ml.playRamdomSong();
		ml.playRamdomSong();
	}

}

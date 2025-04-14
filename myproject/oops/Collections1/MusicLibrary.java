package Collections1;
import java.util.*;
public class MusicLibrary {
List<Song>songs;


public MusicLibrary()
{
this.songs=new ArrayList<>();

}
public void addSong(Song song)
{
	this.songs.add(song);
}
public void removeSong(String name) {
	boolean songFound=false;
	for(Song song:songs)
	{
	if(song.getTitle().equals(name))
	{
		System.out.println("product");
		songs.remove(song);
		songFound=true;
		break;
	}
	}
if(!songFound)
{
	System.out.println("there is no product found "+name);
}
}
public void playRamdomSong() {
	int index=(int)
			Math.floor(Math.random()*songs.size());
	Song song=songs.get(index);
	song.play();
}
public void displayLiabrary()
{
for(Song s:songs)
{
	System.out.println(s);
}
}
}
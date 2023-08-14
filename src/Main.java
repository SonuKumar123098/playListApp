import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Album arijitAlbum=new Album("arijit singh", "arijit's album");
        Album alanAlbum=new Album("alan walker", "walker's album");

        System.out.println(arijitAlbum.addSongToAlbum("kesaria", 4.5));
        System.out.println(arijitAlbum.addSongToAlbum("tum kya mile", 5.3));
        System.out.println(arijitAlbum.addSongToAlbum("lal ishq", 3.2));

        System.out.println(alanAlbum.addSongToAlbum("dardse", 4.6));
        System.out.println(alanAlbum.addSongToAlbum("firds",4.5));
        System.out.println(alanAlbum.addSongToAlbum("dharak", 4.3));

        LinkedList<Song> myPlayList=new LinkedList<>();

        System.out.println(alanAlbum.addAlbumSongToPlayList("5",myPlayList));
        System.out.println(alanAlbum.addAlbumSongToPlayList("alone",myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList(6,myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList(2,myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList("o yara", myPlayList));
    }
}
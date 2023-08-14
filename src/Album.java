import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
     private String artist;
     private String name;
     private List<Song> songs;

    public Album() {
    }

    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
        songs=new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    /**
     * finding a song that are present or not in the list
     * @param name
     * @return
     */
    public boolean findSong(String name){
        for(Song song: songs){
            if(song.getTitle().equalsIgnoreCase(name)) return true;
        }
        return false;
    }

    /**
     * adding song to album
     * @param name
     * @param duration
     * @return
     */
    public String addSongToAlbum(String name, double duration){
        if(!findSong(name)){
            songs.add(new Song(name, duration));
            return "song has added successfully to album";
        }
        return "song is already exist in your this album";
    }

    /**
     * add song from albums to your playlist
     * @param title
     * @param playList
     * @return
     */

    public String addAlbumSongToPlayList(String title, LinkedList<Song> playList){
        for(Song song:songs){
            if(song.getTitle().equalsIgnoreCase((title))){
                playList.add(song);
                return "song added successfully to your playList";
            }
        }
        return "song does not exists in album";
    }

    /**
     * method overloading
     * @param songNo
     * @param playList
     * @return
     */
    public String addAlbumSongToPlayList(int songNo, LinkedList<Song> playList){
        int index=songNo-1;
        if(index<songs.size()){
            playList.add(songs.get(index));
            return "song added successfully to your playList";
        }
        return "songNo does not exists in album";
    }
}

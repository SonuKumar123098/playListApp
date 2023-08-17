import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static ArrayList<Album>albums=new ArrayList<>();
    public static void main(String[] args) {
        Album arijitAlbum=new Album("arijit singh", "arijit's album");
        albums.add(arijitAlbum);
        Album alanAlbum=new Album("alan walker", "walker's album");
        albums.add(alanAlbum);

        System.out.println(arijitAlbum.addSongToAlbum("kesaria", 4.5));
        System.out.println(arijitAlbum.addSongToAlbum("tum kya mile", 5.3));
        System.out.println(arijitAlbum.addSongToAlbum("lal ishq", 3.2));

        System.out.println(alanAlbum.addSongToAlbum("dardse", 4.6));
        System.out.println(alanAlbum.addSongToAlbum("firds",4.5));
        System.out.println(alanAlbum.addSongToAlbum("dharak", 4.3));

        LinkedList<Song> myPlayList=new LinkedList<>();

        System.out.println(alanAlbum.addAlbumSongToPlayList(5,myPlayList));
        System.out.println(alanAlbum.addAlbumSongToPlayList("dardse",myPlayList));
        System.out.println(alanAlbum.addAlbumSongToPlayList("firds",myPlayList));
        System.out.println(alanAlbum.addAlbumSongToPlayList("dharak",myPlayList));
        System.out.println(alanAlbum.addAlbumSongToPlayList("alone",myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList(6,myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList(2,myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList("o yara", myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList("tum kya mile", myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList("kesaria", myPlayList));
        System.out.println(arijitAlbum.addAlbumSongToPlayList("lal ishq", myPlayList));
        play(myPlayList);
    }
    public static void play(LinkedList<Song>myPlayList){
        boolean quit=false;
        ListIterator<Song> itr=myPlayList.listIterator();
        Scanner sc=new Scanner(System.in);
        boolean isForward=false;
        if(itr.hasNext()){
            System.out.println("Currently playing "+ itr.next());
            isForward=true;
        }else{
            System.out.println("playlist is empty");
            return;
        }

        System.out.println("number of songs present in playlist "+myPlayList.size());
        printMenu();
        while(!quit){
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    if(!isForward){
                        itr.next();
                        isForward=true;
                    }
                    if(itr.hasNext()){
                        System.out.println(itr.next());
                    }
                    else{
                        System.out.println("you reached the end of the playlist");
                    }
                    break;
                case 2:
                    if(isForward){
                        itr.previous();
                        isForward=false;
                    }
                    if(itr.hasPrevious()){
                        System.out.println(itr.previous());
                    }else{
                        System.out.println("you have reached at start of the playlist");
                    }
                    break;
                case 3:
                    if(isForward){
                        System.out.println(itr.previous());
                        isForward=false;
                    }else{
                        System.out.println(itr.next());
                        isForward=true;
                    }
                    break;
                case 4:
                    printMenu();
                    break;
                case 5:
                    itr.remove();
                    break;
                case 6:
                    printSongs(myPlayList);
                    break;
                case 7:
                    quit=true;
                    break;
                default:
                    System.out.println("you have entered the wrong choice");
            }
        }
    }
    public static void printSongs(LinkedList<Song>myPlayList){
        for(Song song:myPlayList){
            System.out.println(song);
        }
    }
    public static void printMenu(){
        System.out.println("Enter 1 - play next song");
        System.out.println("Enter 2 - play previous song");
        System.out.println("Enter 3 - repeat the song");
        System.out.println("Enter 4 - show menu again");
        System.out.println("Enter 5 - Delete the current song");
        System.out.println("Enter 6 - Print all song from playlist");
        System.out.println("Enter 7 - Close the app");
    }
}
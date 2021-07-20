package domain.store;

import java.util.Date;

public class Album {
    
    private final int albumID;
    private String albumName;
    private static int contadorAlbums;
    
    private Album(){
        this.albumID = ++Album.contadorAlbums;
    }
    
    public Album(String albumName){
        this();
        this.albumName = albumName;
    }
    
    public int getAlbumID(){
        return this.albumID;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "Album{" + "albumID=" + albumID + ", albumName=" + albumName + '}';
    }
}

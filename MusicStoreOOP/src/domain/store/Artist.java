package domain.store;

public class Artist {
    
    private final int artistID;
    private String artistName;
    private static int contadorArtists;
    
    private Artist(){
        this.artistID = ++Artist.contadorArtists;
    }
    
    public Artist(String artistName){
        this();
        this.artistName = artistName;
    }
    
    public int getArtistID(){
        return this.artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Artist{" + "artistID=" + artistID + ", artistName=" + artistName + '}';
    }
}

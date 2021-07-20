package domain.store;

import java.util.UUID;

public class DigitalProduct {
    private final String productID = UUID.randomUUID().toString();
    private String genero;
    private Song song;
    private Album album;
    private Artist artist;
    
    private DigitalProduct(){
        
    }
    
    public DigitalProduct(String genero, Song song, Album album, Artist artist){
        this();
        this.genero = genero;
        this.song = song;
        this.album = album;
        this.artist = artist;
    }

    public String getProductID() {
        return productID;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "DigitalProduct{" + "productID=" + productID + ", genero=" + genero + ", song=" + song + ", album=" + album + ", artist=" + artist + '}';
    }
}

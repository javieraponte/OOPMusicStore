package domain.store;


public class Song {
    
    // Definir atributos
    private final int songID;
    private String songName;
    private static int contadorSongs; // Contabiliza cuantos tipos se crean
    
    // Constructor vacio
    private Song(){
        this.songID = ++Song.contadorSongs;
    }
    
    // Constructor con argumentos - publico
    public Song(String songName){
        this(); // Iniciar variable ID
        this.songName = songName;
    }
    
    // Metodos Get Set
    public int getSongID(){
        return this.songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
    
    // toString
    @Override
    public String toString() {
        return "Song{" + "songID=" + songID + ", songName=" + songName + '}';
    }
}

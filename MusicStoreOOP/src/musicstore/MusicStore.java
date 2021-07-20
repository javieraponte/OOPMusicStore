package musicstore;

import domain.store.*;

public class MusicStore {
    public static void main(String[] args) {
        
        Song song = new Song("Walk");
        Album album = new Album("Walk");
        Artist artist = new Artist("Saucy Santana");
        DigitalProduct nft = new DigitalProduct("Hip Hop", song, album, artist);
        
        Song track = new Song("Tra");
        Album albumA = new Album("Tra");
        Artist producer = new Artist("Yazzer G");
        DigitalProduct nft2 = new DigitalProduct("Reggaeton", track, albumA, producer);
        
        Order order1 = new Order();
        order1.agregarProducto(nft);
        order1.agregarProducto(nft2);
        
        order1.showOrder();
    }
}

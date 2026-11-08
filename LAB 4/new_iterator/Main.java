package new_iterator;

public class Main {
    public static void main(String[] args) {
        Track[] myTracks = {
            new Track("Tame Impala - Eventually"),
            new Track("Mr.Kitty - Scars"),
            new Track("The Garden - Freight Yard")
        };

        Playlist playlist = new Playlist(myTracks);
        Iterator<Track> it = playlist.getIterator();

        while (it.hasNext()) {
            Track track = it.next();
            System.out.println("Играет: " + track.getTitle());
        }
    }
}
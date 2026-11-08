package new_iterator;

public class Playlist {
    private Track[] tracks;
    public Playlist(Track[] tracks) { this.tracks = tracks; }
    
    public Iterator<Track> getIterator() {
        return new PlaylistIterator(tracks);
    }
}
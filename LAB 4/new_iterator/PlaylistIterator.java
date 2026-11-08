package new_iterator;

public class PlaylistIterator implements Iterator<Track> {
    private Track[] tracks;
    private int position = 0;

    public PlaylistIterator(Track[] tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean hasNext() {
        return position < tracks.length;
    }

    @Override
    public Track next() {
        if (hasNext()) {
            return tracks[position++];
        }
        throw new java.util.NoSuchElementException("Плейлист закончился");
    }
}
package Task3;

import java.util.ArrayList;
import java.util.List;

public class MMS {
    private List<MusicTrack> storage = new ArrayList<>();

    public void addMusicTrack(MusicTrack musicTrack) {
        storage.add(musicTrack);
    }

    public boolean removeMusicTrack(MusicTrack musicTrack) {
        return storage.remove(musicTrack);
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (MusicTrack track : storage) {
                System.out.println(track.getAuthor() + ", " + track.getTitle());
            }
        }
    }

    public int getNumberOfSongs() {
        return storage.size();
    }
}


package Task3;

public class MMSTester {
    public static void main(String[] args) {
        MusicTrack track1 = new MusicTrack();
        track1.setTitle("Intro");
        track1.setAuthor("Psychonaut 4");

        MusicTrack track2 = new MusicTrack();
        track2.setTitle("Enjoy The Silence");
        track2.setAuthor("Depeche Mode");

        MusicTrack track3 = new MusicTrack();
        track3.setTitle("Pneuma");
        track3.setAuthor("TOOL");

        MusicTrack track4 = new MusicTrack();
        track4.setTitle("Sober");
        track4.setAuthor("TOOL");

        MMS mms = new MMS();
        mms.addMusicTrack(track1);
        mms.addMusicTrack(track2);
        mms.addMusicTrack(track3);
        mms.addMusicTrack(track4);

        System.out.println("Number of songs in storage: " + mms.getNumberOfSongs());

        mms.removeMusicTrack(track1); // Removing the first track for testing

        System.out.println("Number of songs in storage after removal: " + mms.getNumberOfSongs());

        mms.printStorage();
    }
}




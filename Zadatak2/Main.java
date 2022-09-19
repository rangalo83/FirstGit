package Zadatak2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // U main-u napraviti jedan video player i dodati 3 video snimka. Za sve video snimke u main-u
        // prikazati nazive izdavackih kuca

        Author autor1 = new Author("Ime1", "Prezime1", "Publisher1");
        Author autor2 = new Author("Ime 2", "Prezime2", "Publisher2");

        Videos video1 = new Videos("Title1", "180", autor1);
        Videos video2 = new Videos("Title2", "150", autor2);
        Videos video3 = new Videos("Title3", "120", autor1);

        VideoPlayer videotrack = new VideoPlayer();
        videotrack.getVideoTrack().add(video1);
        videotrack.getVideoTrack().add(video2);
        videotrack.getVideoTrack().add(video3);

        for (int i = 0; i < videotrack.getVideoTrack().size(); i++){
            System.out.println(videotrack.getVideoTrack().get(i).getAuthor().getPublisher());
        }

    }
}
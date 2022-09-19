package Zadatak2;

import java.util.ArrayList;

public class VideoPlayer {

    //Napraviti klasu VideoPlayer koji sadrži listu video snimaka. Svaki video ima naziv, autora,
    // dužinu trajanja snimka. Svaki autor je opisan imenom, prezimenom i nazivom izdavačke kuće.
    // U main-u napraviti jedan video player i dodati 3 video snimka. Za sve video snimke u main-u
    // prikazati nazive izdavackih kuca


    private ArrayList<Videos> videoTrack = new ArrayList<Videos>();
    public VideoPlayer(){

    }

    public VideoPlayer(ArrayList<Videos> videoTrack) {
        this.videoTrack = videoTrack;
    }

    public ArrayList<Videos> getVideoTrack() {
        return videoTrack;
    }

    public void setVideoTrack(ArrayList<Videos> videoTrack) {
        this.videoTrack = videoTrack;
    }

    //public void publishers(ArrayList<Videos> videotrack, ){
        //for (int i = 0; i < videotrack.getVideoTrack().size(); i++){
          //  System.out.println(videotrack.getVideoTrack().get(i).getAuthor().getPublisher());
        //}
    }


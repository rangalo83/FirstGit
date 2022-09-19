package com.bootcamp.zadatak2;

/*
Napisati klasu SmartTV koja od podataka ima informaciju koje je marke,
da li je uključen ili ne (na početku je obavezno isključen), broj trenutnog kanala,
trenutnu jačinu zvuka (početno 0).
Obezbediti da korisnik moze iz main metode da upravlja radom dva SmartTV-a (Samsung, LG)
, menja kanale i jačinu zvuka. Promena kanala ima plus i minus tastere, a posebno imamo
i +/- tastere za pojačavanje/smanjivanje jačine zvuka.

 */
public class SmartTV {
    private String brand;
    private boolean on = false;
    private int channel;
    private int volume = 0;

    private static int limit = 100;

    public SmartTV() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }


    public void turnOnOff() {
        this.on = !this.on;
        /*
            if(this.on == true){
                this.on = false;
            }else{
                this.on = true;
            }

         */
    }

    public void channelUp() {
        if (this.on == true && channel < limit) {
            channel++;
        } else if (this.on == true) {
            channel = 1;
        }
    }

    public void channelDown() {
        if (this.on == true && channel > 1) {
            channel--;
        } else if (this.on == true) {
            channel = limit;
        }
    }

    public void volumeUp() {
        if (this.on == true && volume < limit) {
            volume++;
        }
    }

    public void volumeDown() {
        if (this.on == true && volume > 0) {
            volume--;
        }
    }

    @Override
    public String toString() {
        String text = this.brand + " ";

        if (on == true) {
            text += "turned on";
        } else {
            text += "turned off";
        }
        text += " " + channel + " " + volume;

        return text;
    }
}

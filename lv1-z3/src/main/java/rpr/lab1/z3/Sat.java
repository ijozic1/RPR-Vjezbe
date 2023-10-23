package rpr.lab1.z3;

public class Sat {
    private int sati=0, minute=0, sekunde=0;

    public Sat(int h, int min, int sec){
        this.sati=h;
        this.minute=min;
        this.sekunde=sec;
    }

    //Pisanje this. prije svakog atributa ili metode nije obavezno
    //ali je zbog citljivosti preporucljivo
    public void Postavi(int h, int min, int sec){
        this.sati=h;
        this.minute=min;
        this.sekunde=sec;
    }

    public void Sljedeci(){
        this.sekunde++;
        if(this.sekunde==60){
            this.sekunde=0; this.minute++;
        }
        if(this.minute==60){
            this.minute=0; this.sati++;
        }
        if(this.sati==24) this.sati=0;
    }

    public void Prethodni(){
        this.sekunde --;
        if(this.sekunde==-1){
            this.sekunde=59; this.minute--;
        }
        if(this.minute==-1){
            this.minute=59; this.sati--;
        }
        if(this.sati==-1) this.sati=23;
    }

    public void PomjeriZa(int pomak){
        if(pomak>0)
            for(int i=0; i<pomak; i++) this.Sljedeci();
        else
            for(int i=0; i<-pomak; i++) this.Prethodni();
    }

    public int DajSate(){ return this.sati;}
    public int DajMinute(){return this.minute;}
    public int DajSekunde(){return this.sekunde;}

    public void Ispisi() {
        System.out.println(this.sati+":"+this.minute+":"+this.sekunde);
    }
}

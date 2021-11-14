package live;
import music.*;
import music.string.Veena;
import music.wind.Saxophone;
class test1 {
    public static void main(String[] args){
        Veena obj=new Veena();
        obj.play();
        Saxophone obj1=new Saxophone();
        obj1.play();
        Playable[] obj2=new Playable[2];
        obj2[0]=obj;
        obj2[1]=obj1;
        obj2[0].play();
        obj2[1].play();
    }
}

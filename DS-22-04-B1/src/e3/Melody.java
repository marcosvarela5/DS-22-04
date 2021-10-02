package e3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Melody {

    private Notes note;
    private Accidentals accidental;
    private float time;
    private float duration;

    List<Notes> notesList = new ArrayList<>();
    List<Accidentals> accidentalsList = new ArrayList<>();
    List<Float> timeList = new ArrayList<>();

    public Melody(){
    }

    public void addNote(Notes note, Accidentals accidental, float time){

    }

    public Notes getNote(int index){
        return notesList.get(index);
    }

    public Accidentals getAccidental(int index){
        return accidentalsList.get(index);
    }

    public float getTime(int index){
        return timeList.get(index);
    }

    public int size(){
        return notesList.size();
    }

    public float getDuration(){
        return 0;
    }




}

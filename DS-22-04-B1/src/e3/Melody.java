package e3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Melody {

    List<Notes> notesList = new ArrayList<>();
    List<Accidentals> accidentalsList = new ArrayList<>();
    List<Float> timeList = new ArrayList<>();

    public Melody() {
    }

    public void addNote(Notes note, Accidentals accidental, float time) {
        notesList.add(note);
        accidentalsList.add(accidental);
        timeList.add(time);
    }

    public Notes getNote(int index) {
        return notesList.get(index);
    }

    public Accidentals getAccidental(int index) {
        return accidentalsList.get(index);
    }

    public float getTime(int index) {
        return timeList.get(index);
    }

    public int size() {
        return notesList.size();
    }

    public float getDuration() {
        float sum = 0;
        for (Float aFloat : timeList) {
            sum += aFloat;
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        int i;
        StringBuilder melody = new StringBuilder();
        for(i = 0; i< notesList.size(); i++){
            melody.append("Melody: ").append(notesList.get(i).toString()).append(accidentalsList.get(i).toString())
                    .append("(").append(timeList.get(i).toString()).append(")");
        }
        melody.append(" ");
        return melody.toString();
    }

    public static void main(String[] args) {
        Melody melody = new Melody();
        melody.addNote(Notes.DO, Accidentals.Flat, 4);
        String s = melody.toString();
        System.out.println(s);
    }
}


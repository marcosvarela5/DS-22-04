package e3;

import java.util.ArrayList;
import java.util.List;

public class Melody {

    List<Notes> notesList = new ArrayList<>();
    List<Accidentals> accidentalsList = new ArrayList<>();
    List<Float> timeList = new ArrayList<>();

    public Melody() {
    }

    public void addNote(Notes note, Accidentals accidental, float time) {

        if(note == null) throw new IllegalArgumentException("Note can't be a null value");
        if(accidental == null) throw new IllegalArgumentException("Accidental can't be a null value");
        if(time <= 0) throw new IllegalArgumentException("Time has to be bigger than 0");
        notesList.add(note);
        accidentalsList.add(accidental);
        timeList.add(time);
    }

    public Notes getNote(int index) {
        if(index >= notesList.size() || index < 0) throw new IllegalArgumentException("This index does not exist");
        return notesList.get(index);
    }

    public Accidentals getAccidental(int index) {
        if(index >= accidentalsList.size() || index < 0) throw new IllegalArgumentException("This index does not exist");
        return accidentalsList.get(index);
    }

    public float getTime(int index) {
        if(index >= timeList.size() || index < 0) throw new IllegalArgumentException("This index does not exist");
        return timeList.get(index);
    }

    public int size() { //El tamaño de cualquier lista
        return notesList.size();
    }

    public float getDuration() { //Se suman los elementos de la lista de tiempo
        float sum = 0;
        for (Float aFloat : timeList) {
            sum += aFloat;
        }
        return sum;
    }

    @Override
    public int hashCode() { //Se utiliza el hash 31, se le asigna el mismo múltiplo a las notas equivalentes y se le suma uno
        int result = 0;
        for(int i = 0; i< notesList.size(); i++){
            switch (notesList.get(i)){
                case DO -> {
                    if(getAccidental(i) == Accidentals.SHARP) result = 1 + 31;
                    if(getAccidental(i) == Accidentals.NATURAL) result = 1 + 31 * 2;
                    if(getAccidental(i) == Accidentals.FLAT) result = 1 + 31 * 3;
                }
                case RE -> {
                    if(getAccidental(i) == Accidentals.FLAT) result = 1 + 31;
                    if(getAccidental(i) == Accidentals.SHARP) result = 1 + 31 * 4;
                    if(getAccidental(i) == Accidentals.NATURAL) result = 1 + 31 * 5;
                }
                case MI -> {
                    if(getAccidental(i) == Accidentals.FLAT) result = 1 + 31 * 4;
                    if(getAccidental(i) == Accidentals.SHARP) result = 1 + 31 * 6;
                    if(getAccidental(i) == Accidentals.NATURAL) result = 1 + 31 * 7;
                }
                case FA -> {
                    if(getAccidental(i) == Accidentals.FLAT) result = 1 + 31 * 7;
                    if(getAccidental(i) == Accidentals.SHARP) result = 1 + 31 * 8;
                    if(getAccidental(i) == Accidentals.NATURAL) result = 1 + 31 * 6;
                }
                case SOL -> {
                    if(getAccidental(i) == Accidentals.FLAT) result = 1 + 31 * 8;
                    if(getAccidental(i) == Accidentals.SHARP) result = 1 + 31 * 9;
                    if(getAccidental(i) == Accidentals.NATURAL) result = 1 + 31 * 10;
                }
                case LA -> {
                    if(getAccidental(i) == Accidentals.FLAT) result = 1 + 31 * 9;
                    if(getAccidental(i) == Accidentals.SHARP) result = 1 + 31 * 11;
                    if(getAccidental(i) == Accidentals.NATURAL) result = 1 + 31 * 12;
                }
                case SI -> {
                    if(getAccidental(i) == Accidentals.FLAT) result = 1 + 31 * 11;
                    if(getAccidental(i) == Accidentals.SHARP) result = 1 + 31 * 2;
                    if(getAccidental(i) == Accidentals.NATURAL) result = 1 + 31 * 3;
                }

            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        int i;
        Melody melody = (Melody) o;
        if(o == null) return false;
        if(this == o) return true;
        if(this.size() != ((Melody) o).size()) return false;
        if(this.getClass() != o.getClass()) return false;
        if(this.size() == 0 && ((Melody) o).size() == 0) return true;

        if(this.size() > 0 && this.size() == ((Melody) o).size()) {
            for (i = 0; i < melody.size(); i++) {

                if ((this.notesList.get(i) == Notes.DO || ((Melody) o).notesList.get(i) == Notes.DO
                        && this.accidentalsList.get(i) == Accidentals.SHARP || ((Melody) o).accidentalsList.get(i) == Accidentals.SHARP) &&
                        (((Melody) o).notesList.get(i) == Notes.RE && this.accidentalsList.get(i) == Accidentals.FLAT))
                    return true;


                if ((this.notesList.get(i) == Notes.RE && this.accidentalsList.get(i) == Accidentals.SHARP) &&
                        (((Melody) o).notesList.get(i) == Notes.MI && this.accidentalsList.get(i) == Accidentals.FLAT))
                    return true;


                if ((this.notesList.get(i) == Notes.MI && this.accidentalsList.get(i) == Accidentals.NATURAL) &&
                        (((Melody) o).notesList.get(i) == Notes.FA && this.accidentalsList.get(i) == Accidentals.FLAT))
                    return true;


                if ((this.notesList.get(i) == Notes.MI && this.accidentalsList.get(i) == Accidentals.SHARP) &&
                        (((Melody) o).notesList.get(i) == Notes.FA && this.accidentalsList.get(i) == Accidentals.NATURAL))
                    return true;


                if ((this.notesList.get(i) == Notes.FA && this.accidentalsList.get(i) == Accidentals.SHARP) &&
                        (((Melody) o).notesList.get(i) == Notes.SOL && this.accidentalsList.get(i) == Accidentals.FLAT))
                    return true;


                if ((this.notesList.get(i) == Notes.SOL && this.accidentalsList.get(i) == Accidentals.SHARP) &&
                        (((Melody) o).notesList.get(i) == Notes.LA && this.accidentalsList.get(i) == Accidentals.FLAT))
                    return true;


                if ((this.notesList.get(i) == Notes.LA && this.accidentalsList.get(i) == Accidentals.SHARP) &&
                        (((Melody) o).notesList.get(i) == Notes.SI && this.accidentalsList.get(i) == Accidentals.FLAT))
                    return true;


                if ((this.notesList.get(i) == Notes.SI && this.accidentalsList.get(i) == Accidentals.NATURAL) &&
                        (((Melody) o).notesList.get(i) == Notes.DO && this.accidentalsList.get(i) == Accidentals.FLAT))
                    return true;


                if ((this.notesList.get(i) == Notes.SI && this.accidentalsList.get(i) == Accidentals.SHARP) &&
                        (((Melody) o).notesList.get(i) == Notes.DO && this.accidentalsList.get(i) == Accidentals.NATURAL))
                    return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        int i;
        StringBuilder melody = new StringBuilder(); //utilizando StringBuilder no peta
        for(i = 0; i< notesList.size(); i++){
            melody.append(notesList.get(i).toString()).append(accidentalsList.get(i).toString())
                    .append("(").append(timeList.get(i).toString());
                    if(i < notesList.size() - 1) {
                        melody.append(") ");
                    }
                    else
                        melody.append(")");
        }
        return melody.toString();
    }
}


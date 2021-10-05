package e3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Melody {

    List<Notes> notesList = new ArrayList<>();
    List<Accidentals> accidentalsList = new ArrayList<>();
    List<Float> timeList = new ArrayList<>();

    public Melody() {
    }

    public void addNote(Notes note, Accidentals accidental, float time) {

        if(note == null) throw new IllegalArgumentException("Note can't be a null value");
        if(accidental == null) throw new IllegalArgumentException("Accidental can't be a null value");
        if(time <= 0) throw new IllegalArgumentException("Time has to be > 0");
        notesList.add(note);
        accidentalsList.add(accidental);
        timeList.add(time);
    }

    public Notes getNote(int index) {
        if(index >= notesList.size()) throw new IllegalArgumentException("This index does not exist");
        return notesList.get(index);
    }

    public Accidentals getAccidental(int index) {
        return accidentalsList.get(index);
    }

    public float getTime(int index) {
        return timeList.get(index);
    }

    public int size() { //EL TAMAÑO DE CUALQUIERA DE LAS LISTAS YA Q NO SE PUEDE AÑADIR UN ELEMENTO SIN UNO DE LOS PARAMETROS
        return notesList.size();
    }

    public float getDuration() { //SIMPLEMENTE SE SUMAN LOS ELEMENTOS DE LA LISTA DE TIEMPO
        float sum = 0;
        for (Float aFloat : timeList) {
            sum += aFloat;
        }
        return sum;
    }

    @Override
    public int hashCode() {
            int result = notesList.hashCode();
            result = 31 * result + accidentalsList.hashCode();
            result = 31 * result + timeList.hashCode();
            return result;
        }

    @Override
    public boolean equals(Object o) {
        int i;
        if (o == null) return false;
        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;
        if(this.size() != ((Melody) o).size()) return false;
        if(this.size() == 0 && ((Melody) o).size() == 0) return true;

        Melody melody = (Melody) o;

        for (i = 0; i < melody.size(); i++) {
            if ((this.notesList.get(i).equals(Notes.DO) && this.accidentalsList.get(i).equals(Accidentals.SHARP)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.RE) && this.accidentalsList.get(i).equals(Accidentals.FLAT)))
                return true;

            if ((this.notesList.get(i).equals(Notes.RE) && this.accidentalsList.get(i).equals(Accidentals.SHARP)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.MI) && this.accidentalsList.get(i).equals(Accidentals.FLAT)))
                return true;

            if((this.notesList.get(i).equals(Notes.MI) && this.accidentalsList.get(i).equals(Accidentals.NATURAL)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.FA) && this.accidentalsList.get(i).equals(Accidentals.FLAT)))
                return true;

            if((this.notesList.get(i).equals(Notes.MI) && this.accidentalsList.get(i).equals(Accidentals.SHARP)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.FA) && this.accidentalsList.get(i).equals(Accidentals.NATURAL)))
                return true;

            if((this.notesList.get(i).equals(Notes.FA) && this.accidentalsList.get(i).equals(Accidentals.SHARP)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.SOL) && this.accidentalsList.get(i).equals(Accidentals.FLAT)))
                return true;

            if((this.notesList.get(i).equals(Notes.SOL) && this.accidentalsList.get(i).equals(Accidentals.SHARP)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.LA) && this.accidentalsList.get(i).equals(Accidentals.FLAT)))
                return true;

            if((this.notesList.get(i).equals(Notes.LA) && this.accidentalsList.get(i).equals(Accidentals.SHARP)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.SI) && this.accidentalsList.get(i).equals(Accidentals.FLAT)))
                return true;

            if((this.notesList.get(i).equals(Notes.SI) && this.accidentalsList.get(i).equals(Accidentals.NATURAL)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.DO) && this.accidentalsList.get(i).equals(Accidentals.FLAT)))
                return true;

            if((this.notesList.get(i).equals(Notes.SI) && this.accidentalsList.get(i).equals(Accidentals.SHARP)) &&
                    (((Melody) o).notesList.get(i).equals(Notes.DO) && this.accidentalsList.get(i).equals(Accidentals.NATURAL)))
                return true;
        }
        return false;
    }



    @Override
    public String toString() {
        int i;
        StringBuilder melody = new StringBuilder(); //HAY QUE USAR STRINGBUILDER PORQUE CON RETURN PETA EL BUCLE!!
        for(i = 0; i< notesList.size(); i++){
            melody.append(notesList.get(i).toString()).append(accidentalsList.get(i).toString())
                    .append("(").append(timeList.get(i).toString()).append(") ");

        }
        return melody.toString();
    }

    /* DANGER: OUTPUT TEST ZONE */
    /*public static void main(String[] args) {
        Melody melody = new Melody();
        melody.addNote(Notes.DO, Accidentals.Flat, 4);
        melody.addNote(Notes.RE, Accidentals.Sharp, 3);
        String s = melody.toString();
        System.out.println(s);
    }*/
}


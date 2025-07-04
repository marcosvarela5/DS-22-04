package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {

    Member harry;
    Member hermione;
    Member casper;
    Member severus;
    Member janitor;
    Member lazyJanitor;
    Member powerRanger;
    Member lazyPowerRanger;
    Member profeHistoria;
    List<Member> workerList;

    @BeforeEach
    void setUp() {
        harry = new Resident.Student("Harry", "Potter", 18, 2, House.GRYFFINDOR);
        hermione = new Resident.Student("Hermione", "Granger", 18, 2, House.SLYTHERIN);
        casper = new Resident.Ghost("Casper", "Mágico", 180, 3, House.HUFFLEPUFF);
        severus = new Worker.Teacher("Severus", "Snape", 40, 3, Subject.DEFENSE);
        janitor = new Worker.Janitor("Carlos", "Latre", 27, 2, true);
        lazyJanitor = new Worker.Janitor("Pepe", "Viyuela", 45, 1, false);
        powerRanger = new Worker.Ranger("Guarda", "Bosques", 30, 3, true);
        lazyPowerRanger = new Worker.Ranger("Guardabosques", "Vago", 30, 3, false);
        profeHistoria = new Worker.Teacher("Emerildo", "Palacios", 40, 2, Subject.HISTORY);
    }

    @Test
    void calculateReward(){
        assertEquals(180, harry.calculateReward());
        assertEquals(360, hermione.calculateReward());
        assertEquals(240, casper.calculateReward());
        assertEquals(112.5, severus.calculateReward());
        assertEquals(130, janitor.calculateReward());
        assertEquals(65, lazyJanitor.calculateReward());
        assertEquals(225, powerRanger.calculateReward());
        assertEquals(225, lazyPowerRanger.calculateReward());
        assertEquals(100, profeHistoria.calculateReward());
    }

    @Test
    void calculateSalary(){
        assertThrows(IllegalArgumentException.class, () -> harry.calculateSalary());
        assertThrows(IllegalArgumentException.class, () -> hermione.calculateSalary());
        assertThrows(IllegalArgumentException.class, () -> casper.calculateSalary());
        assertEquals(500, severus.calculateSalary());
        assertEquals(160, janitor.calculateSalary());
        assertEquals(150, lazyJanitor.calculateSalary());
        assertEquals(180, powerRanger.calculateSalary());
        assertEquals(170, lazyPowerRanger.calculateSalary());
        assertEquals(200, profeHistoria.calculateSalary());
    }

    @Test
    void imprimirSalarios(){
        workerList = new ArrayList<>();
        workerList.add(harry);
        assertThrows(IllegalArgumentException.class, () -> Colegio.imprimirSalarios(workerList));
        workerList.remove(harry);
        workerList.add(casper);
        assertThrows(IllegalArgumentException.class, () -> Colegio.imprimirSalarios(workerList));
        workerList.remove(casper);
        assertEquals("Severus Snape(Docente de Defensa): 500 galeones\n", severus.toStringSalary());
        assertEquals("Carlos Latre(Conserje): 160 galeones\n", janitor.toStringSalary());
        assertEquals("Pepe Viyuela(Conserje): 150 galeones\n", lazyJanitor.toStringSalary());
        assertNull(harry.toStringSalary());
        assertNull(casper.toStringSalary());
    }

    @Test
    void imprimirRecompensa(){
        assertEquals("Hermione Granger(Estudiante de Slytherin,2 horrocruxes): " +
                "360.0 galeones\n", hermione.toStringReward());
        assertEquals("Casper Mágico(Fantasma de Hufflepuff,3 horrocruxes): " +
                "240.0 galeones\n", casper.toStringReward());
        assertEquals("Severus Snape(Docente de Defensa,3 horrocruxes): " +
                "112.5 galeones\n", severus.toStringReward());
            assertEquals("Emerildo Palacios(Docente de Historia,2 horrocruxes): " +
                "100.0 galeones\n", profeHistoria.toStringReward());

    }

    @Test
    void gasto(){
        workerList = new ArrayList<>();
        workerList.add(harry);
        workerList.add(casper);
        workerList.add(severus);
        workerList.add(janitor);
        assertThrows(IllegalArgumentException.class, () -> Colegio.gasto(workerList));
        workerList.remove(harry);
        workerList.remove(casper);
        assertEquals(660, Colegio.gasto(workerList));
    }
}
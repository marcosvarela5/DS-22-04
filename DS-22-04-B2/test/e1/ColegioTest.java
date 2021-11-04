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
    List<Member> workerList;

    @BeforeEach
    void setUp() {
        harry = new Resident.Student("Harry", "Potter", 18, 2, House.GRYFFINDOR);
        hermione = new Resident.Student("Hermione", "Granger", 18, 2, House.SLYTHERIN);
        casper = new Resident.Ghost("Casper", "El Fantasma", 180, 3, House.HUFFLEPUFF);
        severus = new Worker.Teacher("Severus", "Snape", 40, 3, Subject.DEFENSE);
        janitor = new Worker.Janitor("Carlos", "Latre", 27, 2, true);
        lazyJanitor = new Worker.Janitor("Pepe", "Viyuela", 45, 1, false);
        powerRanger = new Worker.Ranger("Guarda", "Bosques", 30, 3, true);
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
    }

    @Test
    void calculateSalary(){
        assertThrows(IllegalArgumentException.class, () -> harry.calculateSalary());
        assertThrows(IllegalArgumentException.class, () -> hermione.calculateSalary());
        assertEquals(500, severus.calculateSalary());
        assertEquals(160, janitor.calculateSalary());
        assertEquals(150, lazyJanitor.calculateSalary());
        assertEquals(180, powerRanger.calculateSalary());
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
        workerList.add(severus);
        assertEquals("Severus Snape(Docente de Defensa): 500 galeones\n", severus.toStringSalary());
    }
}
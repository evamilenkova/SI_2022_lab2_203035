import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String...elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void functionEveryStatementAndEveryBranch() {

        IllegalArgumentException exception;
        // First
        exception=assertThrows(IllegalArgumentException.class,()->SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        //Second

        exception=assertThrows(IllegalArgumentException.class, ()->SILab2.function(createList("0", "#", "0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        //Third

        List<String> finalList= createList("#", "0", "#", "0", "#", "#", "0", "0", "#");
        List<String> result= createList("#", "3", "#", "2", "#", "#", "0", "2", "#");

        assertEquals(result,SILab2.function(finalList));


    }
    @AfterAll
    static void functionAfterAll(){
        System.out.println("All tests executed");
    }
}
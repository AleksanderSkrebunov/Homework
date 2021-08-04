package groupID.FirstMaven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class OperationTest {
    @ParameterizedTest
    @MethodSource("whatASingerTest")
    public void testwhatASinger(Singers singer, String answer){
        Operation o = new Operation();
        Singers singer1 = new Singers("Nico", 1);
        assertEquals(singer1, o.whatASinger("Nico"));
    }

    public static Stream<Arguments> whatASingerTest(){
        //Singers singer1 = new Singers("Nico", 1);
        Singers singer2 = new Singers("Zatochka", 1);
        Singers singer3 = new Singers("DU", 1);
        return Stream.of(
                arguments(singer2,"Zatochka"),
                arguments(singer3,"DU"));
    }
}
package ru.mulyukin.java.basic.homework.part2.homework18.test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.mulyukin.java.basic.homework.part2.homework18.WorkClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class MaainApplyTest {


@ParameterizedTest
@MethodSource("testArray")
    public void arrayTest(WorkClass workClass, boolean isFirstBoxBigger) {
        Assertions.assertEquals(workClass, isFirstBoxBigger);
    }
    public static Stream<Arguments> testArray() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new WorkClass(1, 2),true));
        out.add(Arguments.arguments(new WorkClass(1, 1),false));
        out.add(Arguments.arguments(new WorkClass(1, 3),false));
        out.add(Arguments.arguments(new WorkClass(1, 2, 2, 1),true));
        return out.stream();
    }



}

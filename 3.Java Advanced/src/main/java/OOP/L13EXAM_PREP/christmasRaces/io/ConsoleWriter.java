package OOP.L13EXAM_PREP.christmasRaces.io;

import OOP.L13EXAM_PREP.christmasRaces.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    @Override
    public void writeLine(String text) {
        System.out.println(text);
    }
}

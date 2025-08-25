package edu.javacore.drawingnumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        DrawingNumbers(r.readLine());
    }

    public static final String[][] STRINGS = new String[][]{{" @@@@ ","@@  @@","@@  @@","@@  @@"," @@@@ "},
                                                            {"  @@  "," @@@  ","@ @@  ","  @@  ","@@@@@@"},
                                                            {" @@@@ ","@   @@","  @@@ "," @@   ","@@@@@@"},
                                                            {"@@@@@ ","    @@","@@@@@ ","    @@","@@@@@ "},
                                                            {"@@  @@","@@  @@","@@@@@@","    @@","    @@"},
                                                            {"@@@@@@","@@    ","@@@@@ ","    @@","@@@@@ "},
                                                            {" @@@@@","@@    ","@@@@@ ","@@  @@"," @@@@ "},
                                                            {"@@@@@@","   @@ ","  @@  "," @@   ","@@    "},
                                                            {" @@@@ ","@@  @@"," @@@@ ","@@  @@"," @@@@ "},
                                                            {" @@@@@","@@  @@"," @@@@@","    @@"," @@@@ "}};

    public static void DrawingNumbers(String numbers){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++){
            for(String num : numbers.split("")){
                builder.append(STRINGS[Integer.parseInt(num)][i]);
                builder.append(" ");
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}

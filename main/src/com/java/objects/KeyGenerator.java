package com.java.objects;

import java.util.Random;

public class KeyGenerator {
    private Random random = new Random();
    int maxLower = 122;
    int minLower = 97;
    int maxUpper = 90;
    int minUpper = 65;
    int maxNumber = 57;
    int minNumber = 48;
    String result = "";

    private char array =
    public String genKey() {

        char a = (char)(minLower + random.nextInt(maxLower - minLower + 1));
        char b = (char)(minUpper + random.nextInt(maxUpper - minUpper + 1));
        char c = (char)(minNumber + random.nextInt(maxNumber - minNumber + 1));

        result = result + a + b + c;

        return result;
    }
}

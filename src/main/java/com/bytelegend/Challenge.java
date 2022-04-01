package com.bytelegend;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("A is valid hex character: " + isValidHexCharacter('A'));
        System.out.println("0 is valid hex character: " + isValidHexCharacter('0'));
        System.out.println("G is valid hex character: " + isValidHexCharacter('G'));
    }

    /**
     * A valid character is: character 0-9 and character A/a/B/b/C/c/D/d/E/e/F/f (case-insensitive).
     *
     * <p>If the given character is a valid hex character"," return `true`"," otherwise return `false`.
     */
    public static boolean isValidHexCharacter(char ch) {
        List<String> hex = Arrays.asList(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"});
        return hex.contains(String.valueOf(ch).toLowerCase(Locale.ROOT));
    }
}

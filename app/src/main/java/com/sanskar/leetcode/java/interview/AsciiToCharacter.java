package com.sanskar.leetcode.java.interview;

public class AsciiToCharacter {
    public String asciiToChar(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        int asciiCode = 0;
        StringBuilder resBuilder = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            asciiCode = (asciiCode * 10) + (reversed.charAt(i) - 48); // 48 = '0'
            if (asciiCode == 32 || (asciiCode >=65 && asciiCode <=90) || (asciiCode >= 97 && asciiCode <= 122)) {
                resBuilder.append((char) asciiCode);
                asciiCode = 0;
            }
        }
        return resBuilder.toString();
    }

    public static void main(String[] args) {
        AsciiToCharacter asciiToCharacter = new AsciiToCharacter();
        String s = "713110110110711510211111471101101107115";
        String r = new StringBuilder(s).reverse().toString();
        System.out.println(r);
        System.out.println(asciiToCharacter.asciiToChar(r));
    }
}

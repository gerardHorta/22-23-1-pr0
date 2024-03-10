package edu.uoc.ds.adt;

public class PR0CypherCaesarArray {
    private String message;

    public PR0CypherCaesarArray(String message) {
        this.message = message;
    }

    public char[] cypher2Array(int shift) {
        char[] originalChars = message.toCharArray();
        char[] encryptedChars = new char[originalChars.length];

        for (int i = 0; i < originalChars.length; i++) {
            if (Character.isLetter(originalChars[i])) {
                char base = Character.isLowerCase(originalChars[i]) ? 'a' : 'A';
                encryptedChars[i] = (char) ((originalChars[i] - base + shift) % 26 + base);
            } else {
                encryptedChars[i] = originalChars[i]; // Mantenemos los caracteres que no son letras
            }
        }

        return encryptedChars;
    }

    public String cypher(int shift) {
        return new String(cypher2Array(shift));
    }
}

package first;

public class UnByteInverse extends MyCipher {

    public char Method(char originalchar) {

        int tmp = (int) originalchar >> 1;
        char secretchar = (char) tmp;
        return secretchar;
    }
}
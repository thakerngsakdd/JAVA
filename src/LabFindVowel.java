public class LabFindVowel {
    static char[] vowel = { 'A', 'E', 'I', 'O', 'U' };

    public static void main(String[] args) {
        for (char startVowel : vowel) {
            System.out.print(startVowel + " ");
        }
        System.out.println();
        convert();
    }

    public static void convert() {
        int count = vowel.length - 1;
        for (char startVowel : vowel) {
            System.out.print(vowel[count] + " ");
            count--;
        }
        System.out.println();
        count = 0;
    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Marta", "Alex"};
        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.print("-----------------------\n");
        for (String obj : vect){
            System.out.printf(obj+"\n");
        }
    }
}
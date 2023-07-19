import java.util.Scanner;
public class ReadString {
    public static void main (String[] args){
        System.out.print("Boa my g, iae como voce ta: ");
        Scanner in = new Scanner(System.in);
        String userName = null;
        userName = in.nextLine();
        System.out.println("E nos falou, " + userName);
    }//Fim do romeu
}//Fim do lindo ReadString
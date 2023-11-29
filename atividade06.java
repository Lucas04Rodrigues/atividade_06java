package atividadeprof;
import java.util.Scanner;
public class atividade06 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int respostasPositivas = 0;
	        respostasPositivas += pergunta("Telefonou para a vitima?");
	        respostasPositivas += pergunta("Esteve no local do crime?");
	        respostasPositivas += pergunta("Mora perto da vitima?");
	        respostasPositivas += pergunta("Devia para a vitima?");
	        respostasPositivas += pergunta("Já trabalhou com a vitima?");
	        if (respostasPositivas == 2) System.out.println("Suspeita");
	        else if (respostasPositivas >= 3 && respostasPositivas <= 4) System.out.println("Cumplice");
	        else if (respostasPositivas == 5) System.out.println("Assassino");
	        else System.out.println("Inocente");

	        scanner.close();
	    }
	    private static int pergunta(String pergunta) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print(pergunta + " (S/N): ");
	        return (scanner.next().equalsIgnoreCase("S")) ? 1 : 0;
	    }
	}



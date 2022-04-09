import java.rmi.registry.*;
import java.util.Scanner;

public class HelloClient {
	public static void main(String[] args) {
		try {
			// Procura o registro do RMI no Servidor
			// Se o servidor estiver em outro host basta substituir pelo seu IP
			Registry registry = LocateRegistry.getRegistry("localhost");

			// Procura a stub do servidor
			Hello stub= (Hello) registry.lookup("Servidor");

			// Chama o método do servidor e imprime a mensagem
			System.out.println("Invocando metodo do servidor");
			String msg = stub.hello();
			System.out.println("Mensagem retornada pelo Servidor: " + msg); 
                        float a,b;
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Digita O primeiro numero: ");
                        a = sc.nextFloat();
                        System.out.println("Digita O segundo numero: ");
                        b = sc.nextFloat();
                        System.out.println("O numeros somados resulta em: "+ stub.multiplicacao(a, b));
                        
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
}



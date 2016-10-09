package javaCC;

public class Main {
	public static void main(String[] args) {
            System.out.println("Digite letras e numeros");
            System.out.print("e um ponto-e-virgula para finalizar: ");
            Analisador analisador = new Analisador(System.in);
            try {
                  analisador.processa();
            } catch (Exception e) {
                  System.out.println("Ocorreu um erro.");
                  System.out.println(e.getMessage());
                  e.printStackTrace();
            }
      }
}
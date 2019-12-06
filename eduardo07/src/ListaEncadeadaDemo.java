public class ListaEncadeadaDemo {
    public static void main(String[] args) {
 ListaEncadeada1 lista = new ListaEncadeada1();
 lista.addInicio("Maçã", 1);
 lista.addInicio("Bananas", 2);
 lista.addInicio("Melão", 3);
 System.out.println("A lista tem "+lista.tamanho()

+" nós");
 lista.imprimeLista();
 if (lista.contem("Melão"))

System.out.println("Melão está na lista.");

else

System.out.println("Melão não está na lista.");
 lista.excluiNoHead();
 if (lista.contem("Melão"))

System.out.println("Melão está na lista");

else

System.out.println("Melão não está na lista");
 while (lista.excluiNoHead());
 System.out.println("Início da lista: ");
 lista.imprimeLista();
 System.out.println("Fim da lista.");
 }
}
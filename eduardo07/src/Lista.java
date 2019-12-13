public class Lista {
 
    private No inicio;
    private No fim;
   
    public Lista(){
        inicializa();
    }
   
  public void inicializa(){
        inicio = null;
        fim = null;
       
    }
 
  public void exibeLista(){
      No aux;
      aux = inicio;
     
        while(aux!=null){
            System.out.println(aux.getPessoa());
            aux = aux.getProx();
           
        }
  }
 
  public void insereNoFim(Pessoa p){
     
      No lista = new No (inicio,null,p);
     
        if(inicio == null){
            inicio = fim = lista;
        } else {
            fim.setProx(lista);
            fim = lista;
       }
    }
  }
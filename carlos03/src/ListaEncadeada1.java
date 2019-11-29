public class ListaEncadeada1 {
    private No1 head;
 public ListaEncadeada1(){
 head = null;
 }

 public void addInicio (String nomeItem, int contItem){

head = new No1(nomeItem, contItem, head);
 }

 public boolean excluiNoHead(){

if (head != null){
 head = head.getLink();
 return true;
 }
 else

return false;
 }
 public int tamanho(){
 int cont = 0;
 No1 posicao = head;
 while (posicao != null){//o último nó é indicado pelo valor nulo.
 cont++;
 posicao = posicao.getLink();
 }
 return cont;
 }
 public boolean contem(String item){
 return (procura(item) != null);
 }
 private No1 procura(String alvo){
 No1 posicao = head;
 String posicaoItem;
 while (posicao != null){
 posicaoItem = posicao.getItem();
 if (posicaoItem.equals(alvo))
 return posicao;
 posicao = posicao.getLink();
 }
 return null;
 }
 public void imprimeLista(){
 No1 posicao = head;
 while (posicao != null){

System.out.println(posicao.getItem()+" "

+ posicao.getCont());

posicao = posicao.getLink();


 }
}
}

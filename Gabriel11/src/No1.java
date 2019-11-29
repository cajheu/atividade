public class No1 {
    private String item;
    private int cont;
    private No1 link;
    
public No1(){
    link = null;
    item = null;
    cont = 0;
}
public No1(String novoItem, int novoCont, No1 valorLink){
setDado(novoItem, novoCont);
link = valorLink;
}
public void setDado(String novoItem, int novoCont){

    item = novoItem;

    cont = novoCont;
}
public void setLink(No1 novoLink){

    link = novoLink;
}
public String getItem(){

    return item;
}
public int getCont(){

    return cont;
}
public No1 getLink(){

    return link;
}
    }
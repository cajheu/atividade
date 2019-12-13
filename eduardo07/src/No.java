public class No {
   
        private No ant;
        private No prox;
        private Pessoa p;
     
   
    No(No ant, No prox, Pessoa P){
       
      this.prox = prox;
      this.ant = ant;
      this.p = p;
     
       
    }
   
    public No getAnt() { return ant; }
    public No getProx() { return prox; }
    public void setAnt(No p_ant) { ant=p_ant; }
    public void setProx(No p_prox) { prox=p_prox; }
    public Pessoa getPessoa(){ return p;}
    public void setPessoa(Pessoa p){this.p = p;}
       
    }
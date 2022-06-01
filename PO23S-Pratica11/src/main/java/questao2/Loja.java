package questao2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    List<Produto> list= new ArrayList<>();
    
    public void adicionar(Produto p){
        list.add(p);
    }
    
    public Produto getProdutoMaisCaro(){
        Produto maior = list.get(0);
        for(int i=1; i<list.size(); i++){
            if(list.get(i).getPreco() > maior.getPreco())
                maior = list.get(i);
        }
        return maior;
    }
    
    public Produto getProdutoMenosCaro(){
        Produto menor = list.get(0);
        for(int i=1; i<list.size(); i++){
            if(list.get(i).getPreco() < menor.getPreco())
                menor = list.get(i);
        }
        return menor;
    }
}

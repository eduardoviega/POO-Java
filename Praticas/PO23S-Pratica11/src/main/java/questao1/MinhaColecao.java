package questao1;

import java.util.ArrayList;
import java.util.List;

public class MinhaColecao {
    List<String> list= new ArrayList<>();
    
    public void adicionar(String name){
        if(!list.contains(name)){
            list.add(name);
        }
    }
    
    public void remover(String name){
        list.remove(name);
    }
    
    public void imprimir(){
        if(list.isEmpty()){
            System.out.println("Lista vazia!");
        }
        int i = 1;
        for (String x : list){
            System.out.println(i + "-" + x);
            i++;
        }
    }
}
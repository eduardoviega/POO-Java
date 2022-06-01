package questao3;

//Implemente uma função static chamada removerImpares que recebe por parâmetro um ArrayList 
//de inteiros e retorna um ArrayList de inteiros, porém sem números ímpares.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros = removerImpares(numeros);
        for (int i=0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        
//        ArrayList<Integer> numeros = new ArrayList<>();
//        numeros.add(1);
//        numeros.add(13);
//        numeros.add(3);
//        numeros.add(17);
//        numeros.add(5);
//        numeros = removerImpares(numeros);
//        for (int i=0; i<numeros.size();i++){
//            System.out.println(numeros.get(i));
//        }
        
//        ArrayList<Integer> numeros = new ArrayList<>();
//        numeros.add(2);
//        numeros.add(4);
//        numeros.add(6);
//        numeros.add(8);
//        numeros.add(10);
//        numeros = removerImpares(numeros);
//        for (int i=0; i<numeros.size();i++){
//            System.out.println(numeros.get(i));
//        }
    }
    
    public static ArrayList<Integer> removerImpares(ArrayList<Integer> numeros){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i)%2 == 0){
                list.add(numeros.get(i));
            }
        }
        return list;
    }
}
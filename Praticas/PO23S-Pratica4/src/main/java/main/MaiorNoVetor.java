package main;

public class MaiorNoVetor {
    
    public static int procuraMaiorValor(int vet[]){
        int maior = vet[0];
        for(int i=0; i<vet.length; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
        }
        return maior;
    }
    
    public static void main(String args[]){
        int vetor[] = {1,-2,3,4,-5,6,-7};
        int maior = procuraMaiorValor(vetor);
        System.out.println(maior);
    }
}
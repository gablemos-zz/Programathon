/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.daruma.MergeSort;

/**
 *
 * @author Daruma
 */
public class MergeSort {

    static void Merge(int vet[], int inicio, int meio, int fim){
        int i,z,j,k;
        z = inicio;
        j = meio+1;
        k = inicio;
        int aux[] = new int[vet.length];
        
        for(i=inicio;i<=fim;i++){
            aux[i] = vet[i];
        }
        
        while(z<=meio && j<=fim){
            if(aux[z] < aux[j]){
              vet[k] = aux[z];
               z++;
            }
            else{
                vet[k] = aux[j];
                j++;
            }
             k++;  
        }
        while(z<=meio){
            vet[k] = aux[z];
            k++;
            z++;
        }
        
        System.out.print("vet[ ");
        for(int ini=0;ini<vet.length;ini++)
            System.out.print(vet[ini] + " ");
        System.out.println("]");
    }
    
    static void MergeSort(int vet[],int inicio,int fim){
        int meio;
        if(inicio<fim){
            meio = (inicio+fim) / 2;
            MergeSort(vet,inicio,meio);
            MergeSort(vet,meio+1,fim);
            Merge(vet,inicio,meio,fim);
        }
    }
    
    public static void main(String[] args) {
        int vet[] = new int[]{55, 76, 26, 64, 26, 80, 71, 46};
        MergeSort(vet,0,vet.length-1);
       
    }
    
}

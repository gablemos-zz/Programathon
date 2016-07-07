/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursounifesp;

/**
 *
 * @author Aline
 */
public class Backtracking {

    static void Backtracking(int s[], int k, int partion_sum, int sum, boolean found_solution) {
        if (k == s.length) {
            if (partion_sum == sum) {
                found_solution = true;
                return;
            }
        } else {
            partion_sum += s[k];
            sum -= s[k];
            Backtracking(s, k + 1, partion_sum, sum, found_solution);
            System.out.println("Primeira partição " + partion_sum + "| Segunda partição " + sum);
            if (found_solution) {
                return;
            }
            sum += s[k];
            partion_sum -= s[k];
            Backtracking(s, k + 1, partion_sum, sum, found_solution);
            if (found_solution) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] vet = new int[]{4, 5, 1};
        Backtracking(vet, 0, 0, 0, true);
    }

}

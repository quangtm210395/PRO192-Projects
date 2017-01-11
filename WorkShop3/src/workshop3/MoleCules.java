/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

/**
 *
 * @author Minnn
 */
public class MoleCules {

    public String structure;
    public String name;
    public double weight;

    public MoleCules() {

    }

    public MoleCules(String structure, String name, double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public void display() {
        System.out.format("%-10s%-3s% -5.3f", structure, name, weight);
        System.out.println("");
    }

    public static void main(String[] args) {
        MoleCules moleCule1 = new MoleCules("Bronze", "Cu", 64);
        MoleCules moleCule2 = new MoleCules("Iron", "Fe", 56);

        MoleCules[] moleCules = {moleCule1, moleCule2};

        for (MoleCules moleCule : moleCules) {
            moleCule.display();
        }
    }
}

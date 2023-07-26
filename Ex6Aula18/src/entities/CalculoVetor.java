package entities;

public class CalculoVetor {
    private int[] vetA;
    private int[] vetB;

    public CalculoVetor(int[] vetA, int[] vetB) {
        this.vetA = vetA;
        this.vetB = vetB;
    }

    public int[] getVetA() {
        return vetA;
    }

    public void setVetA(int[] vetA) {
        this.vetA = vetA;
    }

    public int[] getVetB() {
        return vetB;
    }

    public void setVetB(int[] vetB) {
        this.vetB = vetB;
    }
}

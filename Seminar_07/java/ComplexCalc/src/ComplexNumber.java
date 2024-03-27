public class ComplexNumber {
    private int numRe;
    private int numIm;

    public ComplexNumber(int numRe, int numIm) {
        this.numRe = numRe;
        this.numIm = numIm;
    }

    public int getNumRe() {
        return numRe;
    }

    public void setNumRe(int numRe) {
        this.numRe = numRe;
    }

    public int getNumIm() {
        return numIm;
    }

    public void setNumIm(int numIm) {
        this.numIm = numIm;
    }

    @Override
    public String toString() {
        if (numIm < 0) {
            return "(" +
                    numRe + " - " +
                    -numIm + "i" +
                    ')';
        }
        return "(" +
                numRe + " + " +
                numIm + "i" +
                ')';
    }
}

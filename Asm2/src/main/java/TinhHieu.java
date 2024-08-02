public class TinhHieu {
    public int TH(double a, double b){
        if (a % 1 != 0){
            throw new ArithmeticException("a không phải số nguyên");
        }else if (b % 1 != 0){
            throw new ArithmeticException("b không phải số nguyên");
        }
        return (int)a - (int)b;
    }
}

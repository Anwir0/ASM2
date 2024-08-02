import java.util.List;

public class TrungBinhCong {

    public double tbc(List<Integer> nb){
        if (nb == null || nb.isEmpty() ){
            throw new ArithmeticException("Lỗi");
        }
        double tong = 0;
        for (double n : nb){
            tong += n;
        }
        return tong/nb.size();
    }
}

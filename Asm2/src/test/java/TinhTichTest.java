import org.junit.Test;

import static org.junit.Assert.*;

public class TinhTichTest {

    TinhTich tt = new TinhTich();

    @Test
    public void testTich2SoDuong(){
        assertEquals(6, tt.tich(2,3));
    }

    @Test
    public void testTich2SoAm(){
        assertEquals(21, tt.tich(-7,-3));
    }

    @Test
    public void testTich1SoDuong(){
        assertEquals(-12, tt.tich(-2,6));
    }

    @Test
    public void test1SoKhongPhaiSoNguyen(){
        assertEquals(ArithmeticException.class, tt.tich(7.5, 5));
    }

    @Test
    public void testTichCuaSo0(){
        assertEquals(0, tt.tich(0,0));
    }

    @Test
    public void testTichCua0Va1SoDuong(){
        assertEquals(0, tt.tich(0,8));
    }

    @Test
    public void testTichCua0Va1SoAm(){
        assertEquals(0, tt.tich(0,-4));
    }

    @Test
    public void testTichCua0Va1SoDuongLonNhat(){
        assertEquals(0, tt.tich(0, Integer.MAX_VALUE));
    }

    @Test
    public void testTichCua0Va1SoAmNhoNhat(){
        assertEquals(0, tt.tich(0, Integer.MIN_VALUE));
    }

    @Test
    public void testTichCuaSoLonNhatVa1SoAm(){
        assertEquals(-Integer.MAX_VALUE , tt.tich(Integer.MAX_VALUE, -1));
    }
}
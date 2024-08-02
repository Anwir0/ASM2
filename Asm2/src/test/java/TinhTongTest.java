import org.junit.Test;

import static org.junit.Assert.*;

public class TinhTongTest {

    TinhTong tong = new TinhTong();

    @Test
    public void testTong2SoDuong(){
        assertEquals(5, tong.tong(2, 3));
    }

    @Test
    public void testTong2SoAm(){
        assertEquals(-5, tong.tong(-2, -3));
    }

    @Test
    public void testTong1SoDuong(){
        assertEquals(1, tong.tong(-2, 3));
    }

    @Test
    public void testTongCuaSo0(){
        assertEquals(0, tong.tong(0, 0));
    }

    @Test
    public void testTongCuaSo0Va1SoDuong(){
        assertEquals(6, tong.tong(0, 6));
    }

    @Test
    public void testTongCuaSo0Va1SoAm(){
        assertEquals(-2, tong.tong(0, -2));
    }

    @Test
    public void testTongCuaSo0VaGiaTriLonNhat(){
        assertEquals(Integer.MAX_VALUE, tong.tong(0, Integer.MAX_VALUE));
    }

    @Test
    public void testTongCuaSo0VaGiaTriNhoNhat(){
        assertEquals(Integer.MIN_VALUE, tong.tong(0, Integer.MIN_VALUE));
    }

    @Test
    public void testTongCuaSoLonNhatVa1SoAm(){
        assertEquals(Integer.MAX_VALUE -1, tong.tong(Integer.MAX_VALUE, -1));
    }

    @Test
    public void test1SoKhongPhaiSoNguyen(){
        assertEquals(ArithmeticException.class, tong.tong(3.5, 5));
    }
}
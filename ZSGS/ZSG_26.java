public class ZSG_26 {
    //Working of LONG keyword
    public static void main(String[] args) {
        XYZ_Company a = new XYZ_Company((short)47, 456890, 25091581500000L);
        System.out.println(a.annual_earning); // long has range of 2 ^ 64
        System.out.println(a.no_of_employees); // int has range of 2 ^ 32
        System.out.println(a.no_of_product); // short range of 2 ^ 16
    }
}
class XYZ_Company{
    short no_of_product;
    int no_of_employees;
    long annual_earning;
    XYZ_Company(short p, int n, long e) {
        this.annual_earning = e;
        this.no_of_employees = n;
        this.no_of_product = p;
    }
}
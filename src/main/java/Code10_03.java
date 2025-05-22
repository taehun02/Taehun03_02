public class Code10_03 {
    static int para2_mathod(int v1,int v2){
        int result;
        result = v1+v2;
        return result;
    }

    public static void main(String[] args) {
        int hap;
        hap = para2_mathod(10, 20);
        System.out.println("매개변수 2개의 메서드 호출 결과 ==> " + hap);
    }
}

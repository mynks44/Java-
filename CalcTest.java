public class CalcTest {
    public static void main(String[] args) {
        calc basicCalc = new calc(1234);
        basicCalc.unlock(1234);
        basicCalc.add(10);
        basicCalc.subtract(5);
        System.out.println(basicCalc);

        DeluxeCalc deluxeCalc = new DeluxeCalc(1234);
        deluxeCalc.unlock(1234);
        deluxeCalc.add(20);
        deluxeCalc.addToMemory();
        System.out.println(deluxeCalc);
    }
}
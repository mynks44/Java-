public class Start {
    public static void main(String[] args) {
        Safe mySafe = new Safe(1234);
        mySafe.putmsgsafe(1234, "This is a secret message.");
        String message = mySafe.retrivemsg(1234);
        System.out.println(message);
        mySafe.closeSafe();
        String lockedMessage = mySafe.retrivemsg(1234);
        System.out.println(lockedMessage);
        String wrongMessage = mySafe.retrivemsg(1111);
        System.out.println(wrongMessage);
    }
}

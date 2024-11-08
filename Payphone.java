class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Payphone {
    private int moneyAccepted; 
    public Payphone() {
        this.moneyAccepted = 0; 
    }

    public void acceptCoin(Coin coin) {
        moneyAccepted += coin.getValue(); 
    }

    public void makeCall(int number) {
        if (moneyAccepted >= 25) { 
            System.out.println("Dialing " + number + "...");
            moneyAccepted = 0; 
        } else {
            System.out.println("Sorry, not enough change inserted.");
        }
    }

    public static void main(String[] args) {
        Payphone payphone = new Payphone();

        Coin nickel = new Coin(5);
        Coin dime = new Coin(10);
        Coin quarter = new Coin(25);

        payphone.acceptCoin(nickel); 
        payphone.acceptCoin(dime);          
        payphone.acceptCoin(quarter);  

        payphone.makeCall(5685844); 

        payphone.makeCall(5685844); 
    }
}
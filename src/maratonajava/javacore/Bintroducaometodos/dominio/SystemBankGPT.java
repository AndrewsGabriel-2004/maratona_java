package maratonajava.javacore.Bintroducaometodos.dominio;

public class SystemBankGPT {
    private String Costumer;
    private double balance = 2000; //already receive 0.0
    private int acountNumber;

    public void depositAccount(double value){
        if(value<=0){
            System.out.println("Invalid Value");
            return;
        }

        balance +=value;
        System.out.println("Deposity value " + value+ "R$ done.");
    }

    public void draw (double value){
        if(verifyAuthorizationDraw(value)){
            balance -= value;
        }else{
            System.out.println("Lack Balance");
            return;
        }
        System.out.println("Your actual balance is: " + balance + " R$");
    }

    private boolean verifyAuthorizationDraw(double value){
        return balance >= value;
    }

    public void showDetails(){

        System.out.println("Costumer: "+this.Costumer);
        System.out.println("Balance: "+this.balance);
        System.out.println("Account number: "+this.acountNumber);

    }

    public void setAcountNumber(int acountNumber) {
        this.acountNumber = acountNumber;
    }


    public void setCostumer(String costumer) {
        Costumer = costumer;
    }
}

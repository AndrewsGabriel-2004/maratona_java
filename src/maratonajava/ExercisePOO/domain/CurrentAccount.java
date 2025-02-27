package maratonajava.ExercisePOO.domain;

//Exercício 02 - Cria uma classe para representar uma conta corrente que possui um número,um saldo,
// um status, um status que informa se ela é especial ou não, um limite. Desenvolva métodos para realizar saque(verificando
// se o cliente pode realizar saques), depositar dinheiro,
// consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.

public class CurrentAccount {
    public int numberAccount;
    public double balance;
    public String status;
    public boolean special;
    public double limit = 50000;
    public boolean specialCheck;

    public void status(){
        System.out.println("---------------------------");
        if(special()){
            System.out.println("Your account is Special");
        }else {
            System.out.println("Your account isn't Special");
        }
        System.out.println("Your limit is "+limit);
        System.out.println("---------------------------");
    }

    public boolean special(){
        return this.special = true;
    }

    public boolean nonSpecial(){
        return this.special = false;
    }

    public void deposit(double value){
        balance += value;
        System.out.println("Deposit of "+value+ "R$ done");
    }

    public void draw(double value){
        if(balance < value){
            System.out.println("Impossible to realize the draw, balance insufficient");
            return;
        }
        balance -= value;
        System.out.println("Draw done on the value of "+value);
    }

    public void consultBalance(){
        System.out.println("Your balance is: "+balance);
    }

    public boolean specialCheck(){
        return specialCheck = true;
    }

    public boolean nonSpecialCheck(){
        return specialCheck = false;
    }

    public void check(){
        if(specialCheck){
            System.out.println("You have a special check");

        }else {
            System.out.println("You don't have a special check");
        }
    }

}


package abstractionex;

public class BanKImplementation extends Bank{
    int amount = 10000;

    @Override
    public void deposit(int amount){
        this.amount += amount;
        checkBalance();
    }

    @Override
    public void withdraw(int amount){
        this.amount -= amount;
        checkBalance();
    }

    @Override
    public void checkBalance(){
        System.out.println("Available balance is "+amount);
    }

}

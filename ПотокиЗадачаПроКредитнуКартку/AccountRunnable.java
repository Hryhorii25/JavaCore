package ПотокиЗадачаПроКредитнуКартку;

//Задача Є однин рахунок на ньому є 50 грн є чоловік і жінка які знімають гроші з цього рахунку в різних місцях
class Dispatcher {
    public static void main(String[] args) {

        Account account = new Account();
        AccountRunnable runnable= new AccountRunnable(account);
        Thread man = new Thread(runnable,"man");
        Thread woman = new Thread(runnable,"woman");
        man.start();
        woman.start();





    }}
    public class AccountRunnable implements Runnable  {
    private Account account;
    public AccountRunnable(Account account){
        this.account = account;
    }
    @Override
    public void run() {
for (int i=0; i<5;i++){
    makeWithdrawal(10);
    try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}}
private synchronized void  makeWithdrawal(int amount){
        if (account.getBalance()>=amount){
            System.out.println(
                    Thread.currentThread().getName()
                    + "is show balance"+ account.getBalance());
            account.withdraw(amount);

        }else {
            System.out.println("not enough in account" + "for"+ Thread.currentThread().getName()
                    +" to balance " + account.getBalance());
        }
}

}

class Account {
    private  int balance =50;
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance -= amount;
    }

}
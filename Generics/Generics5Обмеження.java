package Generics;
public class Generics5Обмеження {
    public static void main(String[] ards) {
    Cell2<Job> cell2 = new Cell2<Job>();
    cell2.setU(new Job());
    cell2.doJob();


    Cell2<ChildJob> cell3= new Cell2<ChildJob>();
    cell3.setU(new ChildJob());
    cell3.doJob();

    }
}

class Job{
    void doit(){System.out.println("doit");}
}

class ChildJob extends Job{}



class Cell2 <U extends Job>{
    U u;

    public U getU(){
    return u;}


    public void setU(U u) {
        this.u = u;
    }

    public void doJob(){u.doit();}






}

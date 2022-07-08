package ExceptionsMy;

//В данім класі буде задіяно власні Exceptions
public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws VlasniExceptions {
        if (side<=0){
            throw new VlasniExceptions("Side is not korect");//Створення власного  Exceptiona через ключове слово throw
        }
        this.side = side;
    }
}

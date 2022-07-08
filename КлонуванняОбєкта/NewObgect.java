package КлонуванняОбєкта;

/**
 * Created by Гріша on 29.07.2017.
 */
public class NewObgect implements Cloneable {


    String s;
    Integer a;

    protected NewObgect clone() throws CloneNotSupportedException {
        NewObgect newObgect=(NewObgect) super.clone();

        return newObgect;
    }
}

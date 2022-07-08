package ХорошийКод;

//ImmutableКласи класи це класи у яких не міняються параметри
//Приклад створення ImmutableКласу

//В данім класі не повинно бути сетерів він повинен бути final
public final class BestPractice7ImmutableКласи {
    private final int a;  //Усі перемінні повинні бути final
    private final int b;



    public BestPractice7ImmutableКласи(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

//При яких умовах застосовуються і які переваги ImmutableКласів:
//Дані класи можуть використовуватись як свого роду константи
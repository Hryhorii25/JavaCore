package EnumsBegin;
//Енами використовують у задачаx де наперед знаєш якісь перелічині типи, точна кількість елементів якогось типу
public class Test {
    public static void main(String[]ards){
//Приклад використання енуму при використанні оператора switch case спрощує код
Animal animal = Animal.CAT;//Створення змінної типу Animal дана змінна може приймати тільки значення які є записані в енумі
        switch(animal){//Даний оператор запитує що є обєктом animal
    case CAT:
        System.out.println("Its Cat");
        break;
    case DOG:
        System.out.println("Its Dog");
        break;
    case FROT:
        System.out.println("Its Frot");
break;
}

    Sesons summer = Sesons.SUMMER;


    }
}



 enum Animal {
    CAT,DOG,FROT;//Створення обєктів класу Animal
    Animal(){}//Створення конструктора для обєктів енаму
}


enum Sesons {
    SUMMER,WINTER,AUTUM,SPRING
}


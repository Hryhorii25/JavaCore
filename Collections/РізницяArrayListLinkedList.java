package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
//У даній прграмі розглядається різниця між ArrayList,LinkedList
public class РізницяArrayListLinkedList {
    public static void main (String[] args ) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

//Дані дві колекції являються списками list вони імлементують інтерфейс list

//ArrayList зберігає дані в масиві обєктів за рахунок цьго відбувається швидке пробігання по списку і ящо потрібно провести операцію над елеметом який
// знаходиться всередені списку використовуючи дану колекцію можна до нього швидко дійти але якщо потрібно додати або забрати елемент в середені колекції він працює не ефективно за рахунок того що відбуввається
// операція копіювання елментів колекції із їхнім зміщенням на позицію

// LinkedList зберігає інформацію в нодах швидше працює при додаванні інформації на почток або в кінець колекціх або при роботі з елементами на початку або в кінці
// також LinkedList краще використовувати  при добавленні елемента в середену колекції
// за рахунок того що він імплементує Queue(чергу) але щоб добратись до якогось елемента в середені колекції і провести над ним якусь операцію LinkedList повинен до нього дійти перебравши при цьому усі
// попередні елементи колекції і це забирає ресурси


        //


    }}

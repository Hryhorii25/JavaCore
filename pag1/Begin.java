package pag1;


public class Begin  {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
// Public дає доступ до класу,методу,поля класу в різних пакетах
//Private  видимий у межах класу якщо це метод то його можна буде викликати тільки у цьому класі
//Protectet дає доступ до класу у межах пакета а також усім підкласам навіть якщо вони поза межами пакета де ці поля або методи були створені
 //default (за замовчанням)  видимий у межах одного пакета
//Клас не може бути Private,Protectet
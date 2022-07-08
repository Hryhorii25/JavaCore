package ХорошийКод;

//Оверайдити ToString потрібно в усіх методах де задіюється логірування за дапомогою ToString
// при полиці  можна відстежити в якому стані перебував обєкт на моменд помилки
public class BestPractice6ToString {
    int i;
    public static void main(String[] args) {
      BestPractice6ToString string = new BestPractice6ToString();
      string.i = 5;
      try {
          throw  new  RuntimeException();

      }catch (RuntimeException e){
          System.out.println(string);
      }}

//В даному випадку  toString задіяний таким чином у головному методі іде створення обєктів і якщо буде якась помилка при
// створенні буде відображатись при створенніі якого обєкта вона виникла
      @Override
        public String toString() {
            return "ToString{i=" + i + '}';
        }

    }


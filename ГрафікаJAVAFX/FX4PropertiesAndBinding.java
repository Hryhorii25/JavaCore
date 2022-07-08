//package ГрафікаJAVAFX;
//
//import javafx.beans.binding.IntegerBinding;
//import javafx.beans.property.IntegerProperty;
//import javafx.beans.property.ReadOnlyIntegerWrapper;
//import javafx.beans.property.SimpleIntegerProperty;
//
////ProperttiesBinding це э механызм JAVA FX  за допомогою якого можна створювати взаємо звязані елементи тобто змінюючи один елемент автоматично змінюється інший
//public class FX4PropertiesAndBinding {
//    public static void main(String[] args) {
//        IntegerProperty integerProperty = new SimpleIntegerProperty(5);//Це клас пропертя який являє собою ніби обгортку над іншим складним класом обгорткою в данім випадку Integer
//        IntegerProperty integerProperty1 = new ReadOnlyIntegerWrapper(5);
//
//        IntegerBinding integerBinding = new IntegerBinding() {
//            {
//                super.bind(integerProperty,integerProperty1);
//            }
//            @Override
//            protected int computeValue() {
//                return  integerProperty.get()+ integerProperty1.get();
//            }
//        };
//        System.out.println(integerBinding.get());
//        integerProperty.set(1);
//        System.out.println(integerBinding.get());
//    }
//int i;
//Integer integer;
//    SimpleIntegerProperty simpleIntegerProperty;
//    IntegerProperty integerProperty;
//
//}
//
//
//
//
//
//
//
//
//
//
//

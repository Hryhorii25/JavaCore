package RegExРеджекси;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Групи в RegEx це в зальному це фактично ті самі команди пошуку [ddsdsdf] тільки записуються [(dsf)] група записується у круглих
// дужках і до даної групи при пошуку можна звернутись тобто якщо є запис типу [(java)(local)] це дає можливість вибирати
// параметри пошуку із заданих (java)(local) також дозволяє проводити заміни в регулярних вираження
public class RegExp10Групи {public static void main(String[]args){
    //Використання груп
    Pattern p = Pattern.compile("Set(Value)?"); ///Запис групи яка запамятовує значення те значення яке знахоть по заданих параметрах стає значенням групи
    Pattern p1 = Pattern.compile("Set(?:Value)?"); //Запис групи яка не запамятовує значення
    Pattern p2 = Pattern.compile("(Value|Set)"); //Також в середені груп можна використовувати якусь логіку

   /* Matcher m = p.matcher("Set or SetValue");
    while (m.find()){
        System.out.println(m.start()+""+ m.group()+"");
    }
    System.out.println("");
*/

//Використання груп при заміні тексту

//System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)","$1 version"));
//System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)","$0 version"));
//System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)","$1 version".toUpperCase()));
//System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)","$1 version".toUpperCase()));



//Використання груп при пошуку тегів у даному прикладі відбувається пошук тегів із заміною
/*

    Pattern p3 = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>"); ///Запис групи яка запамятовує значення
    Matcher m3 = p.matcher("This is a <EM>first</EM> test");
    while (m3.find()){
        System.out.println(m3.start()+""+ m3.group()+"");
    }
    System.out.println("");
*/





    Pattern p3  = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>"); ///Запис групи яка запамятовує значення
    Matcher m3 = p.matcher("This is a <EM>first</EM> test");
    while (m3.find()){
        System.out.println(m3.start()+""+ m3.group()+"");
    }
    System.out.println("");


//Іменування групи


}}

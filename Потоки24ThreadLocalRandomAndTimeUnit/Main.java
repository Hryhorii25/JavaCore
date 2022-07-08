package Потоки24ThreadLocalRandomAndTimeUnit;

import java.sql.Time;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Created by Гріша on 04.11.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
System.out.println(ThreadLocalRandom.current().nextInt());//Метод для отримання рандомного числа в багатопотоковій програмі
        Thread.sleep(TimeUnit.DAYS.toDays( 14));// Метод який задає певне  значення часовими параметрами











}}

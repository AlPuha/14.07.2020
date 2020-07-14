package com.company;

public class Main {

    public static void main(String[] args) {
	// создаем полиндромную строку и сравниваем символы циклом, начиная с последнего символа
    String palindrom = "12345678"; //задали поллиндром потом
    String noovaya = ""; // задали любую строку
    for (int i = 0; i <palindrom.length(); i++){ // запустили цикл от 0 до длины полиндрома с шагом 1
        noovaya +=palindrom.charAt(palindrom.length()-1-i); // по букве с конца по 1 букве отщипываем
// charAt - ссвойство строки на позиции
        // length - длина
// -1-i - шаг от самого последнего значка - palindrom.length() - последний символ строки
    }
        System.out.println(noovaya);
        System.out.println(palindrom.equals(noovaya));
        System.out.println("не тупо____________");
        noovaya=""; //присваивает к строке Новая пустую строку
        // цикл от инжекса последнего символа (индекса) до0 включительно
        for (int i = palindrom.length()-1; i>=0; i--){
            //лепим к строке Новая каждый символ строки, начиная с конца
            noovaya+=palindrom.charAt(i);
            
        }
        System.out.println(noovaya);
    }

    //строки не сравниваются с помощью == их сравнивают с пом equals
}

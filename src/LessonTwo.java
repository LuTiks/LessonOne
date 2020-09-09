public class LessonTwo {
    public static void main(String[] args) {

        //Ссылочный тип данных

        int si = 1;
        Integer a1 = 1;
        Integer b1 = 1;
        Integer c1 = new Integer(1);

        System.out.println(a1 == b1); //true
        System.out.println(a1 == c1); //false - разные объекты так как сравниваются адреса ссылок


        String qwa = "10";
        System.out.println(qwa + 5);
        int qwa2 = 10;
        Integer qwa3 = Integer.parseInt(qwa);
        System.out.println(qwa3); //10 число
        int qwa33 = Integer.parseInt(qwa);
        String Antiqwa33 = qwa3.toString(); //"10" - строка
        System.out.println(qwa3 + qwa3 + qwa3); //30
        System.out.println(Antiqwa33 + Antiqwa33 + Antiqwa33); //101010

        System.out.println(a1.equals(b1));

        int i = Integer.parseInt("10");
        System.out.println(i);

        String line1 = "Мама ";
        String line2 = "не мыла ";
        String line3 = "рамурамумуррр";
        System.out.println(line2);
        line2 = line2.replace("не ", "");
        System.out.println(line2);
        line3 = line3.substring(0, 4); //выключаем левый край, не включаем правый [0;4)
        int n = 1;
        line3 = line3.substring(n); //убрали первые n символов
        System.out.println(line3);
        System.out.println(line1 + line2 + line3);

        String abc = null;
        String cde = null;

        System.out.println(abc == cde); //true
        System.out.println(abc != cde); //false

        System.out.println(abc == null); //ДЗ Ответ: true

        // System.out.println(null < abc); это не работает

        if (abc == cde) {
            System.out.println("null == null is true in Java");
        }
        if (abc != cde) {
            System.out.println("null == null is false in Java");
        }

// ---------------------------------------- ДЗ ----------------------------------------
//        1) превратить строку "Шаурмяу" в строку "Шаурма". вывести строку до и после в формате:
//        System.out.println("до: " + line);
//        и также для после - после преобразования.
//                Также выводить исходную строку и результат для всех примеров:
//        2) "Много $" превратить в "Много &"
//        3) "осталось много времени до нового года" - превратите в "осталось 4 месяца до нового года".
//        4) превратите из предыдущей строки количество месяцев в цифру. Уменьшите ее на единицу. выведите.
//        5) задание со звездочкой: превратить "Децибел" в "имбецил"  =)

        String dz1 = "Шаурмяу";
        System.out.println("До: " + dz1 + "\n" + "После: " + dz1.replace("яу", "а"));

        String dz2 = "Много $";
        System.out.println("До: " + dz2 + "\n" + "После: " + dz2.replace("$", "&"));

        String dz3 = "осталось много времени до нового года";
        String dz4 = dz3.replace("много времени", "4 месяца");
        System.out.println("До: " + dz3 + "\n" + "После: " + dz4);

        System.out.println("Число выше минус 1: " + (Integer.parseInt(dz4.substring(9,10)) - 1));

        String dz5 = "Децибел";
        System.out.println("До: " + dz5 + "\n" + "После: " + dz5.substring(3,4).toUpperCase() + dz5.replace("Де", "м").substring(0,1) + dz5.substring(4,6) + dz5.substring(2,4) + dz5.substring(6));

    }
}

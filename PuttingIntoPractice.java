package dz3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
//1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей
//к большей).
    transactions.stream()
            .filter(transaction -> transaction.getYear() ==2011)
            .sorted(Comparator.comparing(Transaction::getValue).reversed())
            .forEach(System.out::println);
// /2. Вывести список неповторяющихся городов, в которых работают трейдеры.
    transactions.stream()
            .map(transaction -> transaction.getTrader().getCity())
            .collect(Collectors.toSet())
            .forEach(System.out::println);

////3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.toSet())
                .stream().sorted((o1, o2) -> o1.getTrader().getName().compareTo(o2.getTrader().getName()))
                .forEach(System.out::println);
////4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном
////    порядке.
        String str = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining());
        System.out.println(str);
////5. Выяснить, существует ли хоть один трейдер из Милана.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Milan"))
                .limit(1)
                .forEach(System.out::println);
////6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
////7. Какова максимальная сумма среди всех транзакций?
        transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.naturalOrder())
                .stream().limit(1)
                .forEach(System.out::println);

////            8. Найти транзакцию с минимальной суммой.
        transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.naturalOrder())
                .stream().limit(1)
                .forEach(System.out::println);
////


    }
}
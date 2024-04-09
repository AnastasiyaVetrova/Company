import java.util.Random;

public enum EnumSurname {
    ИВАНОВ, СМИРНОВ, КУЗНЕЦОВ, ПОПОВ, ВАСИЛЬЕВ, ПЕТРОВ, СОКОЛОВ,
    МИХАЙЛОВ, НОВИКОВ, ФЕДОРОВ, МОРОЗОВ, ВОЛКОВ, АЛЕКСЕЕВ, ЛЕБЕДЕВ, СЕМЕНОВ,
    ЕГОРОВ, ПАВЛОВ, КОЗЛОВ, СТЕПАНОВ, НИКОЛАЕВ, ОРЛОВ, АНДРЕЕВ, МАКАРОВ, НИКИТИН, ЗАХАРОВ,
    ПОЛИКАРПОВ, РЯБИНИН, СУДАКОВ, КУКУШКИН, КАЛАЧЁВ,
    ГРИБОВ, ЕЛИЗАРОВ, ЗВЯГИНЦЕВ, КОРОЛЬКОВ, ФЕДОСОВ;
    private static Random random = new Random();

    public static EnumSurname randomSurname() {
        EnumSurname[] enumSurnames = values();
        return enumSurnames[random.nextInt(enumSurnames.length)];
    }
}

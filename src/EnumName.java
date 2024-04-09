import java.util.Random;

public enum EnumName {
    АЛЕКСАНДР, АРТЁМ, МАТВЕЙ, МАКСИМ, МИХАИЛ, СОФИЯ, АННА, МАРИЯ, ВИКТОРИЯ, АЛИСА,
    АИША, АЛИЯ, ДАРИНА, ЕКАТЕРИНА, МАРЬЯМ, МИЛАНА, ХАДИДЖА, АЛДАР, ЛЕВ, РОМАН,
    ДОРЖУ, АРСЛАН, ДАМИР, АРЗЫЛАН, ДАЯНА, ИЛЯНА, ЭНКИРА, АНАСТАСИЯ, КСЕНИЯ, КОНСТАНТИН, ДАНИИЛ;

    private static Random random = new Random();

    public static EnumName randomEnum() {
        EnumName[] enumName = values();
        return enumName[random.nextInt(enumName.length)];
    }
}

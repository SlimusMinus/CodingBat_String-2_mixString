public class SumNumber {

    public static String email(String str) throws MyExeption{

        if(!str.contains("@"))
            throw new MyExeption("Uncorrect email", str);
        return str;
    }
}

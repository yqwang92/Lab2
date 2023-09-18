import java.math.BigInteger;
import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {
        BigInteger s = BigInteger.valueOf(0);
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s = s.add(BigInteger.valueOf(x));
        }
        return s.longValue();
    }
}

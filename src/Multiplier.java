import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int c, int d, int e, int f){
        return multiply(multiply(c, d),multiply(e,f));
    }

    double multiply(double a, double b){
        return a*b;
    }
    BigDecimal multiply(BigDecimal a, BigDecimal b){
        return a * b;
    }
    Integer multiply(List<Integer> numbers ){
        Integer tmp=1;
        for (int i=0; i<numbers.size(); i++){
            tmp*=numbers.get(i);
            return tmp;
        }
    }
}

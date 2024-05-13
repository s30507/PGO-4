import java.math.BigDecimal;
import java.util.List;

public class Adder {
    int Add(int a, int b){
        return a+b;
    }

    BigDecimal Add(List <BigDecimal> numbers){
        BigDecimal tmp= BigDecimal.valueOf(0);
        for(int i=0; i<numbers.size(); i++){
            tmp.add(numbers.get(i));
        }
        return tmp;
    }
}

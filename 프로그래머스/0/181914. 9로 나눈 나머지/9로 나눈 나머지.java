import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger bigInteger = new BigInteger(number);
        BigInteger answer = bigInteger.mod(BigInteger.valueOf(9));
        return answer.intValue();
    }
}
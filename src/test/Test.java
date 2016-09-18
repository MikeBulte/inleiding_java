package test;

import java.math.BigDecimal;

/*
 * Created by Mike on 9/6/2016.
 */
public class Test {

 public static void main(String[] args) {

double value = .012;

double pSum = value + value + value;
     System.out.println("Sum of primitives :" +  pSum);

     String strValue = Double.toString(value);
     System.out.println("strValue :" + strValue);
     BigDecimal bigValue = new BigDecimal(strValue);

     BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

     System.out.println("Sum of BigDecimals" + bSum.toString());
  }
}

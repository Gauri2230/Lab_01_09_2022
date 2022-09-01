public class HexToDecimal
{
   public static void main(String[] args)
   {
      String num = "7A";
      int decimal = Integer.parseInt(num, 16);
      System.out.println("Decimal number : " + decimal);
   }
}
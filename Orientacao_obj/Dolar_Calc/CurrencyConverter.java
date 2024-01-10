package Orientacao_obj.Dolar_Calc;

public class CurrencyConverter {
    public  static double dollarPrice;
    public  static double quantity;
    
    
    
    public static double Result(){
     return (quantity * dollarPrice)+((quantity * dollarPrice) * 0.06);
    }
}

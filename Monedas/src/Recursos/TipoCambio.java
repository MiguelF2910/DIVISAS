package Recursos;





public class TipoCambio {
    public static double MXNUSD=0.058;
    public static double MXNEUR=0.053;
    public static double USDMXN=17.12;
    public static double USDEUR=0.91;
    public static double EURMXN=18.73;
    public static double EURUSD=1.09;
    
    //MXN 
    public double MXNUSD(double v )
    {
        return v*MXNUSD;
    
    }
    public double MXNEUR(double v)
    {
        return v*MXNEUR;
    }
    
    public double MXNMXN(double v)
    {
        return v ;
    }
    //USD
    public double USDMXN(double v )
    {
        return v*USDMXN;
    
    }
    public double USDEUR(double v)
    {
        return v*USDEUR;
    }
    
    public double USDUSD(double v)
    {
        return v ;
    }
    //EUR  
    public double EURMXN(double v )
    {
        return v*EURMXN;
    }
    public double EURUSD(double v)
    {
       return v*EURUSD;
    }
    
    public double EUREUR(double v)
    {
        return v ;
    }
    
}

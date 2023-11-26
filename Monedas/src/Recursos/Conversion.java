package Recursos;

import javafx.scene.control.TextField;

/**
 *
 * @author migue
 */
public class Conversion {
    TipoCambio M01;
    double val;
    public Conversion(){M01=new TipoCambio();}
    public String USD(String v1, double txt1 )
    {
        if(v1.equals("Dolar estadounidense"))
        {
            val=M01.USDUSD(txt1);
        }
        else if (v1.equals("Peso Méxicano"))
        {
            val=M01.USDMXN(txt1);

        }
        else if(v1.equals("Euro"))
        {
            val=M01.USDEUR(txt1);
        }
        return Double.toString(val);
    }
    public String MXN(String v1, double txt1)
    {
        if(v1.equals("Dolar estadounidense"))
        {
            val=M01.MXNUSD(txt1);

        }
        else if (v1.equals("Peso Méxicano"))
        {
            val=M01.MXNMXN(txt1);

        }
        else if(v1.equals("Euro"))
        {
            val=M01.MXNEUR(txt1);

        }
        return Double.toString(val);
    }
    public String EUR(String v1, double txt1 ) //puedes generar un tipo de dato Textfield pero lo cambiaste por double public String EUR(String v1, TextField txt1 )
    {
        if(v1.equals("Dolar estadounidense"))
        {
            val=M01.EURUSD(txt1);
        }
        else if (v1.equals("Peso Méxicano"))
        {
            val=M01.EURMXN(txt1);

        }
        else if(v1.equals("Euro"))
        {
            val=M01.EUREUR(txt1);
        }                
        return Double.toString(val);    
    }
}

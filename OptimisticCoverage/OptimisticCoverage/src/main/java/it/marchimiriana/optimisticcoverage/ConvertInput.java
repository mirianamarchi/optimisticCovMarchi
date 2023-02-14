package it.marchimiriana.optimisticcoverage;

public class ConvertInput {
    public int sumString(String input) {
        String[] digits = input.split(" ");
        int result = 0;
        for (String digit : digits) {
            int num = Integer.parseInt(digit);
            result = result + num;
        }
        return result;
    }
}

//BUG nel codice in quanto non viene gestito correttamente un input diverso da un numero.
//Il bug non viene rilevato in quanto il test viene eseguito su uno scenario limitato.
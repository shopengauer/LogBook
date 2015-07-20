package ru.matritca.logbook.domain.verification;

/**
 * Created by Vasiliy on 20.07.2015.
 */
public enum VerificationType {

    PRIMARY(0,"Первичная"),
    PERIODIC(1,"Периодическая"),
    EXTRAORDINARY(2,"Внеочередная");

    private String label;
    private int intValue;

    VerificationType(int intValue,String label){
      this.intValue = intValue;
      this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getIntValue() {
        return intValue;
    }

    public static int getValueByLabel(String label){
        VerificationType[] values =  VerificationType.values();
        for ( VerificationType s : values) {
            if(label.equals(s.getLabel())){
                return s.ordinal();
            }
        }
        return 0;
    }

    public static  VerificationType getVerificationTypeByLabel(String label){
        VerificationType[] values =  VerificationType.values();
        for ( VerificationType s : values) {
            if(label.equals(s.getLabel())){
                return s;
            }
        }
        return PRIMARY;
    }






}

package ru.matritca.logbook.domain;

/**
 * Created by Vasiliy on 26.06.2015.
 */
public enum LogBookUserRole {

    ADMIN_ROLE("Administrator",0),
    USER_EDITOR("EDITOR",1),
    USER_VIWER("VIEWER",2);

    private String label;
    private int intValue;

    LogBookUserRole(String label, int intValue) {
        this.label = label;
        this.intValue = intValue;
    }


    public String getLabel() {
        return label;
    }

    public int getIntValue() {
        return intValue;
    }

    public static int getValueByLabel(String label){

        LogBookUserRole[] values = LogBookUserRole.values();
        for (LogBookUserRole s : values) {
            if(label.equals(s.getLabel())){
                return s.ordinal();
            }
        }
        return 2;
    }


    public static LogBookUserRole getLogBookUserRoleByLabel(String label){
        LogBookUserRole[] values = LogBookUserRole.values();
        for (LogBookUserRole s : values) {
            if(label.equals(s.getLabel())){
                return s;
            }
        }
        return USER_VIWER;
    }

}

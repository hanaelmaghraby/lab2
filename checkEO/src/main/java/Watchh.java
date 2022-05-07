public class Watchh {
    public String watch ( String buttons ){
        int n = buttons.length();

        int m=0 ,h = 0;
        int D = 1,M = 1;
        int Y = 2000;

        String state = "Normal_Display";
        String state1 = "Time";
        String state2 = "Alarm";
        String state3 = "min";


        for(int j=0; j<n; j++){
            switch (state){

                case "Normal_Display" : {
                    if ( buttons.charAt(j) == 'x' )
                        state = "Update";
                    if ( buttons.charAt(j) == 'y' )
                        state = "Chime_Alarm_Set";
                    if ( buttons.charAt(j) == 'z' ){
                        if( state1 == "Time")
                            state1 = "Date";
                        else
                            state1 = "Time";

                    }

                    break;
                }

                case "Chime_Alarm_Set" : {
                    if ( buttons.charAt(j) == 'z' ) {
                        if (state2 == "Alarm")
                            state2 = "Chime";
                    }
                    if ( buttons.charAt(j) == 'd' )
                        state = "Normal_Display";

                    break;
                }

                case "Update" : {
                    if (buttons.charAt(j) == 'z') {
                        if (state3 == "min")
                            state3 = "hour";
                        else if (state3 == "hour")
                            state3 = "day";
                        else if (state3 == "day")
                            state3 = "month";
                        else if (state3 == "month")
                            state3 = "year";
                        else if (state3 == "year")
                            state = "Normal_Display";
                    }

                    if (buttons.charAt(j) == 'y'){
                        if (state3 == "min") {
                            if (m < 60)
                                m++;
                            else
                                m=0;
                        }
                        else if (state3 == "hour")
                            if ( h < 24)
                                h++;
                            else
                                h=0;
                        else if (state3 == "day")
                            if ( D < 31)
                                D++;
                            else
                                D=1;
                        else if (state3 == "month")
                            if ( M < 12)
                                M++;
                            else
                                M=1;
                        else if (state3 == "year")
                            if ( Y < 2100)
                                Y++;
                    }

                    if (buttons.charAt(j) == 'd')
                        state = "Normal_Display";
                    break;
                }
            }
        }

        String w;

        if (state == "Normal_Display") {
            w = state1;
        }
        else if (state == "Chime_Alarm_Set"){
            w = state1;
        }
        else {
            w = state1;
        }


        return "Current state: " + state + ", " + w + "  Date: " + String.valueOf(D) + " - " + String.valueOf(M) + " - " +String.valueOf(Y) + "  Time: " + String.format("%02d", h) + ":" + String.format("%02d", m);

    }
}

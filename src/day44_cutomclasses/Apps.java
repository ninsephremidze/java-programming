package day44_cutomclasses;

public class Apps {

        // App class is used as a templated for App objects
        // we are describing app properties

        String name;// null by default
        double version; //0.0 by default
        public void open(){
            System.out.println(" opening"+name+"app-version"+version);
        }

    }



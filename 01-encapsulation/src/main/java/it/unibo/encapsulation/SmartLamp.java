package it.unibo.encapsulation;

public class SmartLamp{
    private  boolean lampOn;
    private  int intensityLight;
    private  String colorLight;
}


public SmartLamp(){ //il costruttore mi permette di settare la lampada all'inizio
    this.lampOn = false;
    this.intensityLight = 0;
    this.color = "white";
}

public void turnOn(){   //moduli che mi dicono lampada accesa o spenta
    this.lampOn = true;
}

public void turnOff(){
    this.lampOn = false;
}

public void setIntensity(int intensityLight){ //mi setta la luce in base ai 3 livelli di intensità che ho
    if(intensityLight<1){
        this.intensityLight = 1;
    } else if(intensityLight>3){
        this.intensityLight=3;
    } else{
        this.intensityLight = intensityLight
    }

}

public void setColor(String colorLight){
    if (color.equals("white") || color.equals("red") || color.equals("blue") || color.equals("green")){
        this.colorLight = colorLight;
    }
}




public boolean getlampOn(){
    return lampOn;
}

public int getintensityLight(){
    return intensityLight;
}

public String getcolorLight(){
    return colorLight;
}

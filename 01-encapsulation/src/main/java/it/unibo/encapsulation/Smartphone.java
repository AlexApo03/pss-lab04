package it.unibo.encapsulation;

public class Smartphone {

    private static final boolean DEF_HAS_GPS = true;
    private static final boolean DEF_HAS_3G = true;
    private static final boolean DEF_HAS_NFC = true;
    private static final int DEF_SD_SIZE = 65536;
    private static final int DEF_RAM_SIZE = 8192;
    private static final int DEF_N_CPU = 8;

    private final int cpuCount;
    private final int ram;
    private final int sdSize;
    private final String brand;
    private final String model;
    private final boolean hasGPS;
    private final boolean has3G;
    private final boolean hasNFC;

    public int getcpuCount(){
        return cpuCount;
    }

     public int getram(){
        return ram;
    }

     public int sdSize(){
        return sdSize;
    }

     public String getbrand(){
        return brand;
    }

     public String getmodel(){
        return model;
    }

     public boolean gethasGPS(){
        return hasGPS;
    }

     public boolean gethas3G(){
        return has3G;
    }

     public boolean gethasNFC(){
        return hasNFC;
    }

    public Smartphone(
        final int cpuCount,
        final int ram,
        final int sdSize,
        final String brand,
        final String model,
        final boolean hasGPS,
        final boolean has3G,
        final boolean hasNFC
    ) {
        this.cpuCount = cpuCount;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    public Smartphone(final String brand, final String model) {
        this(brand, model, DEF_SD_SIZE);
    }

    public Smartphone(final String brand, final String model, final int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, sdSize, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasGPS, final boolean has3G) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3G, DEF_HAS_NFC);
    }

    public void printStringRep() {
        System.out.println("n CPU(s): " + cpuCount);
        System.out.println("RAM amount: " + ram);
        System.out.println("SD size: " + sdSize);
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("hasGPS: " + hasGPS);
        System.out.println("has3G: " + has3G);
        System.out.println("hasNFC: " + hasNFC + "\n");
    }
}

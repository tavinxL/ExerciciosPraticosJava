package javacore.Dcontrutores.dominio;

public class Pc {
    private String placaMae;
    private String fonte;
    private String ram;
    private String cpu;
    private String placaVideo;

    public Pc(String placaMae, String fonte, String ram, String cpu) {
        this.placaMae = placaMae;
        this.fonte = fonte;
        this.ram = ram;
        this.cpu = cpu;
    }

    public Pc(String placaMae, String fonte, String ram, String cpu, String placaVideo) {
        this(placaMae, fonte, ram, cpu);
        this.placaVideo = placaVideo;
    }




    public String getInfo() {
        return "Placa-Mãe: " + placaMae + " | Fonte: " + fonte + " | Ram: " + ram + " | Cpu: " + cpu+ " | Placa de Video: "+placaVideo;
    }
}

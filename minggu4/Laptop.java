package minggu4;
public class Laptop {
    private String merk;
    private Processor proc;
    public Laptop() {
    }
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setProc(Processor proc) {
        this.proc = proc;
    }
    public void Info() {
        System.out.println("merk Laptop = "+merk);
        proc.Info();
    }
}

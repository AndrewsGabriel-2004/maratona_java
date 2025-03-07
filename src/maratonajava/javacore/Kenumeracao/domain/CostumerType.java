package maratonajava.javacore.Kenumeracao.domain;

public enum CostumerType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALUE;
    private final String NAMERELATORY;

    CostumerType(int value, String nameRelatory){
        this.VALUE = value;
        this.NAMERELATORY = nameRelatory;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getNAMERELATORY() {
        return NAMERELATORY;
    }
}

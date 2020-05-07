public class Medico {

    private String nome_medico;
    private int crm_medico;
    private String uf_crm;

    public Medico(String nome_medico, int crm_medico, String uf_crm) {
        this.nome_medico = nome_medico;
        this.crm_medico = crm_medico;
        this.uf_crm = uf_crm;
    }
    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    public int getCrm_medico() {
        return crm_medico;
    }

    public void setCrm_medico(int crm_medico) {
        this.crm_medico = crm_medico;
    }

    public String getUf_crm() {
        return uf_crm;
    }

    public void setUf_crm(String uf_crm) {
        this.uf_crm = uf_crm;
    }

    @Override
    public String toString() {
        return
                "Médico: "
                        +   nome_medico
                        + ", CRM: "
                        +   crm_medico
                        + ", UF: "
                        +   uf_crm;
    }
}

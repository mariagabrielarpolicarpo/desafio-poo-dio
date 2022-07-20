package dominio; 

public class Curso {
    
    private String titulo; 
    private String descricao; 
    private int cargaHoraria; 

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", cargaHoraria='" + getCargaHoraria() + "'" +
            "}";
    }

}

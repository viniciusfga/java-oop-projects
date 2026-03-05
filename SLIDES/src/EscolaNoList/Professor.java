package EscolaNoList;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    private String matricula;

    public Professor(Integer id, String nome, String telefone, String email, String matricula) {
        super(id, nome, telefone, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
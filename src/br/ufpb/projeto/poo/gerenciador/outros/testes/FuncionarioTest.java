package br.ufpb.projeto.poo.gerenciador.outros.testes;

import br.ufpb.projeto.poo.gerenciador.outros.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FuncionarioTest {
    FuncionarioTest() {
    }

    @Test
    void getNome() {
        Funcionario a = new Funcionario("Cinthia", "03/07/1995", "234.942.168-60", "TI", "05/06/2022", "Osasco");
        Assertions.assertEquals("Cinthia", a.getNome());
    }

    @Test
    void setNome() {
        Funcionario b = new Funcionario("Cinthia", "03/07/1995", "114.473.004-08", "TI", "05/06/2022", "Osasco");
        b.setNome("Filipe");
        Assertions.assertEquals("Filipe", b.getNome());
    }

    @Test
    void getDataDeNasc() {
        Funcionario c = new Funcionario("Cinthia", "03/07/1995", "234.942.168-60", "TI", "05/06/2022", "Osasco");
        Assertions.assertEquals("03/07/1995", c.getDataDeNasc());
    }

    @Test
    void setDataDeNasc() {
        Funcionario d = new Funcionario("Cinthia", "03/07/1995", "114.473.004-08", "TI", "05/06/2022", "Osasco");
        d.setDataDeNasc("19/04/1996");
        Assertions.assertEquals("19/04/1996", d.getDataDeNasc());
    }

    @Test
    void getCpf() {
        Funcionario e = new Funcionario("Cinthia", "03/07/1995", "234.942.168-60", "TI", "05/06/2022", "Osasco");
        Assertions.assertEquals("234.942.168-60", e.getCpf());
    }

    @Test
    void getDataDeAdmissao() {
        Funcionario f = new Funcionario("Cinthia", "03/07/1995", "234.942.168-60", "TI", "05/06/2022", "Osasco");
        Assertions.assertEquals("05/06/2022", f.getDataDeAdmissao());
    }

    @Test
    void setDataDeAdmissao() {
        Funcionario g = new Funcionario("Cinthia", "03/07/1995", "114.473.004-08", "TI", "05/06/2022", "Osasco");
        g.setDataDeAdmissao("05/06/2022");
        Assertions.assertEquals("05/06/2022", g.getDataDeAdmissao());
    }
}

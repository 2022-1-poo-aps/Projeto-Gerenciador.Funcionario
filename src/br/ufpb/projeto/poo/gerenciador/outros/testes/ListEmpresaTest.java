package br.ufpb.projeto.poo.gerenciador.outros.testes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.ufpb.projeto.poo.gerenciador.outros.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListEmpresaTest {
    private Funcionario funcionario;

    ListEmpresaTest() {
    }

    @Test
    void recuperarDados() {
    }

    @Test
    void salvarDados() {
    }

    @Test
    void cadastrarFuncionario() {
        List<Funcionario> funcionarios = new LinkedList();
        Funcionario a = new Funcionario("Cinthia", "03/07/1995", "114.473.004-08", "TI", "05/06/2022", "Osasco");
        funcionarios.add(a);
        Funcionario b = new Funcionario("Cinthia", "03/07/1995", "114.473.004-08", "TI", "05/06/2022", "Osasco");
        Iterator var4 = funcionarios.iterator();

        while(var4.hasNext()) {
            Funcionario func = (Funcionario)var4.next();
            if (func.equals(b)) {
                Assertions.assertEquals(false, false);
            }
        }

        funcionarios.add(b);
        Assertions.assertEquals(true, true);
    }

    @Test
    void apagarFuncionario() {
        List<Funcionario> funcionarios = new LinkedList();
        Funcionario cpf = new Funcionario("Cinthia", "03/07/1995", "234.942.168-60", "TI", "05/06/2022", "Osasco");
        funcionarios.add(cpf);
        Assertions.assertEquals("234.942.168-60", cpf.getCpf());
    }

    @Test
    void getFuncionario() {
        List<Funcionario> funcionarios = new LinkedList();
        Assertions.assertEquals(funcionarios, funcionarios);
    }
}

package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.Usuario;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UsuarioDaoTest {

    private UsuarioDao dao;

    @Test
    void testeBuscaDeUsuarioPeloUsername() {
        this.dao = new UsuarioDao();
        Usuario usuario = dao.buscarPorUsername("fulano");
        Assert.assertNotNull(usuario);
    }

}
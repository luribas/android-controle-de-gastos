package br.edu.up.controledegastos.repository;

import java.util.List;

import br.edu.up.controledegastos.model.Usuario;

public class UsuarioRepository {

    private static Usuario UsuarioLogado;

    public boolean Cadastrar(Usuario u)
    {
        try
        {
            if (BuscarPorCpf(u) != null)
            {
                return false;
            }
            return true;
        }
        catch (Exception)
        {
            return false;
        }
    }

    public Usuario GetUsuarioLogado()
    {
        return UsuarioLogado;
    }

    public Usuario BuscarPorCpf(Usuario u)
    {
    }

    public Usuario BuscarPorLogin(Usuario u)
    {
    }

    public boolean Logar(String login, String senha)
    {
        var usuario = _context.Usuarios.FirstOrDefault(x => x.Email.Equals(login) && x.Senha.Equals(senha));
        if (usuario == null)
            usuario = _context.Usuarios.FirstOrDefault(x => x.Login.Equals(login) && x.Senha.Equals(senha));
        UsuarioLogado = usuario;
        if (usuario != null)
            return true;
        else return false;
    }


    public List<Usuario> ListarUsuarios() => _context.Usuarios.ToList();

    public bool Editar(Usuario u)
    {
        try
        {
            _context.Entry(u).State = EntityState.Modified;
            _context.SaveChanges();
            return true;
        }
        catch (Exception)
        {
            return false;
        }
    }
}

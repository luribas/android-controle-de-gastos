package br.edu.up.controledegastos.model;

import java.util.Date;

public class Lancamento {
    public int IdLancamento;
    public double Valor;
    public Date DataLancamento;
    public String Descricao;
    public Categoria Categoria;
    public int Parcelas;
    public Date DataCadastro;
    public Usuario Usuario;
    public String Imagem;

    public int getIdLancamento() {
        return IdLancamento;
    }

    public void setIdLancamento(int idLancamento) {
        IdLancamento = idLancamento;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public Date getDataLancamento() {
        return DataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        DataLancamento = dataLancamento;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public br.edu.up.controledegastos.model.Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(br.edu.up.controledegastos.model.Categoria categoria) {
        Categoria = categoria;
    }

    public int getParcelas() {
        return Parcelas;
    }

    public void setParcelas(int parcelas) {
        Parcelas = parcelas;
    }

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        DataCadastro = dataCadastro;
    }

    public br.edu.up.controledegastos.model.Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(br.edu.up.controledegastos.model.Usuario usuario) {
        Usuario = usuario;
    }
}

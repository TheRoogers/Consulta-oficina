package com.example.provaconhecimento;

import java.io.Serializable;
import java.io.SerializablePermission;

public class List_Element implements Serializable {
    public String color;
    public String oficina;
    public String descricao;
    public String fulldescricao;
    public String distancia;
    public String endereco;
    public String email;
    public String telefone;

    public List_Element(String color, String oficina, String descricao, String fulldescricao, String distancia, String endereco, String email, String telefone) {
        this.color = color;
        this.oficina = oficina;
        this.descricao = descricao;
        this.fulldescricao = fulldescricao;
        this.distancia = distancia;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }



    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getOficina() {
        return oficina;
    }
    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getfullDescricao() {
        return fulldescricao;
    }
    public void setfullDescricao(String fulldescricao) {
        this.fulldescricao = fulldescricao;
    }

    public String getDistancia() {
        return distancia;
    }
    public void setdistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }
    public void setemail(String telefone) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void settelefone(String telefone) {
        this.telefone = telefone;
    }
}

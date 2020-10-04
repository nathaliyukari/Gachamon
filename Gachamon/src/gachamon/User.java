package gachamon;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected String nome;
    protected String email;
    protected String password;
    protected double balance;
    protected List<Prize> prizes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    public User(String nome, String email, String password, double balance, List<Prize> prizes) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.prizes = prizes;
    }
}

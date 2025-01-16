package DAO;

import models.User;
import java.io.*;
import java.util.ArrayList;

public class usersDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    private final static String ARQUIVO_USERS = "users.ser";

    private static ArrayList<User> Users;
    private static usersDAO instance;

    private usersDAO() {
        Users = new ArrayList<>();
    }

    public static usersDAO getInstance() {
        if (instance == null) {
            instance = new usersDAO();
        }
        return instance;
    }

    //Método para adicionar usuário
    public boolean addUser(User user) {
        if (findUserByEmail(user.getEmail()) == null) {
            Users.add(user);
            salvarDados();
            return true;
        }
        return false;
    }

    // Método para encontrar usuário por email
    public User findUserByEmail(String email) {
        for (User user : Users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    // Método para verificar login
    public User validateLogin(String email, String password) {
        User user = findUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            return null;
        }
    }

    public void salvarDados(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO_USERS))) {
            oos.writeObject(Users);
            System.out.println("Dados salvos com sucesso no arquivo: " + ARQUIVO_USERS);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void carregarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO_USERS))) {
            Users = (ArrayList<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + ARQUIVO_USERS + ". Criando lista nova.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar dados do arquivo: " + e.getMessage());
        }
    }
}
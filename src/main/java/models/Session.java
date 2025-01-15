package models;

public class Session {
    private static User loggedUser;

    public static User getLoggedUser() {
        return loggedUser;
    }
    public static void setLoggedUser(User loggedUser) {
        Session.loggedUser = loggedUser;
    }

    public static boolean isUsuarioLogado() {
        return loggedUser != null;
    }
    public static void logout() {
        loggedUser = null;
    }
}

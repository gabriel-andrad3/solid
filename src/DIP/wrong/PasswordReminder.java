package DIP.wrong;

public class PasswordReminder {
    private MySQLConnection dbConnection;

    public PasswordReminder() {
        this.dbConnection = new MySQLConnection(); // wrong: quebra o princípio (alto nível de acoplamento; ruim caso precise mudar o banco)
    }
}

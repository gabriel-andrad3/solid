package DIP.wrong;

public class PasswordReminder2 {
    private MySQLConnection dbConnection;

    public PasswordReminder2(MySQLConnection dbConnection) { // wrong: quebra o princípio (estamos dependendo de uma implementação e não de uma abstração)
        this.dbConnection = dbConnection;
    }
}

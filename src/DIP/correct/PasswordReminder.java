package DIP.correct;

public class PasswordReminder {
    private DBConnectionI dbConnectionI;

    public PasswordReminder(DBConnectionI dbConnection) {
        this.dbConnectionI = dbConnection;
    }
}

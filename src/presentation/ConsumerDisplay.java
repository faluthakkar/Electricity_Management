package presentation;

import java.sql.SQLException;

public interface ConsumerDisplay {
    void showMenu();
    void performMenu(int choice) throws SQLException;
}


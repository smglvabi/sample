import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class UserDAO {

    public void saveUser(User user) {
        String sql = "INSERT INTO users(id, name, role, city) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getRole());
            stmt.setString(4, user.getCity());
            stmt.executeUpdate();

            System.out.println("User saved to DB");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User findById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getString("city")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void updateUserName(int id, String newName) {
        String sql = "UPDATE users SET name = ? WHERE id = ?";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newName);
            stmt.setInt(2, id);
            stmt.executeUpdate();

            System.out.println("User updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("User deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateCity(String oldCity, String newCity) {
        String sql = "UPDATE users SET city = ? WHERE city = ?";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newCity);
            stmt.setString(2, oldCity);

            stmt.executeUpdate();

            System.out.println("City updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



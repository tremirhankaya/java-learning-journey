import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CargoDAO {

    // Kargo Ekleme Metodu
    public void addCargo(BaseCargo baseCargo) {
        String sql = "INSERT INTO cargos (id, receiver_name, destination_address,sender_name) VALUES (?, ?, ?,?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, baseCargo.getId());
            pstmt.setString(2, baseCargo.getReceiverName());
            pstmt.setString(3, baseCargo.getDestinationAddress());
            pstmt.setString(4, baseCargo.getSenderName());

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Cargo successfully added: ID " + baseCargo.getId() + ". Status set to default.");
            }

        } catch (SQLException e) {
            System.err.println("Error adding cargo: " + e.getMessage());
        }
    }

    // ID'ye Göre Kargo Bulma Metodu
    public BaseCargo findCargoById(int id) {
        String sql = "SELECT id, receiver_name, destination_address, status ,sender_name FROM cargos WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                BaseCargo baseCargo = new BaseCargo();
                baseCargo.setId(rs.getInt("id"));
                baseCargo.setReceiverName(rs.getString("receiver_name"));
                baseCargo.setDestinationAddress(rs.getString("destination_address"));
                baseCargo.setStatus(rs.getString("status"));
                return baseCargo;
            }
        } catch (SQLException e) {
            System.err.println("Error finding cargo: " + e.getMessage());
        }
        return null;
    }

    // Kargo Durumu Güncelleme Metodu
    public void updateCargoStatus(int id, String newStatus) {
        String sql = "UPDATE cargos SET status = ? WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newStatus);
            pstmt.setInt(2, id);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Cargo status successfully updated for ID " + id + " to: " + newStatus);
            } else {
                System.out.println("No cargo found with ID " + id + " for update.");
            }

        } catch (SQLException e) {
            System.err.println("Error updating cargo status: " + e.getMessage());
        }
    }

    // Kargo Silme Metodu
    public void deleteCargo(int id) {
        String sql = "DELETE FROM cargos WHERE id = ?";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Cargo successfully deleted: ID " + id);
            } else {
                System.out.println("No cargo found with ID " + id + " for deletion.");
            }

        } catch (SQLException e) {
            System.err.println("Error deleting cargo: " + e.getMessage());
        }
    }


    public List<BaseCargo> getAllCargos() {
        List<BaseCargo> cargoList = new ArrayList<>();
        String sql = "SELECT id, receiver_name, destination_address, status, sender_name FROM cargos";
        try (Connection conn = DataBaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                BaseCargo baseCargo = new BaseCargo();
                baseCargo.setId(rs.getInt("id"));
                baseCargo.setSenderName(rs.getString("sender_name"));
                baseCargo.setReceiverName(rs.getString("receiver_name"));
                baseCargo.setDestinationAddress(rs.getString("destination_address"));
                baseCargo.setStatus(rs.getString("status"));
                cargoList.add(baseCargo);
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving all cargos: " + e.getMessage());
        }
        return cargoList;
    }
}
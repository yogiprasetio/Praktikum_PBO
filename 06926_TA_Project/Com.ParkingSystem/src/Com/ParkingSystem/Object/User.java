package Com.ParkingSystem.Object;

/**
 *
 * @author yogi-06926
 */
public class User {
    private String namaUser,password,id;

    public User(String nama,String password,String id) {
        setNamaUser(nama);
        setPassword(password);
        setId(id);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setNamaUser(String nama) {
        this.namaUser = nama;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getNamaUser() {
        return namaUser;
    }
    
    
    
    
}

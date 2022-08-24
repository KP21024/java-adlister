public class ListAdsDao implements Ads {

    private Connection connection;

    public AdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        } catch (SQLException sqle) {
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while (rs.next()){
                Ad ad = new Ad(rs.getLong("id"),
                        rs.getString("userid"),
                        rs.getString("title"),
                        rs.getString("description")
                );
            }
        } catch (SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
        return null;
    }



    @Override
    public Long insert(Ad ad) {
        return null;
    }
}

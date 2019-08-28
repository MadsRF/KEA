import java.sql.*;

class Queries {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/kailua_db";
    private static Connection con;


    void insert(int car_id, String fuel_type, String reg_nr, String f_reg_date, int odometer /*int fk_model_id, int fk_customer_id, int fk_type_familiy_id,int fk_type_sport_id,int fk_type_luxury_id*/) {
        try {
            con = null;
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, "root", "mads1234");

            PreparedStatement statement = con.prepareStatement("INSERT INTO car(car_id, fuel_type, reg_nr, f_reg_date, odometer)VALUES(?,?,?,?,?)");

            statement.setInt(1, car_id);
            statement.setString(2, fuel_type);
            statement.setString(3, reg_nr);
            statement.setString(4, f_reg_date);
            statement.setInt(5, odometer);
            //statement.setInt(6, fk_customer_id);
            //statement.setInt(7, fk_model_id);
            //statement.setInt(7, fk_type_familiy_id);
            //statement.setInt(8, fk_type_sport_id);
            //statement.setInt(9, fk_type_luxury_id);

            statement.executeUpdate();
            System.out.println("Car is now saved in the database");
            statement.close();
            con.close();
        } catch (SQLException sqlex) {
            try {
                System.out.println(sqlex.getMessage());
                con.close();

            } catch (SQLException sql) {
            }
        } catch (ClassNotFoundException noClass) {
            System.err.println("Driver Class not found");
            System.out.println(noClass.getMessage());
            System.exit(1);
        }
    }

    void delete(int car_id){

        try{
        con = null;
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DATABASE_URL, "root", "mads1234");

        PreparedStatement statement = con.prepareStatement("DELETE FROM car WHERE car_id = ?");

        statement.setInt(1, car_id);
        statement.executeUpdate();

        System.out.println("Car is now deleted from the database");
        statement.close();
        con.close();
        } catch (SQLException sqlex) {
            try {
                System.out.println(sqlex.getMessage());
                con.close();
                System.exit(1);
            } catch (SQLException sql) {
            }
        } catch (ClassNotFoundException noClass) {
            System.err.println("Driver Class not found");
            System.out.println(noClass.getMessage());
            System.exit(1);
        }
    }

    void update(int car_id, int car_id1, String fuel_type, String reg_nr, String f_reg_date, int odometer){
        try{
            con = null;
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, "root", "mads1234");

            PreparedStatement statement = con.prepareStatement("UPDATE car SET car_id = ?, fuel_type = ?, reg_nr = ?, f_reg_date = ?, odometer = ? " +
                    "WHERE car_id = ?");

            statement.setInt(6, car_id);
            statement.setInt(1, car_id1);
            statement.setString(2, fuel_type);
            statement.setString(3, reg_nr);
            statement.setString(4, f_reg_date);
            statement.setInt(5, odometer);

            statement.executeUpdate();

            System.out.println("Car is now updated from the database");
            statement.close();
            con.close();
        } catch (SQLException sqlex) {
            try {
                System.out.println(sqlex.getMessage());
                con.close();
                System.exit(1);
            } catch (SQLException sql) {
            }
        } catch (ClassNotFoundException noClass) {
            System.err.println("Driver Class not found");
            System.out.println(noClass.getMessage());
            System.exit(1);
        }
    }

    void selectWhere(String columnTemp, String valueTemp){
        try{
        con = null;
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DATABASE_URL, "root", "mads1234");

        String sql = "SELECT * FROM car WHERE " + columnTemp + " = ?";

        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, valueTemp);

        ResultSet rs = statement.executeQuery();

        if (rs != null) {
            while (rs.next()) {
                System.out.printf("Car ID:      %15S\n", rs.getString("car_id"));
                System.out.printf("Fuel type:   %15S\n", rs.getString("fuel_type"));
                System.out.printf("Reg. nr:     %15S\n", rs.getString("reg_nr"));
                System.out.printf("1. reg. date:%15S\n", rs.getString("f_reg_date"));
                System.out.printf("Odometer:    %15S\n", rs.getString("odometer"));
                System.out.printf("Model:       %15S\n", rs.getString("fk_model_id"));
                System.out.printf("Customer ID: %15S\n", rs.getString("fk_customer_id"));
                System.out.printf("Family:      %15S\n", rs.getString("fk_type_family_id"));
                System.out.printf("Sport:       %15S\n", rs.getString("fk_type_sport_id"));
                System.out.printf("Luxury:      %15S\n\n\n", rs.getString("fk_type_luxury_id"));
            }
        }
        statement.close();
        con.close();
    } catch (SQLException sqlex) {
        try {
            System.out.println(sqlex.getMessage());
            con.close();
            System.exit(1);
        } catch (SQLException sql) {
        }
    } catch (ClassNotFoundException noClass) {
        System.err.println("Driver Class not found");
        System.out.println(noClass.getMessage());
        System.exit(1);
    }
}

    void selectAll() {
        try {
            con = null;
            Statement s = null;
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, "root", "mads1234");
            s = con.createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM car;");

            if (rs != null)
                while (rs.next()) {
                    System.out.printf("Car ID:      %15S\n", rs.getString("car_id"));
                    System.out.printf("Fuel type:   %15S\n", rs.getString("fuel_type"));
                    System.out.printf("Reg. nr:     %15S\n", rs.getString("reg_nr"));
                    System.out.printf("1. reg. date:%15S\n", rs.getString("f_reg_date"));
                    System.out.printf("Odometer:    %15S\n", rs.getString("odometer"));
                    System.out.printf("Model:       %15S\n", rs.getString("fk_model_id"));
                    System.out.printf("Customer ID: %15S\n", rs.getString("fk_customer_id"));
                    System.out.printf("Family:      %15S\n", rs.getString("fk_type_family_id"));
                    System.out.printf("Sport:       %15S\n", rs.getString("fk_type_sport_id"));
                    System.out.printf("Luxury:      %15S\n\n\n", rs.getString("fk_type_luxury_id"));
                }
            s.close();
            con.close();
        } catch (SQLException sqlex) {
            try {
                System.out.println(sqlex.getMessage());
                con.close();
                System.exit(1);
            } catch (SQLException sql) {
            }
        } catch (ClassNotFoundException noClass) {
            System.err.println("Driver Class not found");
            System.out.println(noClass.getMessage());
            System.exit(1);
        }
    }
}


















package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.DataSources;

public class ConnectDB {
	 public static Connection getConnection()
	    {
	        if(ds == null)
	            try
	            {
	                ds = DataSources.pooledDataSource(DataSources.unpooledDataSource(jdbcURL));
	            }
	            catch(SQLException e)
	            {
	                e.printStackTrace();
	                System.exit(1);
	            }
	        try
	        {
	            Connection c = ds.getConnection();
	            return c;
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    private static String jdbcURL = "jdbc:mysql://localhost/appRiabilitazione?user=root&password=root";
	    private static DataSource ds;

	}

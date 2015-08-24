import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DayDao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	
	private static final String DVN = "com.mysql.jdbc.Driver";
	private static final String DBU = "jdbc:mysql://127.0.0.1:3306/test";
	private static final String DB_ID = "root";
	private static final String DB_PW = "hanbit";
	
	
	public DayDao() {

		try {
			Class.forName(DVN);

			con = DriverManager.getConnection(DBU, DB_ID, DB_PW);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DayDao(Connection con, Statement stmt, PreparedStatement pstmt, ResultSet rs, String sql) {
		super();
		this.con = con;
		this.stmt = stmt;
		this.pstmt = pstmt;
		this.rs = rs;
		this.sql = sql;
	}

	public void insert(Today account) {

		try {
			String sql = "insert into todo(title)"
					+ " values(?)";

			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, account.getTitle());
//			pstmt.setString(2, account.getToDo());
//			pstmt.setString(3, account.getLocation());
//			pstmt.setString(4, account.getDescribed());
//			pstmt.setString(5, account.getYear());
//			pstmt.setString(6, account.getWeek());
//			pstmt.setString(7, account.getDay());
//			pstmt.setString(8, account.getHours());
			int result = pstmt.executeUpdate();
			System.out.println("update result: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert(Today account, int temp) {

		try {
			String sql = "insert into todo(title)"
					+ " values(?)";

			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, account.getTitle());
//			pstmt.setString(2, account.getToDo());
//			pstmt.setString(3, account.getLocation());
//			pstmt.setString(4, account.getDescribed());
//			pstmt.setString(5, account.getYear());
//			pstmt.setString(6, account.getWeek());
//			pstmt.setString(7, account.getDay());
//			pstmt.setString(8, account.getHours());
			int result = pstmt.executeUpdate();
			System.out.println("update result: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void update(DayDao account){		
//		try {
//			sql = "update todo set ?=? where ?=?";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, account.getBalance());
//			pstmt.setString(2, account.getAccountNum());
//			
//			int result = pstmt.executeUpdate();
//			System.out.println("update result: " + result);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//	}
	
	public void delete(String accountNum) {
		try {
			sql = "delete from todo where either=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNum);
			int result = pstmt.executeUpdate();
			System.out.println("delete result:" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Today select(String accountNum) {
		Today result = null;
		try {

			sql = "select * from todo where count=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNum);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = new Today();
				result.setTitle(rs.getString(1));
				result.setToDo(rs.getString(2));
				result.setLocation(rs.getString(3));
				result.setDescribed(rs.getString(4));
				result.setYear(rs.getString(5));
				result.setWeek(rs.getString(6));
				result.setDay(rs.getString(7));
				result.setHours(rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public Today select() {
		Today result = null;
		try {

			sql = "select * from todo";
			pstmt = con.prepareStatement(sql);
			//pstmt.setString(1, accountNum);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = new Today();
				result.setTitle(rs.getString(1));
				result.setToDo(rs.getString(2));
				result.setLocation(rs.getString(3));
				result.setDescribed(rs.getString(4));
				result.setYear(rs.getString(5));
				result.setWeek(rs.getString(6));
				result.setDay(rs.getString(7));
				result.setHours(rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	public List<Today> selectList(){
		List<Today> result = new ArrayList<>();
				
		try {
			sql = "select * from todo";
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				Today account = new Today();
				account.setTitle(rs.getString(1));
				account.setToDo(rs.getString(2));
				account.setLocation(rs.getString(3));
				account.setDescribed(rs.getString(4));
				account.setYear(rs.getString(5));
				account.setWeek(rs.getString(6));
				account.setDay(rs.getString(7));
				account.setHours(rs.getString(8));
				
				result.add(account);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
	}
	
	public void finalize() {
		if (rs != null) {

			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (pstmt != null) {

			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	
	
	

}

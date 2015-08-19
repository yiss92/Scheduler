import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exam02.BankAccount;

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
	
	
	public BankDao() {

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

	public BankDao(Connection con, Statement stmt, PreparedStatement pstmt, ResultSet rs, String sql) {
		super();
		this.con = con;
		this.stmt = stmt;
		this.pstmt = pstmt;
		this.rs = rs;
		this.sql = sql;
	}

	public void insert(BankAccount account) {

		try {
			String sql = "insert into bank_tb(ownername, accountnum, password, balance)"
					+ " values(?,?,?,?)";

			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, account.getOwnerName());
			pstmt.setString(2, account.getAccountNum());
			pstmt.setString(3, account.getPassword());
			pstmt.setInt(4, account.getBalance());
			int result = pstmt.executeUpdate();
			System.out.println("update result: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(BankAccount account){		
		try {
			sql = "update bank_tb set balance=? where accountnum=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, account.getBalance());
			pstmt.setString(2, account.getAccountNum());
			
			int result = pstmt.executeUpdate();
			System.out.println("update result: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void deleteAccount(){		
		sql = "DROP table bank_tb";  // DROP TABLE 테이블이름;		
		try {
			pstmt = con.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void delete(String accountNum) {
		try {
			sql = "delete from bank_tb where accountnum=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNum);
			int result = pstmt.executeUpdate();
			System.out.println("delete result:" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BankAccount select(String accountNum) {
		BankAccount result = null;
		try {

			sql = "select * from bank_tb where accountnum=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNum);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = new BankAccount();
				result.setOwnerName(rs.getString(1));
				result.setAccountNum(rs.getString(2));
				result.setPassword(rs.getString(3));
				result.setBalance(rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<BankAccount> selectList(){
		List<BankAccount> result = new ArrayList<>();
				
		try {
			sql = "select * from bank_tb";
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				BankAccount account = new BankAccount();
				account.setOwnerName(rs.getString(1));
				account.setAccountNum(rs.getString(2));
				account.setPassword(rs.getString(3));
				account.setBalance(rs.getInt(4));
				
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
	
	

}

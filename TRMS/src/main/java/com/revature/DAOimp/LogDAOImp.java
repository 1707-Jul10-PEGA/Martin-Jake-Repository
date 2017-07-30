package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.LogDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Approval_Status;
import com.revature.objects.Log;

public class LogDAOImp implements LogDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;

	public void setup() {
		cf = ConnectionFactory.getInstance();
	}

	public LogDAOImp() {
		super();

		setup();

	}

	@Override
	public List<Log> getAllLogs() {

		conn = cf.getConnection();
		String sql = "SELECT * FROM LOG";
		Statement s;

		List<Log> al = new ArrayList<Log>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				Log l = new Log(rs.getDate(2).toString(), rs.getString(3));
				l.setLOG_ID(rs.getString(1));
				al.add(l);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return al;
	}

	@Override
	public Log getLog(String logid) {

		conn = cf.getConnection();
		String sql = "SELECT * FROM LOG WHERE LOG_ID=?";
		Log ap = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, logid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new Log(rs.getDate(2).toString(), rs.getString(3));
				ap.setLOG_ID(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ap;

	}

	@Override
	public void addLog(Log l) {

		conn = cf.getConnection();
		String sql = "INSERT INTO LOG (Log_ID, Log_Datetime, Log_Text) VALUES (?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, l.getLOG_ID());
			ps.setDate(2, Date.valueOf(l.getLOG_DATETIME()));
			ps.setString(3, l.getLOG_TEXT());
			ps.executeUpdate();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateLog(String logID, Log log) {

		conn = cf.getConnection();
		String sql = "UPDATE LOG SET " + "Log_ID=?, Log_datetime=?, Log_text=?" + "WHERE Log_ID=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, log.getLOG_ID());
			ps.setDate(2, Date.valueOf(log.getLOG_DATETIME()));
			ps.setString(3, log.getLOG_TEXT());
			ps.setString(4, logID);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteLog(String logID) {
		// TODO Auto-generated method stub
		//Not yet implemented.
	}

}

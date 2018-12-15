package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Subject;

@Repository
public class SubjectDAO {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from subjects";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	

	// query and return a single object
	public Subject getSubject(String year, String semester) {
		String sqlStatement = "select * from subjects where year = ? and semester = ?";
		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { year, semester }, new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();

				subject.setYear(rs.getString("year"));
				subject.setSemester(rs.getString("semester"));
				subject.setCode(rs.getString("code"));
				subject.setName(rs.getString("name"));
				subject.setDivision(rs.getString("division"));
				subject.setCredit(rs.getString("credit"));

				return subject;
			}
		});
	}

	public List<Subject> getSubjects(String year, String semester) {
		String sqlStatement = "select * from subjects where year = ? and semester = ?";
		return jdbcTemplate.query(sqlStatement, new Object[] {year, semester}, new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();

				subject.setYear(rs.getString("year"));
				subject.setSemester(rs.getString("semester"));
				subject.setCode(rs.getString("code"));
				subject.setName(rs.getString("name"));
				subject.setDivision(rs.getString("division"));
				subject.setCredit(rs.getString("credit"));

				return subject;
			}
		});
	}

	public boolean insert(Subject subject) {
		String year = "2019";
		String semester = "1";
		String code = subject.getCode();
		String name = subject.getName();
		String division = subject.getDivision();
		String credit = subject.getCredit();

		String sqlStatement = "insert into subjects (year, semester, code, name, division, credit) values (?,?,?,?,?,?)";
		return (jdbcTemplate.update(sqlStatement, new Object[] { year, semester, code, name, division, credit }) == 1);
	}

}

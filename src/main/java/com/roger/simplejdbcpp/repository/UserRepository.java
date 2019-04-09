package com.roger.simplejdbcpp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.roger.simplejdbcpp.model.User;

@Repository
public class UserRepository {

	/*
	 * 
	 * autowired jdbc template creando un objeto de jdbc template
	 * 
	 */

	@Autowired
	JdbcTemplate jdbcTemplate;

	/*
	 * 
	 * return lista usuarios
	 */

	public List<User> getAllUserNames() {
		final String sql = "select * from usuario u inner join empleado e using(idEmpleado)";
		//List<String> usernameList = new ArrayList<>();

		List<User> to = (List<User>) jdbcTemplate.query(sql, new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User to = new User();
				to.setIdUsuario(rs.getInt("idUsuario"));
				to.setNick(rs.getString("nick"));
				to.setContrasena(rs.getString("contrasena"));
				to.setNombreEmp(rs.getString("nombreEmp"));

				return to;
			}

		});

		if (to.size() > 0) {
			return to;
		}

		return null;

		// return usernameList;
	}

}

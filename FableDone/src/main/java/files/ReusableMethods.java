package files;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import domains.Order;

public class ReusableMethods {

	public static XmlPath rawToXML(Response res) {

		String responseString = res.asString();
		XmlPath x = new XmlPath(responseString);

		return x;
	}

	public static JsonPath rawToJson(Response res) {

		String responseString = res.asString();
		JsonPath js = new JsonPath(responseString);

		return js;
	}

	public static void insertData(int domainIdd, String domainNamee,
			String statuss, String expiress, String autoRenew,
			String createdAtt, String domainProviderr) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate
				.update("INSERT INTO domain(domainId, domainName, status, expires, renewAuto, createdAt, domainProvider)"
						+ "VALUES (?,?,?,?,?,?,?) domainIdd, domainNamee, statuss, expiress, autoRenew, createdAtt, domainProviderr ");
	}

	public static List<Order> getData() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		List<Order> fromDatabase = jdbcTemplate.query("select * from domain",
				new OrderMapper());

		return fromDatabase;
	}

}

class OrderMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order(rs.getInt("domainId"),
				rs.getString("domainName"), rs.getString("status"),
				rs.getString("expires"), rs.getString("renewAuto"),
				rs.getString("createdAt"), rs.getString("domainProvider"));
		return order;
	}

}

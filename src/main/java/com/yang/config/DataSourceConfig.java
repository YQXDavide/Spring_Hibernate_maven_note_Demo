package com.yang.config;

import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 要使用注解实现DataSource（C3P0）需要解决连接数据库的问题
 * @author yang
 *
 */
@Component
public class DataSourceConfig {
	@Value("${jdbc.driverClassName}")
	private String driverClass;
	
	@Value("${jdbc.jdbcUrl}")
	private String jdbcUrl;
	
	@Value("${jdbc.user}")
	private String user;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Bean(name="dataSource")
	public ComboPooledDataSource createComboPooledDataSource() {
		ComboPooledDataSource combo = new ComboPooledDataSource();
		try {
			combo.setDriverClass(driverClass);
			combo.setJdbcUrl(jdbcUrl);
			combo.setUser(user);
			combo.setPassword(password);
			
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		return combo;
	}
}

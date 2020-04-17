package com.kcc.soo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement 

@PropertySource("classpath:com/kcc/soo/conf/jdbc.properties")
public class DatabaseConfig {
  
  @Value("${jdbc.driver}") String jdbcDriver;

  @Value("${jdbc.url}") String jdbcUrl;
  
  @Value("${jdbc.username}") String jdbcUsername;
  
  @Value("${jdbc.password}") String jdbcPassword;
  
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName(this.jdbcDriver); 
    ds.setUrl(this.jdbcUrl);
    ds.setUsername(this.jdbcUsername);
    ds.setPassword(this.jdbcPassword);
    return ds;
  }
  
  // 트랜잭션을 적용할 DAO가 사용하는 것과 동일한 DataSource를 빈으로 제공해줘야 한다.
  @Bean
  public PlatformTransactionManager transactionManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }
}
package ru.matritca.logbook.datasource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by Vasiliy on 16.07.2015.
 */
@Configuration
public class DatasourceConfig {

//    @Bean
//    public DataSource dataSource(){
//        BasicDataSource ds = new BasicDataSource();
//        ds.setUrl("jdbc:hsqldb:file:logdb/test");
//        ds.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
//        ds.setUsername("sa");
//        ds.setPassword("");
//        return ds;
//    }
    @Bean
    public DataSource dataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:h2:file:C:\\Users\\Василий\\IdeaProjects\\LogBook\\h2data/h2logbook");
        ds.setDriverClassName("org.h2.Driver");
      //  ds.setUsername("sa");
//        ds.setPassword("");
        return ds;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter =
                new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setDatabase(Database.H2);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        hibernateJpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
        return hibernateJpaVendorAdapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){

        LocalContainerEntityManagerFactoryBean factoryBean =
                new LocalContainerEntityManagerFactoryBean();
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("ru.matritca.logbook.domain");
        return factoryBean;
    }



}

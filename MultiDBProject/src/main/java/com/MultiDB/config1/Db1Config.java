package com.MultiDB.config1;

import java.util.HashMap;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
basePackages = "com.MultiDB.repo.customer",                      // 📌 Repository package
entityManagerFactoryRef = "db1EntityManager",                    // 📌 EntityManager reference
transactionManagerRef = "db1TransactionManager"                  // 📌 Transaction reference
)
public class Db1Config {

// 📌 1) Creating DataSource for DB1 (Customer DB)
@Bean
@ConfigurationProperties(prefix = "db1.datasource")
public DataSource db1DataSource() {
    return DataSourceBuilder.create().build();
}

// 📌 2) Creating EntityManagerFactory for DB1
@Bean(name = "db1EntityManager")
public LocalContainerEntityManagerFactoryBean db1EntityManager(EntityManagerFactoryBuilder builder) {

    // 🔧 Hibernate properties for DB1
    HashMap<String, Object> properties = new HashMap<>();
    properties.put("hibernate.hbm2ddl.auto", "update");                        // Auto table maintain
    properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect"); // MySQL Dialect
    properties.put("hibernate.show_sql", true);
    properties.put("hibernate.format_sql", true);

    return builder
            .dataSource(db1DataSource())                                        // Attach DB1 DataSource
            .packages("com.MultiDB.model.customer")                             // 📍 Entity package
            .properties(properties)                                             // Hibernate props
            .persistenceUnit("finishers")                                             // Unique unit name
            .build();
}

// 📌 3) Creating Transaction Manager for DB1
@Bean
public PlatformTransactionManager db1TransactionManager(
        @Qualifier("db1EntityManager") EntityManagerFactory factory) {

    return new JpaTransactionManager(factory);
}


}

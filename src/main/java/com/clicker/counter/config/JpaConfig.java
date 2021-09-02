package com.clicker.counter.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@RequiredArgsConstructor
@Configuration
public class JpaConfig {

    private final DataSource dataSource;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        var factory = new LocalContainerEntityManagerFactoryBean();

        factory.setJpaVendorAdapter(jpaVendorAdapter());
        factory.setPackagesToScan("com");
        factory.setDataSource(dataSource);

        return factory;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        var adapter = new HibernateJpaVendorAdapter();
        adapter.setGenerateDdl(true);
        return adapter;
    }

}

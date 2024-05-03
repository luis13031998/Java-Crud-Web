package com.negocio.venta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.init.DataSourceScriptDatabaseInitializer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NegocioVentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NegocioVentaApplication.class, args);
	}

}

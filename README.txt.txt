
IMPORTANTE: comprobar tus versiones y tu puerto mysql y cambiarlo en el archivo /resources/application.propierties

	mysql-connector-java       <version>8.0.31</version>
	jakarta.persistence-api    <version>3.1.0</version>	

DEPENDENCIAS DEL POM AL FINAL DEL ARCHIVO 
	


	Parte de Back del la aplicaccion "HOMLESS HELPER"

	
	Notas:
			- Creados slos endpoint de las tablas Usuario, About Us 


		Funciona correctamente:
		
			Endpoint:
					Usuario: usuario	usuario/{id}	
			
					About us: about		about/{id}

	




	NOTA: para poder arracar la aplicacion hace falta la parte de kotlin (acceso en repositorio privado)




-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.31</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api -->
		<dependency>
			<groupId>jakarta.persistence</groupId>
			<artifactId>jakarta.persistence-api</artifactId>
			<version>3.1.0</version>
		</dependency>

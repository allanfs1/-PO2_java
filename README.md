# Projeto java Formulário
**Athor:Allan**
**Data:?/07/2019**
**Linguagem:Java**

*Java Database
Connectivity (JDBC)*

 *VS:5.1.48* 

 ## Tabela de Cadastro:

> Formulário
|#Nome                |      #sexo         | #Data     | #CPF |      
|:--------------------|:------------------:|-----------|-----:|
|Newton               |        M           |2000/0/0   |100033|
|Allan                |        M           |1994/06/28 |611112|
|Helio                |        M           |1994/03/22 |523456|
|Eduardo              |        M           |2003/01/12 |434667|
|Fernando             |        M           |2002/04/17 |224678|
|---------------------|--------------------|-----------|------|


**SQL**

```sql
CREATE TABLE tb_Pessoas (
id_pessoas INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
idade tinyint(255),
dt_nacimento DATE  DEFAULT "2000/6/1/",
sexo ENUM('M','F'),
rg  VARCHAR(10) NOT NULL,
cpf VARCHAR(10),
  CONSTRAINT PK_pessoas PRIMARY KEY (id_pessoas)
)ENGINE = innoDB;
```
##Java

  >  DRIVE = "com.mysql.jdbc.Driver";
  > "jdbc:mysql://localhost:3306/dbpizzaria";
  >  USER = "root";
  >  PASS = "root";
  
> Classes import

> ### JAVA.SQL E JAVAX.SQL
> import com.mysql.jdbc.Driver;
> import java.sql.Connection;
> import java.sql.DriverManager;
> import java.sql.PreparedStatement;
> import java.sql.ResultSet;
> import java.sql.SQLException;




# Projeto JDBC com Padrão DAO

## 📌 Descrição

Projeto desenvolvido em **Java utilizando JDBC puro**, com foco no aprendizado profundo de **acesso a banco de dados relacional**, **SQL** e aplicação correta do **padrão de projeto DAO (Data Access Object)**.

O projeto implementa um **CRUD completo** para as entidades `Seller` e `Department`, incluindo relacionamento entre elas, reaproveitamento de objetos e **tratamento de exceções customizadas**, sem uso de frameworks ORM como JPA ou Hibernate.

Este projeto foi criado com fins **educacionais**, visando compreender o que frameworks abstraem internamente.

---

## 🛠️ Tecnologias utilizadas

* Java
* JDBC (Java Database Connectivity)
* MySQL
* MySQL Connector/J
* Git e GitHub

---

## 🧱 Estrutura do projeto

```
src/
 ├── application
 │   └── Program.java
 ├── db
 │   ├── DB.java
 │   ├── DbException.java
 │   └── DbIntegrityException.java
 ├── model
 │   ├── entities
 │   │   ├── Seller.java
 │   │   └── Department.java
 │   └── dao
 │       ├── SellerDao.java
 │       ├── DepartmentDao.java
 │       ├── DaoFactory.java
 │       └── impl
 │           ├── SellerDaoJDBC.java
 │           └── DepartmentDaoJDBC.java
```

---

## 🧩 Conceitos aplicados

* JDBC puro (sem frameworks)
* Padrão DAO (Data Access Object)
* Separação de responsabilidades
* Relacionamento entre entidades (Many-to-One)
* Uso de `PreparedStatement`
* Recuperação de chaves geradas (`RETURN_GENERATED_KEYS`)
* Tratamento de exceções customizadas
* Reaproveitamento de objetos com `Map` para evitar duplicações
* Versionamento com Git

---

## 🗃️ Modelo de dados

### Department

* id
* name

### Seller

* id
* name
* email
* birthDate
* baseSalary
* department

Relacionamento:

* **Seller → Department (Many-to-One)**

---

## ⚙️ Como executar o projeto

### Pré-requisitos

* Java instalado
* MySQL Server
* MySQL Connector/J (.jar) adicionado ao projeto

### Passos

1. Criar o banco de dados:

```sql
CREATE DATABASE coursejdbc;
```

2. Criar as tabelas utilizando o script SQL do projeto.

3. Criar o arquivo `db.properties` na raiz do projeto:

```properties
user=seu_usuario
password=sua_senha
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false
```

4. Executar a classe `Program` para testar as operações CRUD.

---

## 🎯 Objetivo do projeto

Este projeto tem como objetivo:

* Consolidar os fundamentos de JDBC
* Entender o mapeamento manual entre tabelas e objetos
* Aplicar corretamente o padrão DAO
* Criar uma base sólida para o aprendizado de JPA/Hibernate

---

## 👤 Autor

Projeto desenvolvido por **Davi Rezo** para fins de estudo em Java Back-end.

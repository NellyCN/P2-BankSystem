# Proyect 2 - Sistema Gestión Clientes y sus Ctas Bancarias

## 1. Diagrama de Componentes

![XYZ_Bank_System-Diagrama_de_Componentes](https://github.com/user-attachments/assets/4d624f57-fafb-482a-87e9-aca01b4b5058)

## 2. Diagrama de Secuencia

![XYZ_Bank_System-Secuence Diagram-Ms-Customers](https://github.com/user-attachments/assets/1453ee30-1cff-4c6a-a6c6-dab659877562)

![XYZ_Bank_System-Secuence Diagram-Ms-Accounts](https://github.com/user-attachments/assets/956d1c05-2678-44e7-9487-78a1da68204f)

## 3. Requisitos Funcionales

### 3.1 Funcionalidades del Sistema

+ El sistema permite **Creación de Cliente**.
+ El sistema permite **Creación de Cuentas**.
+ El sistema permite **Realizar transacciones entre cuentas**.
+ El sistema permite **Crear, leer, actualizar y eliminar (CRUD) información de clientes**.
+ El sistema permite **Crear cuenta de Clientes**.
+ El sistema permite **Listar todas las cuentas bancarias**.
+ El sistema permite **Obtener detalles de una cuenta por su ID**.
+ El sistema permite **Realizar un depósito en una cuenta bancaria**.
+ El sistema permite **Realizar un retiro en una cuenta bancaria**.
+ El sistema permite **Elimiar una cuenta bancaria**.


#### 3.1.1 Reglas del Negocio:

+ El DNI es único para cada cliente
+ No se permite eliminar un cliente si tiene cuentas activas

#### 3.1.2 Validaciones de Cuenta Bancaria:
+ El saldo inicial de una cuenta debe ser mayor a 0.
+ No se puede realizar un retiro que deje el saldo en negativo para cuentas de ahorro.
+ Las cuentas corrientes pueden tener un sobregiro de hasta -500.

### 3.2 Herramientas

+ Aplicación de diagramas UMl, Drawio
+ Java 17
+ IntelliJ IDEA
+ Maven
+ MySQL
+ Postman

## 4. Ejecución

Ejecutar proyecto en el IDE y postman.
Ejecutar consultas en MySql

## 4. Prints de la creación de la Base de Datos.
![create_table_account.png](Sentencias%20SQL%2Fcreate_table_account.png)
![Create_table_customer.png](Sentencias%20SQL%2FCreate_table_customer.png)
![describe_account.png](Sentencias%20SQL%2Fdescribe_account.png)
![describe_customer.png](Sentencias%20SQL%2Fdescribe_customer.png)
![insert_data_account.png](Sentencias%20SQL%2Finsert_data_account.png)
![insert_data_customer.png](Sentencias%20SQL%2Finsert_data_customer.png)
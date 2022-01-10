# Leo's app

### DB

```sql
create user 'woong'@'%' identified by '1234';
GRANT ALL PRIVILEGES ON *.* TO 'woong'@'%';
create database woong;
```


### yml 설정

```yml
server:
  port: 8090
  servlet:
    context-path: /
    encoding:
      charset: utf-8
      enabled: true
    
server:
  port: 8081

spring:
  datasource:
    url: jdbc:postgresql://localhost:1521/woong
    username: woong
    password: 1234
    driver-class-name: org.postgresql.Driver
```

### vue 설정

```bash
npm install -g @vue/cli
vue --version
vue create frontend
```

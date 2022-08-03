# swagger_test_project

# io.springfox >= 2.X
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger-ui</artifactId>
  <version>2.9.2</version>
</dependency>
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger2</artifactId>
  <version>2.9.2</version>
</dependency>
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-schema</artifactId>
  <version>2.9.2</version>
</dependency>

@Configuration
@EnableSwagger2

browser URL
http://localhost:8080/swagger-ui.html

########################################################################
########################################################################
io.springfox >= 3.X
<dependency>
 <groupId>io.springfox</groupId>
 <artifactId>springfox-boot-starter</artifactId>
 <version>3.0.0</version>
</dependency>

browser URL
http://localhost:8080/swagger-ui/
http://localhost:8080/swagger-ui/index.html

@Configuration
@EnableSwagger2

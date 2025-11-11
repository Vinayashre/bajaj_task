Project: Bajaj Backend Webhook Task
Name: Vinayashree N Ghatkamble
Email: vinaya212044@gmail.com
Description:
- Developed using Spring Boot 3.5.7 and Java 21
- Successfully connects to MySQL database (bajajtask_db)
- JPA repository and entity verified
- Webhook generation implemented using RestTemplate
- Application compiles and runs successfully

Note:
If the webhook API returns 500 INTERNAL_SERVER_ERROR, it is likely due to email mismatch with the registered Bajaj email ID, not a code issue.

How to Run:
1. Import the project into IntelliJ or VS Code.
2. Configure MySQL credentials in `application.properties`.
3. Run with command: `mvn spring-boot:run`
4. Check console output for webhook response.

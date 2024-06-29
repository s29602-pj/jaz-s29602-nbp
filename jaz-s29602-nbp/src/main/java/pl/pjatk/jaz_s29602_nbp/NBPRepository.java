package pl.pjatk.jaz_s29602_nbp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NBPRepository extends JpaRepository<KursyWalut, Long> {
    /*To powinno się znaleść w application.properties
    spring.jpa.hibernate.ddl-auto=validate
    spring.datasource.url=jdbc:mariadb://szuflandia.pjwstk.edu.pl:3306/s29602
    spring.datasource.username=s29602
    spring.datasource.password=Bar.Demb
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.properties.hibernate.format_sql=true*/
}

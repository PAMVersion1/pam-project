package team.chichi.pamback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
src/main/java : 패키지와 클래스 파일
src/main/resource 
-static : css/js 파일
-templates : html파일(표준)
-application.properties : 환경설정파일
-build.gradle : Gradle 라이브러리 설정파일
*/

@EnableScheduling // 스케줄러를 사용하기 위한 어노테이션
@SpringBootApplication
public class PambackApplication {

	public static void main(String[] args) { // main 메소드
		SpringApplication.run(PambackApplication.class, args);
	}

	

}

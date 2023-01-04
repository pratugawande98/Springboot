package com.tns.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.tns.admin.AdminModuleApplication;
import com.tns.certificate.CertificateModuleApplication;
import com.tns.college.CollegeModuleApplication;
import com.tns.placement.PlacementModuleApplication;
import com.tns.student.StudentModuleApplication;
@Import({AdminModuleApplication.class,CertificateModuleApplication.class,CollegeModuleApplication.class,PlacementModuleApplication.class,StudentModuleApplication.class})
@SpringBootApplication

public class UserModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserModuleApplication.class, args);
	}

}

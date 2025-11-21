package com.delhi_publication.delhi_publication.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Author_Controller {
	
	
	
//	
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.data.domain.Page;
//	import org.springframework.data.domain.PageRequest;
//	import org.springframework.data.domain.Pageable;
//	import org.springframework.data.domain.Sort;
//	import org.springframework.stereotype.Service;
//
//	@Service
//	public class EmployeeService {
//
//	    @Autowired
//	    private EmployeeRepo repo;
//
//	    public Page<Employee> getEmployees(int page, int size, String sortBy) {
//	        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
//	        return repo.findAll(pageable);
//	    }
//	}
//
	
	
//	@Autowired
//    private EmployeeService service;
//
//    @GetMapping("/employees")
//    public Page<Employee> getEmployees(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "5") int size,
//            @RequestParam(defaultValue = "id") String sortBy
//    ) {
//
//        return service.getEmployees(page, size, sortBy);
//    }

//	
//	spring.datasource.url=jdbc:h2:mem:testdb
//			spring.datasource.driverClassName=org.h2.Driver
//			spring.datasource.username=sa
//			spring.datasource.password=
//
//			spring.jpa.hibernate.ddl-auto=update
//			spring.jpa.show-sql=true
//			spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
//
//			spring.h2.console.enabled=true
//			spring.h2.console.path=/h2-console
//}
	
	
//	{
//		  "content": [
//		    { "id": 1, "name": "Ajit", "salary": 50000 },
//		    { "id": 2, "name": "Ravi", "salary": 45000 }
//		  ],
//		  "pageable": {
//		    "pageNumber": 0,
//		    "pageSize": 5
//		  },
//		  "totalPages": 4,
//		  "totalElements": 20,
//		  "last": false,
//		  "first": true
//		}

}

package com.tns.user;

import java.util.List;
import com.tns.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired
	 private UserRepository repository;
	 
	 public List<User> listAll() 
	 {
	 return repository.findAll();
	 }
	 
	 public void save(User user) 
	 {
	 repository.save(user);
	 }
	 
	 public User get(Integer id) 
	 {
	 return repository.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repository.deleteById(id);

}

	 public ResponseEntity<Object> login(User user) {
			
			List<User> list = repository.findAll();
			int count=0;
			int index=0;
			//System.out.println(list.get(0).name);
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).name.equals(user.getName()))
				{
					count++;
					index=i;
				}
			}
			if(count>0)
			{
				if(list.get(index).password.equals(user.getPassword()))
				{
					return new ResponseEntity<>("Login Successfully!", HttpStatus.OK);
				}
				else 
				{
					return new ResponseEntity<>("Wrong password",HttpStatus.NOT_FOUND);
				}
			}
			else 
			{
				return new ResponseEntity<>("Username not register",HttpStatus.NOT_FOUND);
			}
		}

	
	
}
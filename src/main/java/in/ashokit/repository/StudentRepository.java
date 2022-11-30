package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>
{
	

}

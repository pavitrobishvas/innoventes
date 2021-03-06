package com.innoventes.user.service;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.ayusha.services.common.exceptions.DataPersistenceOperationException;
import com.ayusha.services.common.exceptions.InvalidServiceRequestException;
import com.ayusha.services.common.exceptions.ResourceNotFoundException;
import com.ayusha.user.data.models.EmployeeDataModel;
import com.innoventes.user.services.entity.EmployeeEntity;

public interface IEmployeeService {

	public ResponseEntity<Map<String, String>> saveAdd(EmployeeEntity userDataModel ) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public Page<EmployeeEntity> getAllEmp() throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public ResponseEntity<EmployeeEntity> getEmp(String eId) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public ResponseEntity<Map<String, String>> updateEmp(EmployeeDataModel userDataModel) throws DataPersistenceOperationException,ResourceNotFoundException,InvalidServiceRequestException;


}

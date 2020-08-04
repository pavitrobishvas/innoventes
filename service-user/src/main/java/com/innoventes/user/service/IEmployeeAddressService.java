package com.innoventes.user.service;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.ayusha.services.common.exceptions.DataPersistenceOperationException;
import com.ayusha.services.common.exceptions.InvalidServiceRequestException;
import com.ayusha.services.common.exceptions.ResourceNotFoundException;
import com.ayusha.user.data.models.EmployeeAddressDataModel;
import com.ayusha.user.data.models.EmployeeDataModel;
import com.innoventes.user.services.entity.EmployeeAddressEntity;
import com.innoventes.user.services.entity.EmployeeEntity;

public interface IEmployeeAddressService {

	
	public ResponseEntity<Map<String, String>> saveAdd(EmployeeAddressEntity userDataModel ) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public Page<EmployeeAddressEntity> getAllEmpAdd() throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public ResponseEntity<EmployeeAddressEntity> getEmpAdd(String eId) throws DataPersistenceOperationException,Exception,InvalidServiceRequestException,ResourceNotFoundException;

	public ResponseEntity<Map<String, String>> updateEmpAdd(EmployeeDataModel userDataModel) throws DataPersistenceOperationException,ResourceNotFoundException,InvalidServiceRequestException;

}

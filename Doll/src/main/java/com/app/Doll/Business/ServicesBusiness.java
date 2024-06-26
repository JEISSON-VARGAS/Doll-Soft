package com.app.Doll.Business;


import com.app.Doll.Dto.ServiceDto;
import com.app.Doll.Entity.ServiceEntity;
import com.app.Doll.Service.ServicesService;
import com.app.Doll.Utilites.Exceptions.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServicesBusiness {
    @Autowired
    private ServicesService servicesService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<ServiceDto> findAll() {
        try {
            List<ServiceEntity> serviceEntityList = servicesService.findAll();
            List<ServiceDto> serviceDtoList = new ArrayList<>();

            for (ServiceEntity service : serviceEntityList) {
                serviceDtoList.add(modelMapper.map(service, ServiceDto.class));
            }

            return serviceDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al obtener los servicios", e);

        }
    }

    public void create(ServiceDto serviceDto) {
        try {
            ServiceEntity service = modelMapper.map(serviceDto, ServiceEntity.class);
            servicesService.save(service);
        } catch (Exception e) {
            throw new CustomException("Error al crear el servicio", e);
        }
    }

    public void update(ServiceDto serviceDto) {
        try {
            ServiceEntity service = modelMapper.map(serviceDto, ServiceEntity.class);
            servicesService.update(service);
        } catch (Exception e) {
            throw new CustomException("Error al actualizar el servicio", e);
        }
    }

    public void delete(ServiceEntity entity) {
        try {
            servicesService.delete(entity);
        } catch (Exception e) {
            throw new CustomException("Error al eliminar el servicio", e);
        }
    }

}

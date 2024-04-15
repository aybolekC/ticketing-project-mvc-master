package com.aya.service.impl;

import com.aya.dto.RoleDTO;
import com.aya.entity.Role;
import com.aya.mapper.RoleMapper;
import com.aya.repository.RoleRepository;
import com.aya.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
//        //bring all the roles from DB
//        List<Role> roleList=roleRepository.findAll();
//
//        //convert entity to dto - Mapper
////        roleList.stream().map(obj->roleMapper.convertToDTO(obj));
//
//        List<RoleDTO> dtoList=roleList.stream().map(roleMapper::convertToDTO).collect(Collectors.toList());
//
//        return dtoList;

        return roleRepository.findAll().stream().map(roleMapper::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findByRoleId(Long id) {
        return null;
    }
}

package com.aya.converter;

import com.aya.dto.ProjectDTO;
import com.aya.service.ProjectService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
@ConfigurationPropertiesBinding
public class ProjectDtoConverter implements Converter<String, ProjectDTO>{

    ProjectService projectService;

    public ProjectDtoConverter(@Lazy ProjectService projectService) {
        this.projectService = projectService;
    }


    @Override
    public ProjectDTO convert(String source) {

        if(source==null || source.equals("")){
            return null;
        }

        return projectService.getByProjectCode(source);
    }
}




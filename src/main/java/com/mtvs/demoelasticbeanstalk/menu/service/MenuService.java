package com.mtvs.demoelasticbeanstalk.menu.service;

import com.mtvs.demoelasticbeanstalk.menu.dto.MenuDTO;
import com.mtvs.demoelasticbeanstalk.menu.entity.Menu;
import com.mtvs.demoelasticbeanstalk.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<MenuDTO> getAllMenus() {
        List<Menu> allMenus = menuRepository.findAll();
//        List<MenuDTO> list = new ArrayList<>();
//        for (Menu menu : allMenus) {
//            list.add(new MenuDTO(menu));
//        }
        List<MenuDTO> list = allMenus.stream().map(MenuDTO::new).collect(Collectors.toList());
        System.out.println(allMenus);
        return list;
    }
}

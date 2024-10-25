package com.mtvs.demoelasticbeanstalk.menu.controller;

import com.mtvs.demoelasticbeanstalk.menu.dto.MenuDTO;
import com.mtvs.demoelasticbeanstalk.menu.entity.Menu;
import com.mtvs.demoelasticbeanstalk.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/menu/all")
    public List<MenuDTO> getAllMenus() {
        List<MenuDTO> list = menuService.getAllMenus();
        log.info("[MenuController] : getAllMenus");
        return list;
    }
}

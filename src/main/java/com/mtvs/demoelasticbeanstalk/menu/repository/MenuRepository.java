package com.mtvs.demoelasticbeanstalk.menu.repository;


import com.mtvs.demoelasticbeanstalk.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}

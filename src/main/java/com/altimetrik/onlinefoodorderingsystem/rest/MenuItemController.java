/*
 * package com.altimetrik.onlinefoodorderingsystem.rest;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import com.altimetrik.onlinefoodorderingsystem.domain.MenuItem; import
 * com.altimetrik.onlinefoodorderingsystem.domain.MenuItemRepository;
 * 
 * import java.util.List;
 * 
 * @RestController
 * 
 * @RequestMapping("/menuItems") public class MenuItemController {
 * 
 * @Autowired private MenuItemRepository mir;
 * 
 * @GetMapping("/") public List<MenuItem> getMenItems() { return mir.findAll();
 * }
 * 
 * @GetMapping("/{id}") public MenuItem findMenuById(@PathVariable("id") Long
 * id) { return mir.findOne(id); }
 * 
 * @PostMapping("/")
 * 
 * @ResponseStatus(HttpStatus.CREATED) public void upload(@RequestBody
 * List<MenuItem> menuItemList) { mir.save(menuItemList); }
 * 
 * @DeleteMapping("/") public void deleteAll() { mir.deleteAll(); }
 * 
 * @DeleteMapping("/{id}") public void deleteById(@PathVariable("id") Long id) {
 * mir.delete(id); }
 * 
 * }
 */
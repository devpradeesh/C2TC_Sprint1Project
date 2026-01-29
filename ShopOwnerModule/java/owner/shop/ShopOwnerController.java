package owner.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopowners")
public class ShopOwnerController {

    @Autowired
    private ShopOwnerService service;

    @PostMapping
    public ShopOwner addOwner(@RequestBody ShopOwner owner) {
        return service.saveOwner(owner);
    }

    @GetMapping
    public List<ShopOwner> getAllOwners() {
        return service.getAllOwners();
    }

    @GetMapping("/{id}")
    public ShopOwner getOwner(@PathVariable int id) {
        return service.getOwnerById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteOwner(@PathVariable int id) {
        service.deleteOwner(id);
        return "Deleted Successfully";
    }
}

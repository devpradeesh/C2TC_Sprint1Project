package owner.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopOwnerService {

    @Autowired
    private ShopOwnerRepository repository;

    public ShopOwner saveOwner(ShopOwner owner) {
        return repository.save(owner);
    }

    public List<ShopOwner> getAllOwners() {
        return repository.findAll();
    }

    public ShopOwner getOwnerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteOwner(int id) {
        repository.deleteById(id);
    }
}

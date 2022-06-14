package pl.edu.wszib.jwdcolors.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwdcolors.dao.SelectedColorDao;
import pl.edu.wszib.jwdcolors.model.SelectedColor;
import pl.edu.wszib.jwdcolors.service.SelectedColorService;

import java.util.Date;
import java.util.List;

@Service
public class SelectedColorServiceImp implements SelectedColorService {

    @Autowired
    SelectedColorDao selectedColorDao;

    @Override
    public void save(String color) {
        selectedColorDao.save(new SelectedColor(color, new Date()));
    }

    @Override
    public void save(SelectedColor selectedColor) {
        selectedColorDao.save(selectedColor);
    }

    @Override
    public List<SelectedColor> getAllData() {
        return (List<SelectedColor>) selectedColorDao.findAll();
    }
}

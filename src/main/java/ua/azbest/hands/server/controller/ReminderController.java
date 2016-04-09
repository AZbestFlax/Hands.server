package ua.azbest.hands.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.azbest.hands.server.entity.Remind;
import ua.azbest.hands.server.services.ReminderService;

import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    private ReminderService service;

    @RequestMapping(value = "/ternopil", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/ternopil/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindID) {
        return service.getByID(remindID);
    }

    @RequestMapping(value = "/ternopil", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveRemider(@RequestBody Remind remind) {
        return service.save(remind);
    }

    @RequestMapping(value = "/ternopil/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}

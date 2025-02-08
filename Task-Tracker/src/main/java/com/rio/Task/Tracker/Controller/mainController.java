package com.rio.Task.Tracker.Controller;

import com.rio.Task.Tracker.Model.task;
import com.rio.Task.Tracker.Service.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tasks")
public class mainController {
        @Autowired
        private taskService ts;
        @GetMapping("/home")
        public String geeting(){
            return "welcome to Task Tracker";
        }

        //to add task
        @PostMapping("/add")
        public String add(@RequestBody task t){
            return ts.addtask(t);
        }
        // to add Multiple task
        @PostMapping("/addMultiple")
        public String addlist(@RequestBody List<task> moretask){
            return  ts.addMoreTask(moretask);
        }
        //to diplay  all task
        @GetMapping("/all")
        public List<task> show(){
            return ts.Allshowtask();
        }

        //to display who has a status  todo
        @GetMapping("/status/todo")
        public List<task> alltaskTodo(){
            return  ts.allshowtaskTodo();
        }
    //to display who has a status  in-progress
        @GetMapping("/status/in-progress")
        public List<task> alltaskpro(){
            return  ts.allshowtaskPro();
        }
    //to display who has a status  Done
        @GetMapping("/status/done")
        public List<task> alltaskDone(){
            return  ts.allshowtaskDone();
        }

        // Delete all task
        @DeleteMapping("/deleteAll")
        public  String dele(){
            return  ts.delAll();
        }

        // to delete task by id
        @DeleteMapping("/delete/{delid}")
        public  String deletebyid(@PathVariable int delid){
            return ts.delebyId(delid);
        }

        // to update task by id
        @PutMapping("/update/{upId}")
        public String updata(@PathVariable int upId, @RequestBody task uptask){
            return ts.updatetask(upId,uptask);
        }
}

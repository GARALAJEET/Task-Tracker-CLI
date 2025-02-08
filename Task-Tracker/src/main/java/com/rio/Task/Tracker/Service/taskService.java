package com.rio.Task.Tracker.Service;

import com.rio.Task.Tracker.Model.task;
import com.rio.Task.Tracker.Repo.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class taskService {
    @Autowired
    private repo r;
    public String addtask(task t){
        r.save(t);
        return "added";
    }
    public List<task> Allshowtask(){
        return  r.findAll();
    }
    public  String delebyId(int id){
                r.deleteById(id);
                return "deleted";
    }
    public  String delAll(){
                r.deleteAll();
        return "Delete all task";
    }
    public List<task> allshowtaskTodo() {
        List<task> cur_list = r.findAll();
        List<task> todo = new ArrayList<>();

        for (int i = 0; i < cur_list.size(); i++) {
            String cur = cur_list.get(i).getStatus();
            if (cur.equals("todo")) {
                todo.add(cur_list.get(i));
            }
        }
        return todo;
    }
    public List<task> allshowtaskPro() {
        List<task> cur_list = r.findAll();
        List<task> todo = new ArrayList<>();

        for (int i = 0; i < cur_list.size(); i++) {
            String cur = cur_list.get(i).getStatus();
            if (cur.equals("in-progress")) {
                todo.add(cur_list.get(i));
            }
        }
        return todo;
    }
    public List<task> allshowtaskDone() {
        List<task> cur_list = r.findAll();
        List<task> todo = new ArrayList<>();

        for (int i = 0; i < cur_list.size(); i++) {
            String cur = cur_list.get(i).getStatus();
            if (cur.equals("done")) {
                todo.add(cur_list.get(i));
            }
        }
        return todo;
    }

    public String updatetask(int upId,task uptask) {


        task cur_task = r.findById(upId).orElse(null);
        if (cur_task != null) {
            if (uptask.getStatus() != null) {
                cur_task.setStatus(uptask.getStatus());
            }
            if (uptask.getDescription() != null) {
                cur_task.setDescription(uptask.getDescription());
            }
            if (uptask.getUpdatedAt() != null) {
                cur_task.setUpdatedAt(uptask.getUpdatedAt());
            }

            r.save(cur_task);
            return "Task updated successfully";
        }
        return "ID not found";
    }

    public String addMoreTask(List<task> moretask) {
        for(int i=0;i<moretask.size();i++){
            task cur_task=moretask.get(i);
            r.save(cur_task);
        }
        return "All task added";
    }
}

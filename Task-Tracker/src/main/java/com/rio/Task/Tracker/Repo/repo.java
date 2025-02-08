package com.rio.Task.Tracker.Repo;

import com.rio.Task.Tracker.Model.task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo  extends JpaRepository<task,Integer > {

}

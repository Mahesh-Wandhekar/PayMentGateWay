package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Order.StudentOrder;

public interface StudentRepo extends JpaRepository<StudentOrder, Integer>{

	public StudentOrder findByRazorPayOrderId(String razorPayOrderId);
}

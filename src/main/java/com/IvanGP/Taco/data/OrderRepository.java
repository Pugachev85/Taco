package com.IvanGP.Taco.data;

import com.IvanGP.Taco.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}

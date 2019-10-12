package DAO;

import domain.Customer;

public interface CustomerDAO {
void save(Customer cus);
void delete(Customer cus);
void update(Customer cus);
}

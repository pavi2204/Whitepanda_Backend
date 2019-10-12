package DAO;

import domain.RentDetails;

public interface RentDAO 
{
void save(RentDetails rd);
void delete(RentDetails rd);
void update(RentDetails rd);
}

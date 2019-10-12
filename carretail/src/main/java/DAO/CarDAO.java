package DAO;

import domain.Cardetails;

public interface CarDAO {
void save(Cardetails c);
void delete(Cardetails c);
void update(Cardetails c);
}

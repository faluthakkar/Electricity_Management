package persistence;

import entity.Bill;

public interface BillDao {



        void remove(int id);

        public void add(Bill bill);

        public void update(Bill bill);
    }


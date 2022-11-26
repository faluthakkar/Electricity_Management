package persistence;

import entity.Bill;

public interface BillDao {



        void remove(int id);

        public int add(Bill bill);

        public void update(Bill bill);
    public void getBillDetails(Bill bill);
    }


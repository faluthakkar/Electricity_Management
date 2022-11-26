package persistence;

public interface BillDao {
    public interface BillDAOI {


        void remove(int id);

        public void add(int connectionId, int consumerId, int connectionTypeId, int oldReading, int newReading);

        public void update(int connectionId, int consumerId, int connectionTypeId, int oldReading, int newReading);
    }
}

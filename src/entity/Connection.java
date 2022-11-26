package entity;



    public class Connection
    {

        private int id;
        private int consumerId;
        private int connectionTypeId;
        private int oldReading;

        public int getConsumerId() {
            return consumerId;
        }

        public void setConsumerId(int consumerId) {
            this.consumerId = consumerId;
        }

        public Connection() {
            super();
            // TODO Auto-generated constructor stub
        }

        public Connection(int id, int consumerId, int connectionTypeId, int oldReading) {
            super();
            this.id = id;
            this.consumerId = consumerId;
            this.connectionTypeId = connectionTypeId;
            this.oldReading = oldReading;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }



        public int getConnectionTypeId() {
            return connectionTypeId;
        }

        public void setConnectionTypeId(int connectionTypeId) {
            this.connectionTypeId = connectionTypeId;
        }

        public int getOldReading() {
            return oldReading;
        }

        public void setOldReading(int oldReading) {
            this.oldReading = oldReading;
        }

            @Override
            public String toString() {
                return "Connection{" +
                        "id=" + id +
                        ", consumerId=" + consumerId +
                        ", connectionTypeId=" + connectionTypeId +
                        ", oldReading=" + oldReading +
                        '}';
            }
    }



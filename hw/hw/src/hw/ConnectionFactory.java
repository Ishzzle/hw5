package hw;

public class ConnectionFactory {
	public DataBaseConnection getConnection(String dataBase){
		if(dataBase == null){
		return null;
		}
		if(dataBase.equalsIgnoreCase("PostgresConnection")){
		return new PostgresConnection();
		} else if(dataBase.equalsIgnoreCase("MySqlConnection")){
			return new MySqlConnection();
		}

}

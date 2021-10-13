package verify;

public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}

class OracleDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("Oracle DB �˻�");}
	@Override
	public void insert() {System.out.println("Oracle DB ����");}
	@Override
	public void update() {System.out.println("Oracle DB ����");}
	@Override
	public void delete() {System.out.println("Oracle DB ����");}	
}
class MySQlDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("MySQl DB �˻�");}
	@Override
	public void insert() {System.out.println("MySQl DB ����");}
	@Override
	public void update() {System.out.println("MySQl DB ����");}
	@Override
	public void delete() {System.out.println("MySQl DB ����");}	
}

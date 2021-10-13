package verify;

public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}

class OracleDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("Oracle DB 검색");}
	@Override
	public void insert() {System.out.println("Oracle DB 저장");}
	@Override
	public void update() {System.out.println("Oracle DB 수정");}
	@Override
	public void delete() {System.out.println("Oracle DB 삭제");}	
}
class MySQlDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("MySQl DB 검색");}
	@Override
	public void insert() {System.out.println("MySQl DB 저장");}
	@Override
	public void update() {System.out.println("MySQl DB 수정");}
	@Override
	public void delete() {System.out.println("MySQl DB 삭제");}	
}

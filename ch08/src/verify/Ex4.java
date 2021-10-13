package verify;

public class Ex4 {
   public static void dbWork(DataAccessObject dao) {
	   dao.select();
	   dao.insert();
	   dao.update();
	   dao.delete();
   }
	
	
	public static void main(String[] args) {
	 dbWork(new OracleDao());
	 dbWork(new MySQlDao());
	 //dbWork의 매개변수로 DataAccessObject의 무명인터페이스를 선언하여 넘김
	 dbWork(new DataAccessObject() {
		@Override
		public void select() {
			System.out.println("조회");
		}
		@Override
		public void insert() {
			System.out.println("저장");	
		}
		@Override
		public void update() {
			System.out.println("수정");
		}
		@Override
		public void delete() {
			System.out.println("삭제");
		}
	 });//dbWork()끝.
	}
}

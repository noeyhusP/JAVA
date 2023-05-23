package thistisjava;
// 이것이 자바다 8-7
public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
    // 실제로 마이크로소프트에서 ODBC를 구현한 방식과 유사
}

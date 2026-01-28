package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam1 {
    public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "nameme786";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = "INSERT INTO test_members(name, age, dep_id) VALUES(?, ?, ?)";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);
            

			// (4)SQL実行
            pstmt.setString(1, "山田太郎");
            pstmt.setInt(2, 62);
			pstmt.setInt(3, 1);
			pstmt.executeUpdate();

            pstmt.setString(1, "佐藤花子");
            pstmt.setInt(2, 33);
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();

            pstmt.setString(1, "遠藤次郎");
            pstmt.setInt(2, 55);
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();


			// ※ここにSQL実行処理を書く

			// (5)結果の操作

            System.out.println("3件のデータを登録しました");

			// ※ここに結果の操作処理を書く

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
                if (pstmt !=null) {
                    pstmt.close();
                }
				// (6) メモリの解放(切断)
                if (con !=null) {

                    con.close();
                }
				
			} catch (Exception ex) {}
		}
	}

}

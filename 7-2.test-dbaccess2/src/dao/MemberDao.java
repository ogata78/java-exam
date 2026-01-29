package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "SELECT * FROM test_members ORDER BY id;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに全件検索処理を書く
			ResultSet rs = pstmt.executeQuery();

        // 結果を格納するリスト
        List<Member> memberList = new ArrayList<>();

        // ResultSetを1行ずつ処理
        while (rs.next()) {
            Member member = new Member();
            member.setId(rs.getInt("id"));
            member.setName(rs.getString("name"));
            member.setAge(rs.getInt("age"));
            member.setDepId(rs.getInt("dep_id"));
            memberList.add(member);
		}
		return memberList; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 */
	public void load(int id){
		Connection con = DBManager.createConnection();
		String sql = "SELECT * FROM test_members WHERE id = ?;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く

			  // 2. 「?」に引数の id をセット
            pstmt.setInt(1, id);
            
            // 3. SQLを実行し、結果（ResultSet）を取得
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                // 4. データが存在すれば Member インスタンスを生成して値をセット
                Member member = new Member();
                member.setId(rs.getInt("id"));
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
                member.setDepId(rs.getInt("dep_id"));
                 return;
				 //←コンパイルエラーを消すための処理なので必要なら書き換えてください
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO test_members (name, age, dep_id) VALUES (?, ?, ?);";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く

			 
            pstmt.setString(1, member.getName());  
            pstmt.setInt(2, member.getAge());     
            pstmt.setInt(3, member.getDepId());   
            
            
            int affectedRows = pstmt.executeUpdate();


			if (affectedRows == 1) {
                System.out.println("正常に1件登録されました。名前: " + member.getName());
            } else {
                // INSERTで1以外が返るケースは稀ですが、論理的なチェックとして有効です
                System.out.println("登録処理が完了しましたが、影響行数が期待（1）と異なります: " + affectedRows);
            }


			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}



	    /**
     * 指定したIDのメンバー情報を削除します。
     * @param id 削除したいメンバーのID
     */
    public void deleteById(int id) {
        Connection con = DBManager.createConnection();
        // 1. DELETE文を準備（WHERE句を忘れると全件削除されてしまうので注意！）
        String sql = "DELETE FROM test_members WHERE id = ?;";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            // 2. 「?」に引数の id をセット
            pstmt.setInt(1, id);
            
            // 3. 削除を実行
            int affectedRows = pstmt.executeUpdate();
            
            if (affectedRows == 0) {
                System.out.println("削除対象のIDが見つかりませんでした。");
            } else {
                System.out.println(affectedRows + " 件のデータを削除しました。");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("削除処理に失敗しました", e);
        } finally {
            DBManager.closeConnection(con);
        }
    }
}

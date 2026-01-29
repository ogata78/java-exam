package exam;

import java.lang.reflect.Member;
import java.util.List;

import dao.MemberDao;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

    public static void main(String[] args) {

        MemberDao dao = new MemberDao();

        
        List<Member> memberList = dao.findAll();

        
        for (Member member : memberList) {
            System.out.println( "ID：" + member.getid()+ " 名前：" + member.getName()+ " 年齢：" + member.getAge()  + " 部署ID：" + member.getDepId() );
        }
    }
}

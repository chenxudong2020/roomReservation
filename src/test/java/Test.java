import com.crc.Main;
import com.crc.api.*;
import com.crc.entity.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)

@SpringBootTest(classes = Main.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test {

    @Resource
    AccessToken accessToken;

    @Resource
    ListAdmin listAdmin;

    @Resource
    ListSub listSub;
    @Resource
    ListId listId;


    @Resource
    ListSubId listSubId;

    @Value("${appKey}")
    String appKey;

    @Value("${appSecret}")
    String appSecret;



    @org.junit.Test
    public void test(){
        AccessTokenIn accessTokenIn=new AccessTokenIn();
        accessTokenIn.setAppKey(appKey);
        accessTokenIn.setAppSecret(appSecret);
        AccessTokenOut accessTokenOut= accessToken.getAccessToken(accessTokenIn);
        String accessToken=accessTokenOut.getAccessToken();
        System.out.println(accessToken);
        ListSubOut listSubOut=listSub.listSub(accessToken);
        List<ListSubOut.ResultBean> listdepats= listSubOut.getResult();
        List<String> listUserIds=new ArrayList<>();
        for(ListSubOut.ResultBean bean:listdepats){
           String deptId=bean.getDept_id();
           getUserIds(deptId,listUserIds,accessToken);
        }
        System.out.println(listUserIds);
    }

    public void getUserIds(String deptId,List<String> list,String accessToken){
        ListSubIdIn listSubIdIn =new ListSubIdIn();
        listSubIdIn.setDept_id(Integer.parseInt(deptId));
        ListSubIdOut listSubIdOut=listSubId.listSub(accessToken,listSubIdIn);
        ListIdOut listIdOut=listId.listId(accessToken,listSubIdIn);
        list.addAll(listIdOut.getResult().getUserid_list());
        ListSubIdOut.ResultBean list2=listSubIdOut.getResult();
        List<String> listdepts=list2.getDept_id_list();
        for(String dept:listdepts){
             getUserIds(dept,list,accessToken);
        }


    }

}

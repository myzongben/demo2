import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.wzb.entity.Jiyixian;
import com.example.wzb.mapper.CommonMapper;
import com.example.wzb.service.JiyixianService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Test1 extends CommonTest {
    @Autowired
    private CommonMapper commonMapper;

    @Autowired
    private JiyixianService jiyixianService;
    @Test
    public void test(){
        List list = commonMapper.selectList(new QueryWrapper<>());

        System.out.println("list = " + list);
    }
    @Test
    public void test2(){
        //List<Jiyixian> jiyixians = jiyixianService.queryList();

        //System.out.println("list = " + jiyixians);
    }
}

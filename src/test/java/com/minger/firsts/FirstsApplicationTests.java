package com.minger.firsts;

import com.minger.firsts.domain.NodeTree;
import com.minger.firsts.iservice.INodeTreeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstsApplicationTests {
	@Autowired
	private INodeTreeService iNodeTreeService;
	@Test
	public void contextLoads() {
	}
	@Test
	public void testService() {
		NodeTree nodeTree = new NodeTree();
//		nodeTree.setId(6);
		nodeTree.setParentId(1);
		nodeTree.setName("测试3");
		iNodeTreeService.save(nodeTree);
		List<Integer> ids = new ArrayList<>();
		iNodeTreeService.delete(Arrays.asList());
	}


}

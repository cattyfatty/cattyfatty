package test.shoppingmall;

import test.shoppingmall.service.MemberService;

public class MemberDaoTest {

	public static void main(String[] args) {
		try {
			MemberService memberService = new MemberService();
			memberService.updateMemberGrade();
			/*ProductService productService = new ProductService();
			productService.showProduct();*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

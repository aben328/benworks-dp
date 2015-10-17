/**
 * 
 */
package com.javapatterns.proxy.cbf4life;

/**
 * @ClassName: XiMenQing
 * @Description: TODO(������һ�仰��������������)
 * @author bin.liu@xlands-inc.om
 * @date 2013-3-16 ����5:38:34
 */
public class XiMenQing {

	/* ˮ���������д�ģ������챻�˽������������һ���ѵ��������ˣ� �����ſ����� ,�Ϳ�ʼ������˺��£�������Ϊ�˽����Ĵ�����
	 * ���˲��ٺô��ѣ������Ǽ���һ�£� ���û���������м�ǣ�ߣ���������Ҫ�����ܳ�����˵�ĺܣ� */
	public static void main(String[] args) {
		// �����Žг���
		WangPo wangPo = new WangPo();

		// Ȼ���������˵����Ҫ���˽��� happy��Ȼ�����žͰ����������춪���ӵ��ǳ�Ϸ :
		wangPo.makeEyesWithMan(); // ����û����Ȼ������ʱ����������ʵ����ˬ�����˽���
		wangPo.happyWithMan();

		//////////////////////////////////////////
		// �ı�һ����ʷ�����ϱ������카�ߣ�
		JiaShi jiaShi = new JiaShi();
		wangPo = new WangPo(jiaShi); // ��������Ϊ���ϵĴ�����

		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
	}
}

/**
 * 
 */
package com.javapatterns.proxy.cbf4life;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you all.
 *         ����������ϴ����ˣ���̫���ˣ��Ǹ����˶������ϣ� ���������ǻ��о���ѽ������Ϊһ��Ů�˵Ĵ���
 */
public class WangPo implements KindWomen {
	private KindWomen kindWomen;

	public WangPo() { // Ĭ�ϵĻ������˽����Ĵ���
		this.kindWomen = new PanJinLian();
	}

	// ��������KindWomen���κ�һ��Ů�˵Ĵ���ֻҪ������һ����
	public WangPo(KindWomen kindWomen) {
		this.kindWomen = kindWomen;
	}

	public void happyWithMan() {
		this.kindWomen.happyWithMan(); // �Լ����ˣ��ɲ��ˣ�����������Ĵ���
	}

	public void makeEyesWithMan() {
		this.kindWomen.makeEyesWithMan(); // ������ô�������ˣ�˭���������ۣ���
	}

}

package Main;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Session8 {

	// ログ
	private static final Logger logger1 = Logger.getLogger(Session8.class.getName());
	private static final Log logger2 = LogFactory.getLog(Session8.class);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ログ(java.util.logging)
		logger1.finest("FNST");
		logger1.finer("FNR");
		logger1.fine("FN");
		logger1.config("CFG");
		// これ以降ではコンソールにも表示される
		logger1.info("INF");
		logger1.warning("WNG");
		logger1.severe("SVR");

		// ログ(org.apache.commons.logging)
		logger2.error("起動引数の数が異常: " + args.length);




	}

}

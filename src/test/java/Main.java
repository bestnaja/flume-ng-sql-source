import org.apache.flume.Context;
import org.apache.flume.EventDeliveryException;
import org.apache.flume.channel.MemoryChannel;
import org.keedio.flume.source.SQLSource;
import org.keedio.flume.source.SQLSourceHelper;

/**
 * Created by bestnaja on 10/2/16.
 */
public class Main {

    public static void main(String zzz[]) {

        Context context = new Context();
        context.put("status.file.name", "test.status");
        context.put("hibernate.connection.url", "jdbc:oracle:thin:kafkaconnect/kafkaconnect1@hk-dpora-2001:1521:XE");
        context.put("table", "VOTES");
        context.put("incremental.column.name", "ID");
        context.put("status.file.path", "/Users/bestnaja/Downloads/poc/flume/status");
        context.put("columns.to.select", "*");
        context.put("run.query.delay", "30000");
        context.put("batch.size", "100");
        context.put("max.rows", "100");
        context.put("incremental.value", "0");
        context.put("start.from", "0");
        context.put("bean.class", "com.agoda.adp.flume.beans.Votes");

        SQLSource s = new SQLSource();
        try {

            s.configure(context);
            s.start();
            s.process();

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            s.stop();
        }
    }
}

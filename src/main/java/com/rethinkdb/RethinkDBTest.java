package com.rethinkdb;

import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import junit.framework.TestCase;
import org.json.simple.JSONObject;

import java.util.Date;

public class RethinkDBTest extends TestCase {

    public static final RethinkDB r = RethinkDB.r;
    Connection<?> conn;

    public void setUp() throws Exception {
        super.setUp();
        conn = r.connection()
                .hostname("newton")
                .port(31157)
                .connect();
    }

    public void tearDown() throws Exception {
    }

    public void testBuildConnection() throws Exception {
        Long res = r.expr(3).run(conn);
        assert (res.equals(3L));
        Cursor resCursor = r.range(3, 9).map(r.range(2, 8), r.range(1, 7),
                (x, y, z) -> x.mul(y, z)).run(conn);
        assert (resCursor.hasNext());

        Boolean thing = r.expr(false).run(conn);
        Date date = r.now().run(conn);
        String str = r.expr("string").add("thing").run(conn);
        assert(str.equals("stringthing"));
        byte[] bytes = r.binary("Hey there").run(conn);
        assert(new String(bytes, "UTF-8")).equals("Hey there");
        String result = r.do_("Hiyas").run(conn);
        //JSONObject job = r.now().run(conn, new OptArgs().with("date_format", "raw"));
        JSONObject allresults = r.table("foo").getAll().optArg("index", "id").run(conn);
    }

}
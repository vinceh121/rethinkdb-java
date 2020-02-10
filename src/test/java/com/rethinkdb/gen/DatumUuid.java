// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Test.java
package com.rethinkdb.gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static com.rethinkdb.TestingCommon.*;
import com.rethinkdb.TestingFramework;

public class DatumUuid {
    // Test that UUIDs work
    Logger logger = LoggerFactory.getLogger(DatumUuid.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection conn;

    @Before
    public void setUp() throws Exception {
        logger.info("Setting up.");
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        logger.info("Tearing down.");
        r.db("rethinkdb").table("_debug_scratch").delete().run(conn);
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        conn.close(false);
    }

    // Matches Python's str() function, which we use.
    // TODO: We might want to handle this in a visit_Call in convert_tests.py instead.
    private static String str(long i) {
        return String.valueOf(i);
    }

    // A hack to concatenate two Lists -- see is_array_add in convert_tests.py.
    private static List concatList(List x, List y) {
        List ret = new ArrayList<Long>(x);
        ret.addAll(y);
        return ret;
    }

    // Autogenerated tests below

    @Test(timeout=120000)
    public void test() throws Exception {

        {
            // datum/uuid.yaml line #3
            /* uuid() */
            UUIDMatch expected_ = uuid();
            /* r.uuid() */
            logger.info("About to run line #3: r.uuid()");
            Object obtained = runOrCatch(r.uuid(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #3");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #3:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/uuid.yaml line #5
            /* uuid() */
            UUIDMatch expected_ = uuid();
            /* r.expr(r.uuid()) */
            logger.info("About to run line #5: r.expr(r.uuid())");
            Object obtained = runOrCatch(r.expr(r.uuid()),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #5");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #5:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/uuid.yaml line #7
            /* 'STRING' */
            String expected_ = "STRING";
            /* r.type_of(r.uuid()) */
            logger.info("About to run line #7: r.typeOf(r.uuid())");
            Object obtained = runOrCatch(r.typeOf(r.uuid()),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #7");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #7:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/uuid.yaml line #9
            /* true */
            Boolean expected_ = true;
            /* r.uuid().ne(r.uuid()) */
            logger.info("About to run line #9: r.uuid().ne(r.uuid())");
            Object obtained = runOrCatch(r.uuid().ne(r.uuid()),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #9");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #9:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/uuid.yaml line #11
            /* ('97dd10a5-4fc4-554f-86c5-0d2c2e3d5330') */
            String expected_ = "97dd10a5-4fc4-554f-86c5-0d2c2e3d5330";
            /* r.uuid('magic') */
            logger.info("About to run line #11: r.uuid('magic')");
            Object obtained = runOrCatch(r.uuid("magic"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #11");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #11:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/uuid.yaml line #13
            /* true */
            Boolean expected_ = true;
            /* r.uuid('magic').eq(r.uuid('magic')) */
            logger.info("About to run line #13: r.uuid('magic').eq(r.uuid('magic'))");
            Object obtained = runOrCatch(r.uuid("magic").eq(r.uuid("magic")),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #13");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #13:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/uuid.yaml line #15
            /* true */
            Boolean expected_ = true;
            /* r.uuid('magic').ne(r.uuid('beans')) */
            logger.info("About to run line #15: r.uuid('magic').ne(r.uuid('beans'))");
            Object obtained = runOrCatch(r.uuid("magic").ne(r.uuid("beans")),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #15");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #15:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // datum/uuid.yaml line #17
            /* 10 */
            Long expected_ = 10L;
            /* r.expr([1,2,3,4,5,6,7,8,9,10]).map(lambda u:r.uuid()).distinct().count() */
            logger.info("About to run line #17: r.expr(r.array(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L)).map(u -> r.uuid()).distinct().count()");
            Object obtained = runOrCatch(r.expr(r.array(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L)).map(u -> r.uuid()).distinct().count(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #17");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #17:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}

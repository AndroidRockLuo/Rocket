package cn.hikyson.rocket.sample;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import cn.hikyson.rocket.helper.DefaultPriorityThreadFactory;

/**
 * Created by kysonchao on 2017/12/28.
 */
public class Execs {
    public static Executor io = Executors.newCachedThreadPool(new DefaultPriorityThreadFactory());
}

package kafeihu.zk.eggplant.executor;

import kafeihu.zk.eggplant.api.MulExecutorService;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;


public abstract class AbstractMulExecutorService implements MulExecutorService{

    protected ThreadPoolExecutor executor;


    @Override
    public boolean isShutdown() {
        return executor.isShutdown();
    }

    @Override
    public void shutdown() {
        executor.shutdown();
    }


    @Override
    public <T> List<Future<T>> submit(Collection<? extends Callable<T>> callables) {
        return null;
    }

    @Override
    public void execute(Collection<? extends Runnable> runnables) {

    }
}

package kafeihu.zk.eggplant.api;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface MulExecutorService extends MulExecutor{

    boolean isShutdown();

    void shutdown();

    <T> List<Future<T>> submit(Collection<? extends Callable<T>> callables);

    <T> List<Future<T>> submitBegin(Collection<? extends Callable<T>> callables);

    <T> List<Future<T>> submitEnd(Collection<? extends Callable<T>> callables);

}

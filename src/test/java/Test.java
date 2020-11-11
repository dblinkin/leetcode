import java.util.concurrent.CompletableFuture;

public class Test {

    @org.junit.Test
    public void test() throws Exception {

        CompletableFuture<Integer> s = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 100;
        });

        CompletableFuture<Integer> s2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 200;
        });

        s.thenCombine(s2, (a1, a2) -> {
            return a1 + a2;
        }).whenComplete((a, t) -> {
            System.out.println("bbbbbbbbbb");
            System.out.println(a);
        });

        System.out.println("aaaaaaaaaa");

        Thread.sleep(12000);


    }

}

package ejemplorxj;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class App {

	public static void main(String[] args) {
		Observable<String> messageSender= Observable.just("Mensaje1", "Mensaje2", "Mensaje3");
		
		messageSender.subscribe(new Observer() {

			public void onSubscribe(Disposable d) {
				System.out.println("Observer1. Suscribed");
			}

			public void onNext(Object t) {
				System.out.println("Observer1. Received " + t);
				
			}

			public void onError(Throwable e) {
				System.out.println("Observer1. Error: "+e.getMessage());
			}

			public void onComplete() {
				System.out.println("Observer1. Completed");
				
			}
			
		});
		messageSender.subscribe(new Observer() {

			public void onSubscribe(Disposable d) {
				System.out.println("Observer2. Suscribed");
			}

			public void onNext(Object t) {
				System.out.println("Observer2. Received " + t);
				
			}

			public void onError(Throwable e) {
				System.out.println("Observer2. Error: "+e.getMessage());
			}

			public void onComplete() {
				System.out.println("Observer2. Completed");
				
			}
			
		});

	}

}

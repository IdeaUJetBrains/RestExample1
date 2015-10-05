package test.IDEA119747_IDEA130052;

/**
 * Created by Olga Pavlova on 10/2/2015.
 */
 public class ServiceKeeper {
        private static ServiceKeeper instance = null;
        protected ServiceKeeper() {
            // Exists only to defeat instantiation.
        }
        public static ServiceKeeper getInstance() {
            if(instance == null) {
                instance = new ServiceKeeper();
            }
            return instance;
        }
}

(ns org.deeplearning4j.spark.parameterserver.util.BlockingObserver
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.util BlockingObserver]))

(defn ->blocking-observer
  "Constructor.

  exception - `java.util.concurrent.atomic.AtomicBoolean`"
  (^BlockingObserver [^java.util.concurrent.atomic.AtomicBoolean exception]
    (new BlockingObserver exception)))

(defn update
  "o - `java.util.Observable`
  arg - `java.lang.Object`"
  ([^BlockingObserver this ^java.util.Observable o ^java.lang.Object arg]
    (-> this (.update o arg))))

(defn wait-till-done
  "This method blocks until state is set to True

  throws: java.lang.InterruptedException"
  ([^BlockingObserver this]
    (-> this (.waitTillDone))))


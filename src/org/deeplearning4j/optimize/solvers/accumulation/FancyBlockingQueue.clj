(ns org.deeplearning4j.optimize.solvers.accumulation.FancyBlockingQueue
  "This BlockingQueue implementation is suited only for symmetric gradients updates, and should NOT be used anywhere else.
 Basic idea: all worker threads requesting via poll()/take() method will be advancing only once all consumers get the same element from Queue.
 So, multiple consumers are guaranteed to be consuming the same elements in the same order served by this queue."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation FancyBlockingQueue]))

(defn ->fancy-blocking-queue
  "Constructor.

  queue - `java.util.concurrent.BlockingQueue`
  consumers - `int`"
  (^FancyBlockingQueue [^java.util.concurrent.BlockingQueue queue ^Integer consumers]
    (new FancyBlockingQueue queue consumers))
  (^FancyBlockingQueue [^java.util.concurrent.BlockingQueue queue]
    (new FancyBlockingQueue queue)))

(defn add-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^FancyBlockingQueue this ^java.util.Collection c]
    (-> this (.addAll c))))

(defn peek
  "returns: `E`"
  ([^FancyBlockingQueue this]
    (-> this (.peek))))

(defn offer
  "e - `E`
  timeout - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^FancyBlockingQueue this e ^Long timeout ^java.util.concurrent.TimeUnit unit]
    (-> this (.offer e timeout unit)))
  (^Boolean [^FancyBlockingQueue this e]
    (-> this (.offer e))))

(defn put
  "e - `E`

  throws: java.lang.InterruptedException"
  ([^FancyBlockingQueue this e]
    (-> this (.put e))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FancyBlockingQueue this ^java.lang.Object o]
    (-> this (.contains o))))

(defn take
  "returns: `E`

  throws: java.lang.InterruptedException"
  ([^FancyBlockingQueue this]
    (-> this (.take))))

(defn iterator
  "returns: `java.util.Iterator<E>`"
  (^java.util.Iterator [^FancyBlockingQueue this]
    (-> this (.iterator))))

(defn element
  "returns: `E`"
  ([^FancyBlockingQueue this]
    (-> this (.element))))

(defn register-consumers
  "Description copied from interface: Registerable

  consumers - `int`"
  ([^FancyBlockingQueue this ^Integer consumers]
    (-> this (.registerConsumers consumers))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FancyBlockingQueue this ^java.lang.Object o]
    (-> this (.remove o)))
  ([^FancyBlockingQueue this]
    (-> this (.remove))))

(defn drain-to
  "c - `java.util.Collection`
  max-elements - `int`

  returns: `int`"
  (^Integer [^FancyBlockingQueue this ^java.util.Collection c ^Integer max-elements]
    (-> this (.drainTo c max-elements)))
  (^Integer [^FancyBlockingQueue this ^java.util.Collection c]
    (-> this (.drainTo c))))

(defn poll
  "timeout - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `E`

  throws: java.lang.InterruptedException"
  ([^FancyBlockingQueue this ^Long timeout ^java.util.concurrent.TimeUnit unit]
    (-> this (.poll timeout unit)))
  ([^FancyBlockingQueue this]
    (-> this (.poll))))

(defn fallback-to-single-consumer-mode
  "Description copied from interface: Registerable

  really-fallback - `boolean`"
  ([^FancyBlockingQueue this ^Boolean really-fallback]
    (-> this (.fallbackToSingleConsumerMode really-fallback))))

(defn remaining-capacity
  "returns: `int`"
  (^Integer [^FancyBlockingQueue this]
    (-> this (.remainingCapacity))))

(defn add
  "e - `E`

  returns: `boolean`"
  (^Boolean [^FancyBlockingQueue this e]
    (-> this (.add e))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^FancyBlockingQueue this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^FancyBlockingQueue this]
    (-> this (.size))))

(defn retain-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^FancyBlockingQueue this ^java.util.Collection c]
    (-> this (.retainAll c))))

(defn clear
  ""
  ([^FancyBlockingQueue this]
    (-> this (.clear))))

(defn to-array
  "a - `T[]`

  returns: `<T> T[]`"
  ([^FancyBlockingQueue this a]
    (-> this (.toArray a)))
  ([^FancyBlockingQueue this]
    (-> this (.toArray))))

(defn remove-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^FancyBlockingQueue this ^java.util.Collection c]
    (-> this (.removeAll c))))

(defn contains-all
  "c - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^FancyBlockingQueue this ^java.util.Collection c]
    (-> this (.containsAll c))))


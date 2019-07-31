(ns org.nd4j.linalg.factory.RandomFactory
  "This class acts as factory for new Random objects and thread-isolated holder for previously created Random instances"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory RandomFactory]))

(defn ->random-factory
  "Constructor.

  random-class - `java.lang.Class`"
  (^RandomFactory [^java.lang.Class random-class]
    (new RandomFactory random-class)))

(defn get-random
  "This method returns Random implementation instance associated with calling thread

  returns: object implementing Random interface - `org.nd4j.linalg.api.rng.Random`"
  (^org.nd4j.linalg.api.rng.Random [^RandomFactory this]
    (-> this (.getRandom))))

(defn get-new-random-instance
  "This method returns new onject implementing Random interface, initialized with seed value, with size of elements in buffer

  seed - rng seed - `long`
  size - size of underlying buffer - `long`

  returns: object implementing Random interface - `org.nd4j.linalg.api.rng.Random`"
  (^org.nd4j.linalg.api.rng.Random [^RandomFactory this ^Long seed ^Long size]
    (-> this (.getNewRandomInstance seed size)))
  (^org.nd4j.linalg.api.rng.Random [^RandomFactory this ^Long seed]
    (-> this (.getNewRandomInstance seed)))
  (^org.nd4j.linalg.api.rng.Random [^RandomFactory this]
    (-> this (.getNewRandomInstance))))

